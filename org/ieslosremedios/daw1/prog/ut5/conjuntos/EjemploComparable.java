package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.TreeSet;

public class EjemploComparable {
    public static void main(String[] args) {
        Persona_backup fran = new Persona_backup("Fran",1);
        Persona_backup ana = new Persona_backup("Ana",2);
        System.out.println(fran.compareTo(ana));

        TreeSet<Persona_backup> treeSet = new TreeSet<>();
        treeSet.add(fran);
        treeSet.add(ana);
        System.out.println(treeSet);

        TreeSet<Persona_backup> treeSet2 = new TreeSet<>(new ComparadorPorEdad());
        treeSet2.add(fran);
        treeSet2.add(ana);
        System.out.println(treeSet2);


    }
}
