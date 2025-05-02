package modelo.personajes;

/**
 * Clase abstracta que representa a un personaje genérico del juego
 */
public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int salud;

    /**
     * Constructor para la clase Personaje
     *
     * @param nombre Nombre del personaje
     * @param nivel Nivel del personaje
     * @param salud Puntos de salud del personaje
     */
    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    /**
     * Método abstracto que define el comportamiento de ataque
     */
    public abstract void atacar();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * Representación en texto del personaje
     * @return String con la información del personaje
     */
    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    /**
     * Compara si dos objetos Personaje son iguales
     * @param obj Objeto a comparar
     * @return true si son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Personaje personaje = (Personaje) obj;
        return nivel == personaje.nivel &&
                salud == personaje.salud &&
                nombre.equals(personaje.nombre);
    }

    /**
     * Genera un código hash para el personaje
     * @return código hash
     */
    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + nivel;
        result = 31 * result + salud;
        return result;
    }
}