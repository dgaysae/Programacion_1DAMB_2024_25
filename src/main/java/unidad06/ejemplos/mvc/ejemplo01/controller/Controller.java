package unidad06.ejemplos.mvc.ejemplo01.controller;

import unidad06.ejemplos.mvc.ejemplo01.view.Ventana;

/**
 * 
 * @author diego
 */
public class Controller {
    Ventana ventana;
    // Faltaría un objeto como Modelo para los datos
    
    public Controller() {
        ventana = new Ventana("Ventana MVC");
        ventana.getEtiqueta().setText("Controller rules!");
        ventana.setVisible(true);
    }
}
