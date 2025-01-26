package es.adrianroguez.batallapulsaciones.model;

public abstract class PersonaModel {
    private String nombre;
    private int salud;

    // Constructor vacío
    public PersonaModel() {

    }

    /**
     * Constructor por defecto
     * 
     * @param nombre
     * @param salud
     */
    public PersonaModel(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
