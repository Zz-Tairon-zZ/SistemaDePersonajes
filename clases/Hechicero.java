package modelo.personajes.clases;

import interfaces.Defendible;
import interfaces.Magico;
import modelo.personajes.PersonajeMágico;

/**
 * Clase que representa a un personaje de tipo Hechicero
 */
public class Hechicero extends PersonajeMágico implements Magico, Defendible {
    private int mana;
    private int concentración;

    /**
     * Constructor para la clase Hechicero
     *
     * @param nombre Nombre del hechicero
     * @param nivel Nivel del hechicero
     * @param salud Puntos de salud del hechicero
     */
    public Hechicero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Implementación del método atacar específico para el hechicero
     */
    @Override
    public void atacar() {
        super.atacar(); // Usando super.atacar()
        System.out.println(nombre + " alza su bastón e invoca un hechizo oscuro. Daño mágico: " + poderMágico + ", Concentración: " + concentración);
    }

    /**
     * Implementación del método lanzarHechizo de la interfaz Mágico
     */
    @Override
    public void lanzarHechizo() {
        if (mana >= 7) {
            System.out.println(nombre + " lanza un hechizo de hielo! Consume 7 de mana.");
            mana -= 7;
        } else {
            System.out.println(nombre + " no tiene suficiente mana para lanzar un hechizo.");
        }
    }

    /**
     * Implementación del método defender de la interfaz Defendible
     */
    @Override
    public void defender() {
        System.out.println(nombre + " crea una barrera mágica para defenderse. Concentración: " + concentración);
    }

    /**
     * Método específico del hechicero para invocar entidades
     */
    public void invocarEntidad() {
        if (mana >= 15) {
            System.out.println(nombre + " invoca una entidad mágica para ayudarle. Consume 15 de mana.");
            mana -= 15;
        } else {
            System.out.println(nombre + " no tiene suficiente mana para invocar una entidad.");
        }
    }

    // Getters y setters
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getConcentración() {
        return concentración;
    }

    public void setConcentración(int concentración) {
        this.concentración = concentración;
    }
}