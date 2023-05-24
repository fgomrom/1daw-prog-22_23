package org.ieslosremedios.daw1.prog.ut9.awt.ejemplos;

import java.awt.*;

/**
 * Crea una interfaz gráfica usando AWT mediante composición.
 *
 */
public class InterfazHolaMundoPorHerencia extends Frame {

    public InterfazHolaMundoPorHerencia() {
        // Igualmente usamos un frame como contenedor principal, pero como ahora estamos
        // heredando de la clase Frame, podemos usar sus métodos directamente.
        setTitle("Hola mundo!");

        setBackground(Color.LIGHT_GRAY);
        setLayout(null); // Posicionamiento absoluto
        setSize(300, 300);
        setVisible(true); // Por defecto es folse y no se muestra

        // Control
        Button button = new Button("Salir");
        button.setBounds(150, 150, 50, 50);

        // Añade el control al contenedor
        add(button);
    }

    public static void main(String[] args) {

        new InterfazHolaMundoPorHerencia();

    }

}
