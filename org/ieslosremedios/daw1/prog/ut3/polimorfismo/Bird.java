package org.ieslosremedios.daw1.prog.ut3.polimorfismo;

public class Bird extends Animal implements Flyable {

    @Override
    public void speak() {
        System.out.println("Pio, pio!");
    }

    @Override
    public void fly() {
        System.out.println("¡A volar!");
    }
}
