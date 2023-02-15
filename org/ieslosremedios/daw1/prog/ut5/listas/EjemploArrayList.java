package org.ieslosremedios.daw1.prog.ut5.listas;

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {

        // Crear ArrayList y añadir elementos
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(null);
        System.out.println(cars);

        // Introducir un "Renault" entre "BMW" y "Ford"
        cars.add(3, "Renault");
        System.out.println(cars);

        // Acceder a un elemento por su índice
        System.out.println(cars.get(0));

        // Modificar un elemento
        String elementoReemplazado = cars.set(0, "Opel");
        System.out.println(elementoReemplazado);

        // Eliminarlo
        cars.remove(0);

        // Vaciar array
        cars.clear();
        System.out.println(cars.isEmpty());
        System.out.println(cars.size());

        //Añadir conjunto a la lista
        Set<String> carsSet = new HashSet<>();
        carsSet.add("Mitchubichi");
        carsSet.add("Toyota");
        cars.addAll(carsSet);
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        ListIterator it = cars.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
