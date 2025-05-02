package modelo.personajes.clases;

import interfaces.Curable;
import interfaces.Magico;
import modelo.personajes.PersonajeMágico;

/**
 * Clase que representa a un personaje de tipo Mago
 */
public class Mago extends PersonajeMágico implements Magico, Curable {
    private int mana;
    private int sabiduría;

    /**
     * Constructor para la clase Mago
     *
     * @param nombre Nombre del mago
     * @param nivel Nivel del mago
     * @param salud Puntos de salud del mago
     */
    public Mago(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Implementación del método atacar específico para el mago
     */
    @Override
    public void atacar() {
        super.atacar(); // Usando super.atacar()
        System.out.println(nombre + " alza su varita e invoca un hechizo. Daño mágico: " + poderMágico + ", Sabiduría: " + sabiduría);
    }

    /**
     * Implementación del método lanzarHechizo de la interfaz Mágico
     */
    @Override
    public void lanzarHechizo() {
        if (mana >= 5) {
            System.out.println(nombre + " lanza un hechizo de fuego! Consume 5 de mana.");
            mana -= 5;
        } else {
            System.out.println(nombre + " no tiene suficiente mana para lanzar un hechizo.");
        }
    }

    /**
     * Implementación del método curar de la interfaz Curable
     */
    @Override
    public void curar() {
        if (mana >= 10) {
            System.out.println(nombre + " se cura 20 puntos de salud. Consume 10 de mana.");
            salud += 20;
            mana -= 10;
        } else {
            System.out.println(nombre + " no tiene suficiente mana para curarse.");
        }
    }

    /**
     * Método específico del mago para regenerar mana
     */
    public void regenerarMana() {
        int recuperación = sabiduría / 3;
        mana += recuperación;
        System.out.println(nombre + " regenera " + recuperación + " puntos de mana. Mana actual: " + mana);
    }

    // Getters y setters
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setSabiduría(int sabiduría) {
        this.sabiduría = sabiduría;
    }

    public int getSabiduría() {
        return sabiduría;
    }
}