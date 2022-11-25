package org.ieslosremedios.daw1.prog.ut3;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.println("Persona1");
        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setNombre("Francisco");
        System.out.println("Nombre: " + persona1.getNombre());

        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Persona2");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());

        Persona persona3 = new Persona("Fran", "Gómez");
        System.out.println("Persona3");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        Persona persona4 = new Persona();

    }
}
