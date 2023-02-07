package org.ieslosremedios.daw1.prog.ut4.arrays.polimorfismo;

public class Test {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRadio(2);

        Geometria[] geometrias = {c1};

        double areaTotal = 0;
        for (Geometria g :
                geometrias) {
            areaTotal = areaTotal + c1.calcularArea();
            c1.colorear("Azul");
        }
        System.out.println(areaTotal);



    }
}
