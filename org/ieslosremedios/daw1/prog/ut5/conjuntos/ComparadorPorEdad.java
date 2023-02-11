package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Persona> {
    /**
     * @param o 
     * @param t1
     * @return
     */
    @Override
    public int compare(Persona p1, Persona p2) {

        if (p1.getEdad() == p2.getEdad()) return 0;

        if (p1.getEdad() > p2.getEdad()) return 1; else return -1;
    }
}
