package org.ieslosremedios.daw1.prog.ut9.awt.ejemplos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DialogExample {
    private static Dialog d;
    DialogExample() {
        Frame f2 = new Frame();
        Button b2 = new Button("Mostrar");
        b2.setBounds(150, 150, 50, 50);
        b2.setVisible(true);
        f2.add(b2);
        b2.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                DialogExample.d.setVisible(true);
            }
        });

        Frame f= new Frame();
        d = new Dialog(f , "Dialog Example", false);
        d.setLayout( new FlowLayout() );
        Button b = new Button ("OK");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                DialogExample.d.setVisible(false);
            }
        });
        d.add( new Label ("Click button to continue."));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(false);
        f2.add(b);
        f2.setLayout(null);
        f2.setSize(300,80);
        f2.setVisible(true);


    }
    public static void main(String args[])
    {
        new DialogExample();
    }
}  