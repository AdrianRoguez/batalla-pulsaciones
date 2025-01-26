package es.adrianroguez.batallapulsaciones.model;

public class JugadorModel extends PersonaModel {
    private int experiencia;
    private int nivel;

    // Constructor vacío
    public JugadorModel() {

    }

    /**
     * Constructor por defecto
     * 
     * @param nombre
     * @param salud
     * @param experiencia
     * @param nivel
     */
    public JugadorModel(String nombre, int salud, int experiencia, int nivel) {
        super(nombre, salud);
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void atacar() {

    }

    public void recibirDanio() {

    }
}
