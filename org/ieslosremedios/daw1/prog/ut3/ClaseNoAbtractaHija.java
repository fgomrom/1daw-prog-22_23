package org.ieslosremedios.daw1.prog.ut3;

public class ClaseNoAbtractaHija extends ClaseAbstracta{
    /**
     * Este método estamos obligados a implementarlo o bien declarar esta clase hija también como abstacta
     */
    @Override
    public void metodoAbstracto() {
        System.out.println("Soy un método no abstracto sobreescribiendo a uno abstracto");
    }
}
