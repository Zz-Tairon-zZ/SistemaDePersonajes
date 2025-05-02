package modelo.personajes.clases;

import interfaces.Curable;
import interfaces.Movilizable;
import modelo.personajes.PersonajeFisico;

/**
 * Clase que representa a un personaje de tipo Asesino
 */
public class Asesino extends PersonajeFisico implements Movilizable, Curable {
    private int sigilo;
    private int critico;

    /**
     * Constructor para la clase Asesino
     *
     * @param nombre Nombre del asesino
     * @param nivel Nivel del asesino
     * @param salud Puntos de salud del asesino
     */
    public Asesino(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Implementación del método atacar específico para el asesino
     */
    @Override
    public void atacar() {
        super.atacar(); // Usando super.atacar()
        System.out.println(nombre + " prepara sus dagas y ataca desde las sombras. Daño físico: " + poderFisico + ", Crítico: " + critico);
    }

    /**
     * Implementación del método curar de la interfaz Curable
     */
    @Override
    public void curar() {
        System.out.println(nombre + " utiliza una poción para curarse 15 puntos de salud.");
        salud += 15;
    }

    /**
     * Implementación del método moverse de la interfaz Movilizable
     */
    @Override
    public void moverse() {
        System.out.println(nombre + " se mueve sigilosamente con un nivel de sigilo de " + sigilo);
    }

    /**
     * Método específico del asesino para atacar por la espalda
     */
    public void atacarPorLaEspalda() {
        int dañoBonus = critico / 2;
        System.out.println(nombre + " ataca por la espalda causando daño adicional de " + dañoBonus);
    }

    /**
     * Método específico del asesino para ocultarse
     */
    public void ocultar() {
        System.out.println(nombre + " se oculta en las sombras aumentando temporalmente su sigilo.");
        sigilo += 5;
    }

    // Getters y setters
    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getSigilo() {
        return sigilo;
    }

    public void setSigilo(int sigilo) {
        this.sigilo = sigilo;
    }
}