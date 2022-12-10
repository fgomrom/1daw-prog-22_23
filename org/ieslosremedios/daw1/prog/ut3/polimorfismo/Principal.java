package org.ieslosremedios.daw1.prog.ut3.polimorfismo;

public class Principal {
    public static void main(String[] args) {
        // En tiempo de compilación se declara una variable de tipo Superclase
        Superclase s;

        // En tiempo de ejecución se instancia la variable con la referencia a un nuevo objeto de tipo SubclaseA
        s = new SubclaseA();
        s.metodo();

        // En tiempo de ejecución se instancia la variable con la referencia a un nuevo objeto de tipo SubclaseB
        s = new SubclaseB();
        s.metodo();

        Interface i;

        i = new ImplementacionA();
        i.metodo();

        i = new ImplementacionB();
        i.metodo();

        Animal a;
        a = new Lion();
        a.speak();
        a = new Bird();
        a.speak();
        ((Bird)a).fly();
    }
}
