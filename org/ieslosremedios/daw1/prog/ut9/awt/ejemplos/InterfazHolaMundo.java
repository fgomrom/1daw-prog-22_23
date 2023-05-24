package org.ieslosremedios.daw1.prog.ut9.awt.ejemplos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea una interfaz gráfica usando AWT mediante composición.
 *
 */
public class InterfazHolaMundo {

    public InterfazHolaMundo() {
        // Usamos un frame como contenedor principal. Este tipo de contenedor incluye una barra de título y un borde
        Frame frame = new Frame("Hola mundo!");

        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true); // Por defecto es folse y no se muestra

        // Control
        Button button = new Button("Salir");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame)button.getParent()).dispose();
            }
        });

        button.setBounds(150, 150, 50, 50);

        // Añade el control al contenedor
        frame.add(button);
    }

    public static void main(String[] args) {

        new InterfazHolaMundo();

    }

}
