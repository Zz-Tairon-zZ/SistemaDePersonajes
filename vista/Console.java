package vista;

import java.util.Scanner;

/**
 * Clase que maneja la interfaz de consola para el juego
 */
public class Console {
    private final Scanner scanner;

    /**
     * Constructor que inicializa el scanner para entrada de usuario
     */
    public Console() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Muestra un mensaje en la consola
     * @param mensaje Mensaje a mostrar
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Muestra un mensaje de error en la consola
     * @param mensaje Mensaje de error a mostrar
     */
    public void mostrarError(String mensaje) {
        System.out.println("[ERROR] " + mensaje);
    }

    /**
     * Muestra un título en la consola
     * @param titulo Título a mostrar
     */
    public void mostrarTitulo(String titulo) {
        System.out.println(titulo);
    }

    /**
     * Muestra un subtítulo en la consola
     * @param subtitulo Subtítulo a mostrar
     */
    public void mostrarSubtitulo(String subtitulo) {
        System.out.println(subtitulo);
    }

    /**
     * Lee una cadena de texto ingresada por el usuario
     * @param mensaje Mensaje de solicitud
     * @return Cadena ingresada por el usuario
     */
    public String leerString(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }

    /**
     * Lee un número entero ingresado por el usuario
     * @param mensaje Mensaje de solicitud
     * @return Número entero ingresado por el usuario
     */
    public int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                mostrarError("Por favor, ingresa un número válido.");
            }
        }
    }

    /**
     * Muestra un menú de opciones y devuelve la opción seleccionada
     * @param titulo Título del menú
     * @param opciones Array de opciones a mostrar
     * @return Índice de la opción seleccionada (1-based)
     */
    public int mostrarMenu(String titulo, String[] opciones) {
        mostrarTitulo(titulo);
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }

        int opción = 0;
        while (opción < 1 || opción > opciones.length) {
            opción = leerEntero("Selecciona una opción (1-" + opciones.length + ")");
            if (opción < 1 || opción > opciones.length) {
                mostrarError("Opción no válida. Intenta de nuevo.");
            }
        }

        return opción;
    }

    /**
     * Muestra información detallada de un objeto
     * @param titulo Título de la información
     * @param info Información a mostrar
     */
    public void mostrarInfo(String titulo, String info) {
        mostrarTitulo("\n=== " + titulo + " ===");
        mostrarMensaje(info);
    }

    /**
     * Espera a que el usuario presione Enter para continuar
     */
    public void esperarEnter() {
        mostrarMensaje("\nPresiona Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * Cierra el scanner cuando ya no se necesita
     */
    public void cerrar() {
        scanner.close();
    }
}