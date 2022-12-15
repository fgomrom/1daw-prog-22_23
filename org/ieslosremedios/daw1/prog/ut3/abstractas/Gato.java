package org.ieslosremedios.daw1.prog.ut3.abstractas;

public class Gato extends Animal {
    private final static Integer NUM_PATAS = 4;

    @Override
    public Integer getNumPatas() {
        return NUM_PATAS;
    }

    public Boolean esMamifero() {
        return true;
    }
}
