package org.ieslosremedios.daw1.prog.ut4.arrays;

public class Persona {
    String nombre;
    int edad;

    public Persona (String nombre) {
        this.nombre = nombre;
    }

    public Persona() {}

    @Override
    public String toString() {
        return nombre;
    }

}
