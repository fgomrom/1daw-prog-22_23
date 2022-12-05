package org.ieslosremedios.daw1.prog.ut3.persona;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        Persona fulanito = new Persona();
        fulanito.setName("Fulanito");
        System.out.println("Su nombre: " + fulanito.getName());


        // Crear una instancia (objeto) de Persona: Juanito de 20 años
        Persona juanito = new Persona("Juanito", 20);

        System.out.println("Su nombre: " + juanito.getName());
        System.out.println("Su edad: " + juanito.getAge());
        System.out.println("Su especie: " + Persona.getEspecie());

        // Crear una instancia (objeto) de Persona: Pepito de 10 años
        Persona pepito = new Persona("Pepito", 10);

        System.out.println("Su nombre: " + pepito.getName());
        System.out.println("Su edad: " + pepito.getAge());
        System.out.println("Su especie: " + Persona.getEspecie());

        System.out.println("Fin programa");
    }
}
