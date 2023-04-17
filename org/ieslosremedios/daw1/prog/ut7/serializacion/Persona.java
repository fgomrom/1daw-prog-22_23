package org.ieslosremedios.daw1.prog.ut7.serializacion;

import org.ieslosremedios.daw1.prog.ut3.practica.Direccion;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String apellido;

    private Persona padre;

    private Direccion direccion;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, apellido);
    }
}
