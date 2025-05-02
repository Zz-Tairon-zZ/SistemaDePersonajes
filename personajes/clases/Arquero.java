package modelo.personajes.clases;

import interfaces.Movilizable;
import interfaces.Volador;
import modelo.personajes.PersonajeFisico;

/**
 * Clase que representa a un personaje de tipo Arquero
 */
public class Arquero extends PersonajeFisico implements Volador, Movilizable {
    private int agilidad;
    private int numFlechas;

    /**
     * Constructor para la clase Arquero
     *
     * @param nombre Nombre del arquero
     * @param nivel Nivel del arquero
     * @param salud Puntos de salud del arquero
     */
    public Arquero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Implementación del método atacar específico para el arquero
     */
    @Override
    public void atacar() {
        if (numFlechas > 0) {
            super.atacar(); // Usando super.atacar()
            System.out.println(nombre + " tensa su arco y suelta la flecha. Daño físico: " + poderFisico + ", Agilidad: " + agilidad);
            numFlechas--;
            System.out.println("Flechas restantes: " + numFlechas);
        } else {
            System.out.println(nombre + " no tiene flechas para atacar!");
        }
    }

    /**
     * Implementación del método volar de la interfaz Volador
     */
    @Override
    public void volar() {
        System.out.println(nombre + " utiliza su capa mágica para planear en el aire momentáneamente.");
    }

    /**
     * Implementación del método moverse de la interfaz Movilizable
     */
    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve rápidamente gracias a su agilidad de " + agilidad);
    }

    /**
     * Método específico del arquero para disparar una flecha
     */
    public void dispararFlecha() {
        if (numFlechas > 0) {
            System.out.println(nombre + " dispara una flecha con precisión!");
            numFlechas--;
        } else {
            System.out.println(nombre + " no tiene flechas disponibles.");
        }
    }

    /**
     * Método específico del arquero para reabastecer flechas
     */
    public void reabastecerFlechas() {
        int nuevasFlechas = 5;
        numFlechas += nuevasFlechas;
        System.out.println(nombre + " reabastece " + nuevasFlechas + " flechas. Total: " + numFlechas);
    }

    // Getters y setters
    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    public void setNumFlechas(int numFlechas) {
        this.numFlechas = numFlechas;
    }
}