package org.ieslosremedios.daw1.prog.ut3.abstractas;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal a = new Perro();
        Perro p = new Perro();
        System.out.println("Número de patas: " + a.getNumPatas());
        System.out.println("¿Es mamífero? " + a.esMamifero());
        p.otroMetodo();
        ((Perro)a).otroMetodo();
    }
}
