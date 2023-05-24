package org.ieslosremedios.daw1.prog.ut9.awt.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PulsarBotonSalirListener implements ActionListener {

    private ComponenteAWTDeEjemploParaEventos component;

    public PulsarBotonSalirListener(ComponenteAWTDeEjemploParaEventos e) {
        this.component = e;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        component.getMarco().dispose();
    }
}
