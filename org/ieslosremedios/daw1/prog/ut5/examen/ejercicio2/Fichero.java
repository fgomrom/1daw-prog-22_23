package org.ieslosremedios.daw1.prog.ut5.examen.ejercicio2;

import java.util.Objects;

public class Fichero implements Comparable<Fichero> {
    private String nombre;
    private Double peso;

    public Fichero(String nombre, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Fichero o) {
        if (this.nombre.compareTo(o.nombre) == 0) {
            return this.peso.compareTo(o.peso);
        }
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fichero fichero = (Fichero) o;
        return nombre.equals(fichero.nombre) && peso.equals(fichero.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, peso);
    }
}
