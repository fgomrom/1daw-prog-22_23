package org.ieslosremedios.daw1.prog.ut5.listas;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {

        // Crear ArrayList y añadir elementos
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Acceder a un elemento por su índice
        System.out.println(cars.get(0));

        // Modificar un elemento
        String elementoReemplazado = cars.set(0, "Opel");
        System.out.println(elementoReemplazado);

        // Eliminarlo
        cars.remove(0);
    }
}
