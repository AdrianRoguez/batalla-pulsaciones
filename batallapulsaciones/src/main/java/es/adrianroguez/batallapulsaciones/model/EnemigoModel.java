package es.adrianroguez.batallapulsaciones.model;

public class EnemigoModel extends PersonaModel {
    private int experiencia;
    private int nivel;

    // Constructor vacío
    public EnemigoModel() {

    }

    /**
     * Constructor por defecto
     * 
     * @param nombre
     * @param salud
     * @param experiencia
     * @param nivel
     */
    public EnemigoModel(String nombre, int salud, int nivel) {
        super(nombre, salud);
        this.nivel = nivel;
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
