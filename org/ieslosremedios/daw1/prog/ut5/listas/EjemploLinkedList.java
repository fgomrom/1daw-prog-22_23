package org.ieslosremedios.daw1.prog.ut5.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(15);
        numbers.add(23);
        numbers.add(21);

        LinkedList<Integer> linkedList = new LinkedList<>(numbers);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(10);

        numbers.add(77);

        System.out.println("ArrayList:" + numbers);
        System.out.println("LinkedList:" + linkedList);

        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size());
        Integer e;
        System.out.print("[");
        while (listIterator.hasPrevious()) {
            e = listIterator.previous();
            if (e.equals(15)) {
                listIterator.remove();
            }
            if (e.equals(23))
                listIterator.add(11);
            System.out.print(e);
            if (listIterator.hasPrevious()) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println("LinkedList:" + linkedList);

        //Imprime el tercer elemento
        System.out.println(linkedList.get(2));
        // Modifica el 4º elemento para que valga 22
        linkedList.set(4,22);
        // Mostrar si el 22 está dentro de la lista
        System.out.println(linkedList.contains(22));
        // ¿Qué posición ocupa el elemento 22?
        System.out.println(linkedList.indexOf(22));
        // Eliminar el elemento 22
        //linkedList.remove((Integer) 22);
        linkedList.remove(linkedList.indexOf(22));
        System.out.println(linkedList.contains(22));
        linkedList.addFirst(9);
        System.out.println(linkedList);
    }
}
