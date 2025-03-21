package unidad07.fechas.ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Pedir al usuario su fecha de nacimiento y calcular su edad exacta (años, meses y días).
 */
public class Ejercicio01 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce tu fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = getFechaNacimiento(scanner);
            LocalDate fechaActual = LocalDate.now();

            Period edad = Period.between(fechaNacimiento, fechaActual);

            System.out.println("Tienes " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " días.");
            scanner.close();
        }
        catch (DateTimeParseException e) {
            System.out.println("ERROR! La fecha introducida no es correcta. Vuelva a intentarlo:");
        }
    }

    /**
     * Recupera la fecha de teclado en formato YYYY-MM-DD
     * @param scanner
     * @return
     */
    public static LocalDate getFechaNacimiento(Scanner scanner) {
        boolean fechaValida = false;
        LocalDate fechaNacimiento = null;
        do {
            try {
                fechaNacimiento = LocalDate.parse(scanner.nextLine());
                fechaValida = true;
            }
            catch (DateTimeParseException e) {
                System.out.println("ERROR! La fecha introducida no es correcta. Vuelva a intentarlo: ");
            }
        } while (!fechaValida);

        return fechaNacimiento;
    }
}
