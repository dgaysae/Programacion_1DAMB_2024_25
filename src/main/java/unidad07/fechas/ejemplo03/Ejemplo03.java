package unidad07.fechas.ejemplo03;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Programa que comprueba la fecha de nacimiento de varios empleados para
 * identificar al más joven y nombrarlo "secretario" (cambiar su cargo).
 */
public class Ejemplo03 {

    private static ArrayList<Persona> empleados;
            
    public static void main(String args[]) {
        loadEmpleados();
        printListaEmpleados();
        
        LocalDate fechaMenor = LocalDate.now();
        int posicion = -1;
        for (int i = 0; i < empleados.size(); i++) {
            if (fechaMenor.isAfter(empleados.get(i).getFechaNacimiento())) {
                fechaMenor = empleados.get(i).getFechaNacimiento();
                posicion = i;
            }
        }
        
        if (posicion != -1) {
            empleados.get(posicion).setCargo("secretario");
        }
        printListaEmpleados();
        
        
    }

    private static void loadEmpleados() {
        empleados = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            empleados.add(new Persona("Persona " + i, LocalDate.of(2000, i, i), "empleado"));
        }
    }
    
    private static void printListaEmpleados() {
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i));
        }
    }
}
