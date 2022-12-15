package org.ieslosremedios.daw1.prog.ut3.finales;

final class A {
    String campoA = "";
    void metodoA() {}
}

class B {
    String campoB = "";
    final void metodoB() {}
}

class C extends B {
    void metodoA() {
        metodoB();
    }
}
