import controlador.Batalla;
import controlador.Juego;
import modelo.personajes.clases.*;

/**
 * Clase principal que inicia la aplicación del juego de rol
 */
public class Main {

    public static void main(String[] args) {
        // Crear personajes
        Guerrero guerrero = new Guerrero("Aragorn", 10, 150);
        guerrero.setFuerza(17);
        guerrero.setArmadura(15);

        Mago mago = new Mago("Gandalf", 15, 100);
        mago.setMana(18);
        mago.setSabiduría(15);
        mago.setPoderMágico(20);

        Arquero arquero = new Arquero("Legolas", 12, 120);
        arquero.setAgilidad(15);
        arquero.setNumFlechas(20);
        arquero.setPoderFisico(15);

        Hechicero hechicero = new Hechicero("Saruman", 14, 110);
        hechicero.setMana(15);
        hechicero.setConcentración(17);
        hechicero.setPoderMágico(18);

        Asesino asesino = new Asesino("Ezio", 11, 130);
        asesino.setSigilo(15);
        asesino.setCritico(17);
        asesino.setPoderFisico(16);

        // Crear instancia de juego y añadir personajes
        Juego juego = new Juego();
        juego.agregarPersonaje(guerrero);
        juego.agregarPersonaje(mago);
        juego.agregarPersonaje(arquero);
        juego.agregarPersonaje(hechicero);
        juego.agregarPersonaje(asesino);

        // Mostrar acciones de los personajes
        juego.mostrarAcciones();

        // Opcional: Crear una batalla
        Batalla batalla = new Batalla(guerrero, mago);
        batalla.iniciarCombate();
    }
}