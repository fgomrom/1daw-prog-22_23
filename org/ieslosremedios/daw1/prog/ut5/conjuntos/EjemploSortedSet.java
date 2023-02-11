package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.SortedSet;
import java.util.TreeSet;

public class EjemploSortedSet {
    public static void main(String[] args) {
        SortedSet<String> abc = new TreeSet<>();
        abc.add("B");
        abc.add("C");
        abc.add("A");
        System.out.println(abc);
    }
}
