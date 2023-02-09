package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Objects;

public class Persona implements Comparable{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + nombre + "}";
    }

    /**
     * @param other the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona)other;
        return this.nombre.compareTo(otherPersona.nombre);
    }

    @Override
    public boolean equals(Object o) {
        Persona persona = (Persona) o;
        return this.nombre.equals(persona.nombre);
    }

}
