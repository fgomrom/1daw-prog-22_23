package org.ieslosremedios.daw1.prog.ut3.abstractas;

public class Perro extends Animal {
    final static Integer NUM_PATAS = 4;
    final static Boolean MAMIFERO = true;
    @Override
    public Integer getNumPatas() {
        return NUM_PATAS;
    }
    @Override
    public Boolean esMamifero() {
        return MAMIFERO;
    }

    void otroMetodo () {
        System.out.println("asdfasdf");
    }
}
