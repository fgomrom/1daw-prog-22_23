package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploComparator {
    public static void main(String[] args) {
        Comparator<Persona> comparadorPersonaPorNombre = Comparator.comparing(Persona::getNombre);
        Set<Persona> personas = new TreeSet<>(comparadorPersonaPorNombre);
        Persona fran = new Persona("Fran",1);
        Persona ana = new Persona("Ana",2);
        personas.add(fran);
        personas.add(ana);
        System.out.println(personas);
    }
}
