package org.ieslosremedios.daw1.prog.ut5.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploRecorriendoListas {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(15);
        numbers.add(23);
        numbers.add(21);

        List<Integer> linkedList = new LinkedList<>(numbers);

        // Creo un sólo iterador, que se posiciona antes del inicio del array
        ListIterator<Integer> it = numbers.listIterator();

        // Recorrido hacia delante y eliminación de elementos
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);

        // Recorrido hacia atrás y eliminación de elementos
        while(it.hasPrevious()) {
            Integer i = it.previous();
            if(i > 20) {
                it.remove();
            }
            if (i == 15) {
                it.add(10);
            }
        }
        System.out.println(numbers);
    }
}
