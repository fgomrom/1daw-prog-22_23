package org.ieslosremedios.daw1.prog.ut4.arrays;

import java.util.Arrays;

public class EjemploArraysClone {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = a.clone();
        a[0] = 0;
        System.out.print(Arrays.toString(a));
        System.out.println(a);
        System.out.print(Arrays.toString(b));
        System.out.print(b);

        Persona p1 = new Persona("p1");
        System.out.println(p1.toString());


        Persona p2 = new Persona("p2");
        Persona p3 = new Persona("p3");
        Persona[] personasA = {p1, p2, p3};
        Persona[] personasB = personasA.clone();

        for (Persona p: personasA) {
            System.out.println(p.nombre);
        }
        for (int i = 0; i < personasA.length; i++) {
            System.out.println(personasA[i].nombre);
        }

        System.out.print(Arrays.toString(personasA));
        System.out.println(personasA);
        System.out.print(Arrays.toString(personasB));
        System.out.print(personasB);



    }
}
