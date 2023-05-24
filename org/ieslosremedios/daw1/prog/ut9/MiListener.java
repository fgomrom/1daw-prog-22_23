package org.ieslosremedios.daw1.prog.ut9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiListener implements ActionListener {

    MiCompenteAWT component;

    public MiListener(MiCompenteAWT component) {
        this.component = component;
    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        component.dispose();
    }
}
