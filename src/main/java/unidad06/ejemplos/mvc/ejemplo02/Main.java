package unidad06.ejemplos.mvc.ejemplo02;

import unidad06.ejemplos.mvc.ejemplo02.controllers.ControllerPersonas;
import unidad06.ejemplos.mvc.ejemplo02.model.Personas;
import unidad06.ejemplos.mvc.ejemplo02.views.ViewPersonas;

public class Main {

    public static void main(String args[]) {

        Personas modelPersonas = new Personas();
        ViewPersonas viewPersonas = new ViewPersonas();
        ControllerPersonas controllerPersonas = new ControllerPersonas(viewPersonas, modelPersonas);

    }
}
