package ut3.abstractas;

abstract class ClaseAbstracta {
    abstract void metodoAbstracto();
    void metodoNoAbstracto() {
        System.out.println("Soy un método no abstracto definido en una clase abstracta");
    }
}
