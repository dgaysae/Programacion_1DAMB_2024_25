package unidad06.ejemplos.mvc.ejemplo02.controllers;

import java.util.ArrayList;
import unidad06.ejemplos.mvc.ejemplo02.views.ViewPersonas;
import unidad06.ejemplos.mvc.ejemplo02.model.Persona;
import unidad06.ejemplos.mvc.ejemplo02.model.Personas;

public class ControllerPersonas {
    ViewPersonas view;
    Personas model;

    public ControllerPersonas(ViewPersonas view, Personas model) {
        this.view = view;
        this.model = model;
        
        model.connectBBDD();
        loadTable();

        view.setVisible(true);
    }
    
    private void loadTable() {
        loadColumnNames();
        loadDataRows();
    }
    
    private void loadColumnNames() {
        String[] columnNames = Personas.getColumnNames();
        for (String columnName : columnNames) {
            view.defaultModel.addColumn(columnName);
        }
    }

    private void loadDataRows() {
        ArrayList<Persona> listPersonas = model.getPersonas();
        for (Persona listPersona : listPersonas) {
            Object[] fila = getDataRow(listPersona);
            view.defaultModel.addRow(fila);
        }
    }
    
    private Object[] getDataRow(Persona pers){
        return new Object[]{
            pers.getNombre(),
            pers.getApellidos(),
            pers.getEdad()
        };
    }
}
