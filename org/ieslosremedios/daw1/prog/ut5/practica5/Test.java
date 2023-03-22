package org.ieslosremedios.daw1.prog.ut5.practica5;

import org.ieslosremedios.daw1.prog.ut5.conjuntos.Persona;

public class Test {
    public static void main(String[] args) {
        Cola colaCarniceria = new Cola();
        Cola colaCorreos = new Cola();
        Cola colaCine = new Cola();

        Persona pepito = new Persona();
        colaCarniceria.encolar(pepito);
        System.out.println(colaCarniceria);
    }
}
