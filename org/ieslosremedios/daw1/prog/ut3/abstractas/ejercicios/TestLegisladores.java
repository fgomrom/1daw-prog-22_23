package org.ieslosremedios.daw1.prog.ut3.abstractas.ejercicios;

public class TestLegisladores {
    public static void main(String[] args) {
        Legislador perez = new Diputado("Carlos", "Pérez", 49, true, "Córdoba", "FPV", 506, 25);
        Legislador brando = new Senador("Luisina", "Brando", 62, false, "Santa Fe", "PRO", 58, 97);

        System.out.println("Soy " + perez.getNombre() + " " + perez.getApellido() + " de la camara de " +
                perez.getCamaraEnQueTrabaja() + " por la provincia de " + perez.getProvinciaQueRepresenta());
        System.out.println("Soy " + brando.getNombre() + " " + brando.getApellido() + " de la camara de " +
                brando.getCamaraEnQueTrabaja() + " por la provincia de " + brando.getProvinciaQueRepresenta());
    }
}
