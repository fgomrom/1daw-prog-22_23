package org.ieslosremedios.daw1.prog.ut4.arrays.polimorfismo;

import static java.lang.Math.PI;

public class Circulo extends Geometria implements Coloreable{

    private double radio;
    /**
     * @return 
     */
    @Override
    double calcularArea() {
        area = PI * radio * radio;
        return area;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @param color
     */
    @Override
    public void colorear(String color) {
        System.out.println("Soy un círculo de color: " + color);
    }
}
