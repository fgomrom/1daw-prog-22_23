package org.ieslosremedios.daw1.prog.ut5.listas;

import org.ieslosremedios.daw1.prog.ut5.conjuntos.Persona;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
    private List<Float> calificaciones = new ArrayList<>();
    private List<Integer> participaciones = new ArrayList<>();

    public Alumno(String nombre, Float calificacion, Integer intervencion) {
        super(nombre);
        this.calificaciones.set(0, calificacion);
    }
}
