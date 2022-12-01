package ut3.abstractas;

public class ClaseNoAbtractaHija extends ClaseAbstracta{
    /**
     * Este método estamos obligados a implementarlo o bien declarar esta clase hija también como abstacta
     */
    @Override
    void metodoAbstracto() {
        System.out.println("Soy un método no abstracto sobreescribiendo a uno abstracto");
    }
}
