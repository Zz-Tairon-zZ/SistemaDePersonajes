package modelo.personajes;

public abstract class PersonajeMágico extends Personaje {
    protected int poderMágico;

    public PersonajeMágico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    // Método propio no abstracto
    public void meditar() {
        this.poderMágico += 3;
        System.out.println(nombre + " ha meditado y aumentado su poder mágico a " + poderMágico);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " está preparando un ataque mágico. Poder: " + poderMágico);
    }

    // Getter y setter
    public int getPoderMágico() {
        return poderMágico;
    }

    public void setPoderMágico(int poderMágico) {
        this.poderMágico = poderMágico;
    }
}