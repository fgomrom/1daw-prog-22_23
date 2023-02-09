package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Objects;

public class Persona_backup implements Comparable<Persona_backup>{
    private String nombre;
    private int edad;

    Persona_backup(){
        //Constructor por defecto
    }

    public Persona_backup(String nombre) {
        this.nombre = nombre;
    }

    public Persona_backup(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    /**
     * @param other 
     * @return compara por nombre
     */
    @Override
    public int compareTo(Persona_backup other) {
        return nombre.compareTo(other.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona_backup persona = (Persona_backup) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
