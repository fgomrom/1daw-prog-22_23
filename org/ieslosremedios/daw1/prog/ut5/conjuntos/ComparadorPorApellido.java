package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Persona> {

    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.compareTo(o2);
    }
}
