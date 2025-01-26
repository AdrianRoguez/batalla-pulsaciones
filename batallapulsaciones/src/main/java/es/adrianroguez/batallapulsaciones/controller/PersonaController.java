package es.adrianroguez.batallapulsaciones.controller;

import es.adrianroguez.batallapulsaciones.model.PersonaModel;
import es.adrianroguez.batallapulsaciones.view.PersonaView;

public class PersonaController {
    protected PersonaModel modelo;
    protected PersonaView vista;

    public PersonaController(PersonaModel modelo, PersonaView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        
    }

    public void modificarSalud(int salud) {
        
    }
}