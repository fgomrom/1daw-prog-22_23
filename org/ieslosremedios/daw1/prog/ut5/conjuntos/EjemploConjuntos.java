package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import org.ieslosremedios.daw1.prog.ut4.arrays.Persona;

import java.util.*;

public class EjemploConjuntos {
    public static void main(String[] args) {

        // Incluir un conjunto en otro
        incluirConjuntos();

        Set<String> conjunto = new HashSet<>();

        System.out.println(conjunto.isEmpty());

        String s = "s1";
        conjunto.add(s);
        System.out.println(conjunto.isEmpty());

        conjunto.add("s2");
        conjunto.add("s3");
        conjunto.add("s4");
        conjunto.add("s5");

        System.out.println(conjunto);

        conjunto.add("s3");

        System.out.println(conjunto);

        conjunto.add(null);

        System.out.println(conjunto);

        String e;
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()) {
            e = it.next();
            System.out.print(e + " ");
        }

        conjunto.remove(s);
        System.out.println(conjunto);


        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("s2");
        conjunto2.add("s3");
        conjunto2.add("s4");
        conjunto.removeAll(conjunto2);
        System.out.println(conjunto);
        



    }

    /**
     * Incluir un conjunto en otro
     */
    private static void incluirConjuntos() {
        TreeSet<Integer> conjuntoA = new TreeSet<>();
        conjuntoA.add(1);
        conjuntoA.add(3);
        conjuntoA.add(5);
        TreeSet<Integer> conjuntoB = new TreeSet<>();
        conjuntoB.add(2);
        conjuntoB.add(4);
        TreeSet<String> conjuntoC = new TreeSet<>();
        conjuntoC.add("x");
        conjuntoC.add("y");
        TreeSet conjuntoAyB = new TreeSet();
        conjuntoAyB.addAll(conjuntoA);
        conjuntoAyB.addAll(conjuntoB);
        TreeSet conjuntoD = new TreeSet(conjuntoC);
        conjuntoD.add("z");
        System.out.println(conjuntoAyB);
        System.out.println(conjuntoD);
    }
}
