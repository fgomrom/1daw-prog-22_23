package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator {
    /**
     * @param o 
     * @param t1
     * @return
     */
    @Override
    public int compare(Object o, Object t1) {
        Persona p1 = (Persona) o;
        Persona p2 = (Persona) t1;

        if (p1.getEdad() == p2.getEdad()) return 0;

        if (p1.getEdad() > p2.getEdad()) return 1; else return -1;
    }
}
