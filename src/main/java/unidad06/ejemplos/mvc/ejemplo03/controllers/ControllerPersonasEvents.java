package unidad06.ejemplos.mvc.ejemplo03.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import unidad06.ejemplos.mvc.ejemplo03.model.Personas;
import unidad06.ejemplos.mvc.ejemplo03.views.ViewPersonas;

/**
 *
 * @author diego
 */
public class ControllerPersonasEvents implements ActionListener {

    ViewPersonas view;
    Personas model;
    ControllerPersonas controller;

    public ControllerPersonasEvents(
            ViewPersonas view,
            Personas model,
            ControllerPersonas controller
    ) {
        this.view = view;
        this.model = model;
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("acExit")) {
            System.exit(0);
        }
        else if (ae.getActionCommand().equals("acRemove")) {
            if (isRowSelected()) {
                int indice = view.getTable().getSelectedRow();
                model.remove(indice);
                controller.loadDataTable();
                
            }
        }
    }

    private boolean isRowSelected() {
        if (view.getTable().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view,
                    "No se ha seleccionado ninguna fila",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
}
