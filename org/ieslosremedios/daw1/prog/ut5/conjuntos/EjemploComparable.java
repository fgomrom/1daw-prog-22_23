package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.TreeSet;

public class EjemploComparable {
    public static void main(String[] args) {
        Persona fran = new Persona("Fran",1);
        Persona ana = new Persona("Ana",2);
        System.out.println(fran.compareTo(ana));

        TreeSet<Persona> treeSet = new TreeSet<>();
        treeSet.add(fran);
        treeSet.add(ana);
        System.out.println(treeSet);

        TreeSet<Persona> treeSet2 = new TreeSet<>(new ComparadorPorEdad());
        treeSet2.add(fran);
        treeSet2.add(ana);
        System.out.println(treeSet2);


    }
}
