package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjemploLinkedHashSet {
    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("s1");
        linkedHashSet.add("s2");
        linkedHashSet.add("s3");
        linkedHashSet.add("s3");
        linkedHashSet.add(null);
        linkedHashSet.add("s1");
        linkedHashSet.add(null);

        System.out.println("Todos los elementos están ordenados según fueron insertados:");
        System.out.println(linkedHashSet);
        Iterator<String> it = linkedHashSet.iterator();
        System.out.print("[");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.print("]");
    }
}
