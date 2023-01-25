package org.ieslosremedios.daw1.prog.ut4.arrays;

public class Persona {
    String nombre;
    int edad;

    Persona (String nombre) {
        this.nombre = nombre;
    }

    Persona() {}

    @Override
    public String toString() {
        return nombre;
    }

}
