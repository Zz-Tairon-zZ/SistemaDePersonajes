package modelo.personajes.clases;

import interfaces.Defendible;
import modelo.personajes.PersonajeFisico;

/**
 * Clase que representa a un personaje de tipo Guerrero
 */
public class Guerrero extends PersonajeFisico implements Defendible {
    private int fuerza;
    private int armadura;

    /**
     * Constructor para la clase Guerrero
     *
     * @param nombre Nombre del guerrero
     * @param nivel Nivel del guerrero
     * @param salud Puntos de salud del guerrero
     */
    public Guerrero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Implementación del método atacar específico para el guerrero
     */
    @Override
    public void atacar() {
        super.atacar(); // Usando super.atacar()
        System.out.println(nombre + " levanta su hacha y ataca. Daño físico: " + poderFisico + ", Fuerza: " + fuerza);
    }

    /**
     * Implementación del método defender de la interfaz Defendible
     */
    @Override
    public void defender() {
        System.out.println(nombre + " se está defendiendo con su escudo. Armadura: " + armadura);
    }

    /**
     * Método específico del guerrero para cargar un ataque
     */
    public void cargarAtaque() {
        System.out.println(nombre + " está cargando un ataque poderoso!");
    }

    // Getters y setters
    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}