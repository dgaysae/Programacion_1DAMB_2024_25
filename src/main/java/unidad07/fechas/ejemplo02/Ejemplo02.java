package unidad07.fechas.ejemplo02;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Programa que pide al usuario el nombre y la fecha de nacimiento (dd/mm/yyyy) de dos
 * personas.
 * El programa identificará las edades de ambas personas, indicando cuál es mayor.
 * Las edades serán precisas, indicando años, meses y días.
 */
public class Ejemplo02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un nombre: ");
        String nombre1 = sc.nextLine();
        
        System.out.println("Introduzca fecha de nacimiento en formato dd/mm/yyyy: ");
        String fechaString1 = sc.nextLine();
        LocalDate fecha1 = getFechaFromString(fechaString1);
        
        System.out.println("Introduzca un nombre: ");
        String nombre2 = sc.nextLine();
        
        System.out.println("Introduzca fecha de nacimiento en formato dd/mm/yyyy: ");
        String fechaString2 = sc.nextLine();
        LocalDate fecha2 = getFechaFromString(fechaString2);

        if (fecha1.isBefore(fecha2)) {
            System.out.println(nombre1 + " es mayor que " + nombre2);
        }
        else if (fecha2.isBefore(fecha1)) {
            System.out.println(nombre2 + " es mayor que " + nombre1);
        }
        else {
            System.out.println(nombre1 + " y " + nombre2 + " tienen la misma edad.");
        }
                
        System.out.println(getEdadExacta(fecha1, nombre1));
        System.out.println(getEdadExacta(fecha2, nombre2));
    }
    
    /**
     * Toma una fecha en formato dd/mm/yyyy y devuelve su equivalente objeto
     * LocalDate.
     * IMPORTANTE: debería validar que el formato sea correcto usando expresiones
     * regulares.
     * @param s Fecha en formato dd/mm/yyyy
     * @return Objeto LocalDate equivalente
     */
    public static LocalDate getFechaFromString(String s) {
        String[] splitFecha1 = s.split("/");
        LocalDate fecha = LocalDate.of(Integer.parseInt(splitFecha1[2]),
                Integer.parseInt(splitFecha1[1]),
                Integer.parseInt(splitFecha1[0]));
        
        return fecha;
    }
    
    public static String getEdadExacta(LocalDate fecha, String nombre) {
        Period p = Period.between(fecha, LocalDate.now());
        
        return nombre + " tiene " + p.getYears() + " años.\n"
                + "En concreto tiene "
                + p.getYears()+ " años, "
                + p.getMonths() + " meses y "
                + p.getDays() + " días.";
    }
}
