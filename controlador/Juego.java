package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.personajes.Personaje;
import interfaces.Curable;
import interfaces.Defendible;
import interfaces.Magico;
import interfaces.Movilizable;
import interfaces.Volador;
import modelo.personajes.clases.Guerrero;
import modelo.personajes.clases.Mago;
import modelo.personajes.clases.Arquero;
import modelo.personajes.clases.Hechicero;
import modelo.personajes.clases.Asesino;
import vista.Console;

/**
 * Clase principal que gestiona los personajes del juego
 */
public class Juego {
    private final ArrayList<Personaje> personajes;
    private final Console console;

    /**
     * Constructor para inicializar un nuevo juego
     */
    public Juego() {
        this.personajes = new ArrayList<>();
        this.console = new Console();
    }

    /**
     * Añade un personaje a la lista de personajes del juego
     * @param personaje Personaje a añadir
     */
    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
        console.mostrarMensaje("Se ha añadido " + personaje.getNombre() + " al juego.");
    }

    /**
     * Muestra las acciones disponibles para cada personaje
     */
    public void mostrarAcciones() {
        console.mostrarTitulo("\n====== ACCIONES DE LOS PERSONAJES ======");

        for (Personaje personaje : personajes) {
            console.mostrarSubtitulo("\n--- " + personaje.getNombre() + " ---");
            personaje.atacar();

            // Usar instanceof para ejecutar habilidades específicas
            if (personaje instanceof Defendible) {
                ((Defendible) personaje).defender();
            }

            if (personaje instanceof Magico) {
                ((Magico) personaje).lanzarHechizo();
            }

            if (personaje instanceof Volador) {
                ((Volador) personaje).volar();
            }

            if (personaje instanceof Curable) {
                ((Curable) personaje).curar();
            }

            if (personaje instanceof Movilizable) {
                ((Movilizable) personaje).moverse();
            }

            // Casos específicos para mostrar métodos propios
            if (personaje instanceof Guerrero) {
                ((Guerrero) personaje).cargarAtaque();
            } else if (personaje instanceof Mago) {
                ((Mago) personaje).regenerarMana();
            } else if (personaje instanceof Arquero) {
                ((Arquero) personaje).reabastecerFlechas();
            } else if (personaje instanceof Hechicero) {
                ((Hechicero) personaje).invocarEntidad();
            } else if (personaje instanceof Asesino) {
                ((Asesino) personaje).ocultar();
            }
        }

        // Ejemplo de polimorfismo con colecciones de interfaces
        console.mostrarTitulo("\n====== PERSONAJES CURABLES ======");
        List<Curable> personajesCurables = new ArrayList<>();

        for (Personaje personaje : personajes) {
            if (personaje instanceof Curable) {
                personajesCurables.add((Curable) personaje);
            }
        }

        for (Curable personaje : personajesCurables) {
            personaje.curar();
        }
    }

    /**
     * Devuelve la lista de personajes
     * @return Lista de personajes
     */
    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    /**
     * Busca un personaje por su nombre
     * @param nombre Nombre del personaje a buscar
     * @return Personaje encontrado o null si no existe
     */
    public Personaje buscarPersonaje(String nombre) {
        for (Personaje personaje : personajes) {
            if (personaje.getNombre().equalsIgnoreCase(nombre)) {
                return personaje;
            }
        }
        return null;
    }

    /**
     * Elimina un personaje de la lista
     * @param personaje Personaje a eliminar
     * @return true si se eliminó correctamente, false en caso contrario
     */
    public boolean eliminarPersonaje(Personaje personaje) {
        if (personajes.contains(personaje)) {
            personajes.remove(personaje);
            console.mostrarMensaje("Se ha eliminado a " + personaje.getNombre() + " del juego.");
            return true;
        }
        console.mostrarError("No se pudo eliminar al personaje, no existe en el juego.");
        return false;
    }
}