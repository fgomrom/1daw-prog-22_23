package org.ieslosremedios.daw1.prog.ut5.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        // Probar método containsAll
        Set<Integer> numbers = numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("HashSet1: " + numbers);

        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet2: " + primeNumbers);

        System.out.println(numbers.containsAll(primeNumbers));

    }
}
