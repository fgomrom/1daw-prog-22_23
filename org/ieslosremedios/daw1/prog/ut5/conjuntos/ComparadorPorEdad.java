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
        Persona_backup p1 = (Persona_backup) o;
        Persona_backup p2 = (Persona_backup) t1;

        if (p1.getEdad() == p2.getEdad()) return 0;

        if (p1.getEdad() > p2.getEdad()) return 1; else return -1;
    }
}
