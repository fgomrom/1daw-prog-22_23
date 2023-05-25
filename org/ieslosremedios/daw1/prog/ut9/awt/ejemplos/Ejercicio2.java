package org.ieslosremedios.daw1.prog.ut9.awt.ejemplos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Ejercicio 2");
        Button b = new Button("Abrir");
        Label l = new Label("No has seleccionado ningún fichero.");
        b.setBounds(30,30,50,30);
        l.setBounds(90,30,220,30);
        frame.add(b);
        frame.add(l);

        FileDialog fd = new FileDialog(frame, "Elige un fichero", FileDialog.LOAD);
        fd.setDirectory("");
        fd.setFile("*.pdf");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fd.setVisible(true);
                if (fd.getFile() != null)
                    l.setText(fd.getDirectory()+fd.getFile());
            }
        });
        frame.setLayout(null);
        frame.setSize(300,80);
        frame.setVisible(true);
    }
}
