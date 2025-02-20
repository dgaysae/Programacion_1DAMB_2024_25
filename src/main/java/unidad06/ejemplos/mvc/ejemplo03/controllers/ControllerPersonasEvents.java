package unidad06.ejemplos.mvc.ejemplo03.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import unidad06.ejemplos.mvc.ejemplo03.model.Personas;
import unidad06.ejemplos.mvc.ejemplo03.views.ViewPersonas;

/**
 * 
 * @author diego
 */
public class ControllerPersonasEvents implements ActionListener {
    ViewPersonas view;
    Personas model;
    
    public ControllerPersonasEvents(
            ViewPersonas view,
            Personas model
    ) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("acExit")) {
            System.exit(0);
        }
        else if (ae.getActionCommand().equals("acRemove")) {
            if (view.getTable().getSelectedRowCount() == 0) {
                
                JOptionPane.showMessageDialog(view,
                        "No se ha seleccionado ninguna fila",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
}
