package org.ieslosremedios.daw1.prog.ut9.awt.events;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComponenteAWTDeEjemploParaEventos extends Frame implements ActionListener {

    // Declaro los componentes de la interfaz como campos de la clase, para que estén accesibles
    // para todos los métodos de la clase.
    private Frame marco;
    private Button botonSalir;
    private Button botonLimpiar;
    private TextField cajaTexto;

    ComponenteAWTDeEjemploParaEventos () {
        marco = new Frame("Frame AWT");
        marco.setLayout(null);
        marco.setSize(160, 160);
        marco.setVisible(true);

        botonSalir = new Button("Salir");
        botonSalir.setBounds(30,30,50,30);
        marco.add(botonSalir);

        botonLimpiar = new Button("Limpiar");
        botonLimpiar.setBounds(80,30,50,30);
        marco.add(botonLimpiar);

        cajaTexto = new TextField("Escribe algo ...");
        cajaTexto.setBounds(30,70,100,30);
        marco.add(cajaTexto);

        // Registra un listener para el boton salir.
        // Lo hace mediante una clase externa
        PulsarBotonSalirListener pulsarBotonSalirListener = new PulsarBotonSalirListener(this);
        botonSalir.addActionListener(pulsarBotonSalirListener);

        // Registra un listener para el boton limpiar.
        // Esta vez implementado directamente el método de la clase ActionListener (ver más abajo el método
        // actionPerformed)
        botonLimpiar.addActionListener(this);

        // Registra un adapter para que cuando se cierre la ventana (pulsando en el aspa) también se cierre le marco.
        // Se hace usando una clase anónima.
        marco.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Cierra la ventana
                marco.dispose();
            }
            @Override
            public void windowLostFocus(WindowEvent e) {
                marco.setTitle("¡Estoy aquí!");
            }
        });

        // Dar de baja el listener el botón de salir
        //botonSalir.removeActionListener(pulsarBotonSalirListener);

    }

    public static void main(String[] args) {
        // Crea la interfaz a partir de los componentes y eventos definidos en el constructor
        new ComponenteAWTDeEjemploParaEventos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cajaTexto.setText("");
    }

    // Declaro este getter para poder acceder desde PulsarBotonSalirListener
    public Frame getMarco() {
        return marco;
    }
}
