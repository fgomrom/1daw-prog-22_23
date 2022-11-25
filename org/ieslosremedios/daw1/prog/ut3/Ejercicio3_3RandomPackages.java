package org.ieslosremedios.daw1.prog.ut3;

import javafx.embed.swing.SwingFXUtils;
import javafx.embed.swt.FXCanvas;
import javafx.scene.layout.Pane;

import java.util.Random;

public class Ejercicio3_3RandomPackages {
    public static void main(String[] args) {
        Random utilRandom = new Random();
        int aleatoreo1 = utilRandom.nextInt(100);
        System.out.println(aleatoreo1);

        double aleatoreo2 = Math.random() * 100;
        System.out.println(aleatoreo2);

    }
}
