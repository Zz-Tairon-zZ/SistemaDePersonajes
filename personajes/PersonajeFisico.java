package modelo.personajes;

/**
 * Clase abstracta intermedia que representa a un personaje de combate físico
 */
public abstract class PersonajeFisico extends Personaje {
    protected int poderFisico;

    /**
     * Constructor para la clase PersonajeFisico
     *
     * @param nombre Nombre del personaje
     * @param nivel Nivel del personaje
     * @param salud Puntos de salud del personaje
     */
    public PersonajeFisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    /**
     * Método propio no abstracto que aumenta el poder físico del personaje
     */
    public void entrenarFuerza() {
        this.poderFisico += 2;
        System.out.println(nombre + " ha entrenado y aumentado su poder físico a " + poderFisico);
    }

    /**
     * Implementación del método atacar para personajes físicos
     */
    @Override
    public void atacar() {
        System.out.println(nombre + " está preparando un ataque físico. Poder: " + poderFisico);
    }

    // Getter y setter
    public int getPoderFisico() {
        return poderFisico;
    }

    public void setPoderFisico(int poderFisico) {
        this.poderFisico = poderFisico;
    }
}