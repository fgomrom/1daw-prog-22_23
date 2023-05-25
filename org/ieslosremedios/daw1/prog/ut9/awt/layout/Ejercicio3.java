package org.ieslosremedios.daw1.prog.ut9.awt.layout;

import java.awt.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Frame frameBorderLayout = new Frame();
        Frame frameBorderLayout2 = new Frame();
        Frame frameGridLayout;

        BorderLayout borderLayout = new BorderLayout();
        Button botonArriba = new Button("Arriba");
        Button botonAbajo = new Button("Abajo");
        Button botonIzquierda = new Button("Izquierda");
        Button botonDerecha = new Button("Derecha");
        Button botonCentro = new Button("Centro");
        borderLayout.addLayoutComponent(botonArriba, BorderLayout.NORTH);
        borderLayout.addLayoutComponent(botonAbajo, BorderLayout.SOUTH);
        borderLayout.addLayoutComponent(botonIzquierda, BorderLayout.WEST);
        borderLayout.addLayoutComponent(botonDerecha, BorderLayout.EAST);
        borderLayout.addLayoutComponent(botonCentro, BorderLayout.CENTER);

        frameBorderLayout.setLayout(borderLayout);

        frameBorderLayout.add(botonArriba);
        frameBorderLayout.add(botonAbajo);
        frameBorderLayout.add(botonIzquierda);
        frameBorderLayout.add(botonDerecha);
        frameBorderLayout.add(botonCentro);

        // Otra alternativa para hacerlo
        frameBorderLayout2.add(new Button("Arriba"), BorderLayout.NORTH);
        frameBorderLayout2.add(new Button("Abajo"), BorderLayout.SOUTH);
        frameBorderLayout2.add(new Button("Izquierda"), BorderLayout.WEST);
        frameBorderLayout2.add(new Button("Derecha"), BorderLayout.EAST);
        frameBorderLayout2.add(new Button("Centro"), BorderLayout.CENTER);

        frameBorderLayout.setSize(300,300);
        frameBorderLayout.setVisible(true);

        frameBorderLayout2.setSize(300,300);
        frameBorderLayout2.setVisible(true);
    }


}
