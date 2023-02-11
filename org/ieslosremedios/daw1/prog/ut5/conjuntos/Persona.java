package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
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
    public int compareTo(Persona other) {
        return this.nombre.compareTo(other.nombre);
    }

    @Override
    public boolean equals(Object o) {
        Persona persona = (Persona) o;
        return this.nombre.equals(persona.nombre);
    }

}
