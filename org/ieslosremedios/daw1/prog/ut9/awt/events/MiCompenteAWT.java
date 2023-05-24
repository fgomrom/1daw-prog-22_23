package org.ieslosremedios.daw1.prog.ut9.awt.events;

import java.awt.*;
import java.awt.event.*;

public class MiCompenteAWT extends Frame {

    public static void main(String[] args) {
        new MiCompenteAWT ();
    }

    MiCompenteAWT () {
        setTitle("Mi componente");
        setVisible(true);
        setLayout(null);
        setBounds(200,200, 400, 400);

        Button botonSalir = new Button("Salir");
        botonSalir.setBounds(50, 50, 50, 50);
        add(botonSalir);

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSalir.setLabel("Quillo que");
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MiCompenteAWT.this.dispose();
            }
        });

    }

}
