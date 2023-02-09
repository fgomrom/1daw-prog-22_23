package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        // Árbol binario de enteros
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        treeSetInteger.add(1);
        treeSetInteger.add(3);
        treeSetInteger.add(2);
        for (Integer e:
                treeSetInteger) {
            System.out.println(e);
        }

        // Árbol binario de cadenas
        TreeSet<String> treeSetString = new TreeSet<>();
        treeSetString.add("Fran");
        treeSetString.add("Ana");
        treeSetString.add("Berto");
        for (String e:
                treeSetString) {
            System.out.println(e);
        }

        // Árbol binario de Personas
        TreeSet<Persona> treeSetPersona = new TreeSet<>();
        Persona fran = new Persona("Fran", 31);
        Persona ana = new Persona("Roberto", 20);
        Persona berto = new Persona("Berto", 40);
        treeSetPersona.add(fran);
        treeSetPersona.add(ana);
        treeSetPersona.add(berto);
        for (Persona e:
                treeSetPersona) {
            System.out.println(e);
        }

    }
}
