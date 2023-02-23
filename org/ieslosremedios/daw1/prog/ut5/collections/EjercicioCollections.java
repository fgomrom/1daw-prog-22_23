package org.ieslosremedios.daw1.prog.ut5.collections;

import java.util.*;

public class EjercicioCollections {
    public static void main(String[] args) {
        // Ejercicio 1
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet();

        l.add(21);
        l.add(10);
        l.add(15);

        s.add(21);
        s.add(10);
        s.add(15);

        System.out.println(l);
        System.out.println(s);

        Collections.shuffle(l);
        List s2 = new ArrayList<>(s);
        Collections.shuffle(s2);
        System.out.println(l);
        System.out.println(s2);

        Collections.sort(l);
        l.toArray();

    }
}
