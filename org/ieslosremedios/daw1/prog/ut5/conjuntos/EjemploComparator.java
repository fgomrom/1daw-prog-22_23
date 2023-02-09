package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploComparator {
    public static void main(String[] args) {
        Comparator<Persona_backup> comparadorPersonaPorNombre = Comparator.comparing(Persona_backup::getNombre);
        Set<Persona_backup> personas = new TreeSet<>(comparadorPersonaPorNombre);
        Persona_backup fran = new Persona_backup("Fran",1);
        Persona_backup ana = new Persona_backup("Ana",2);
        personas.add(fran);
        personas.add(ana);
        System.out.println(personas);
    }
}
