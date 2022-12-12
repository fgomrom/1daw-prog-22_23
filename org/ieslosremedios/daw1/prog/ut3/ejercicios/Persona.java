package org.ieslosremedios.daw1.prog.ut3.ejercicios;

public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;

    Persona () {
        nombre = "Anónimo";
    }

    Persona (String nombre, String primerApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
