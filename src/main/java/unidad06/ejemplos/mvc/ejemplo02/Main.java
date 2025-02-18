package unidad06.ejemplos.mvc.ejemplo02;

import unidad06.ejemplos.mvc.ejemplo02.controllers.ControllerPersonas;
import unidad06.ejemplos.mvc.ejemplo02.model.Personas;
import unidad06.ejemplos.mvc.ejemplo02.views.ViewPersonas;

public class Main {

    public static void main(String args[]) {

        new ControllerPersonas(
                new ViewPersonas(),
                new Personas()
        );

    }
}
