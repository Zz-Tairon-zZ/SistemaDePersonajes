package controlador;

import modelo.personajes.PersonajeFisico;
import modelo.personajes.clases.*;
import modelo.personajes.Personaje;
import interfaces.Curable;
import modelo.personajes.PersonajeMágico;

/**
 * Clase que gestiona una batalla entre dos personajes
 */
public class Batalla {
    private final Personaje personaje1;
    private final Personaje personaje2;
    private int turno;

    /**
     * Constructor para iniciar una batalla entre dos personajes
     * @param personaje1 Primer personaje de la batalla
     * @param personaje2 Segundo personaje de la batalla
     */
    public Batalla(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.turno = 1;
    }

    /**
     * Inicia el combate entre los dos personajes
     */
    public void iniciarCombate() {
        System.out.println("\n====== INICIO DE BATALLA ======");
        System.out.println(personaje1.getNombre() + " (Salud: " + personaje1.getSalud() + ") VS " +
                personaje2.getNombre() + " (Salud: " + personaje2.getSalud() + ")");

        while (personaje1.getSalud() > 0 && personaje2.getSalud() > 0 && turno <= 5) {
            System.out.println("\n--- Turno " + turno + " ---");

            // Ataque del personaje 1
            System.out.println(personaje1.getNombre() + " ataca:");
            personaje1.atacar();
            int daño1 = calcularDaño(personaje1);
            personaje2.setSalud(personaje2.getSalud() - daño1);
            System.out.println(personaje2.getNombre() + " recibe " + daño1 + " de daño. Salud restante: " + personaje2.getSalud());

            // Verificar si el personaje 2 ha sido derrotado
            if (personaje2.getSalud() <= 0) {
                System.out.println(personaje2.getNombre() + " ha sido derrotado!");
                break;
            }

            // Ataque del personaje 2
            System.out.println(personaje2.getNombre() + " ataca:");
            personaje2.atacar();
            int daño2 = calcularDaño(personaje2);
            personaje1.setSalud(personaje1.getSalud() - daño2);
            System.out.println(personaje1.getNombre() + " recibe " + daño2 + " de daño. Salud restante: " + personaje1.getSalud());

            // Verificar si el personaje 1 ha sido derrotado
            if (personaje1.getSalud() <= 0) {
                System.out.println(personaje1.getNombre() + " ha sido derrotado!");
                break;
            }

            // Curación si los personajes son curables
            if (personaje1 instanceof Curable && turno % 2 == 0) {
                System.out.println(personaje1.getNombre() + " intenta curarse:");
                ((Curable) personaje1).curar();
            }

            if (personaje2 instanceof Curable && turno % 2 == 0) {
                System.out.println(personaje2.getNombre() + " intenta curarse:");
                ((Curable) personaje2).curar();
            }

            turno++;
        }

        // Resultado final
        if (personaje1.getSalud() <= 0) {
            System.out.println("\n¡" + personaje2.getNombre() + " ha ganado la batalla!");
        } else if (personaje2.getSalud() <= 0) {
            System.out.println("\n¡" + personaje1.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println("\nLa batalla ha terminado en empate después de " + (turno - 1) + " turnos.");
        }
    }

    /**
     * Calcula el daño que inflige un personaje
     * @param personaje Personaje que realiza el ataque
     * @return Cantidad de daño calculado
     */
    private int calcularDaño(Personaje personaje) {
        int daño = 0;

        if (personaje instanceof PersonajeFisico) {
            daño = ((PersonajeFisico) personaje).getPoderFisico() + personaje.getNivel() * 2;

            switch (personaje) {
                case Guerrero guerrero -> daño += guerrero.getFuerza() / 2;
                case Asesino asesino -> daño += asesino.getCritico() / 2;
                case Arquero arquero -> daño += arquero.getAgilidad() / 3;
                default -> {
                }
            }
        } else if (personaje instanceof PersonajeMágico) {
            daño = ((PersonajeMágico) personaje).getPoderMágico() + personaje.getNivel() * 2;

            if (personaje instanceof Mago) {
                daño += ((Mago) personaje).getSabiduría() / 2;
            } else if (personaje instanceof Hechicero) {
                daño += ((Hechicero) personaje).getConcentración() / 2;
            }
        }

        return Math.max(5, daño); // Al menos 5 de daño
    }
}