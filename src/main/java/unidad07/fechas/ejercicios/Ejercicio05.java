package unidad07.fechas.ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Ejercicio 5: Diferencia de Fechas en Días Laborales
 * Dado un rango de fechas, calcular cuántos días hábiles hay en ese período (sin contar sábados y domingos).
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la fecha de inicio (YYYY-MM-DD): ");
        LocalDate inicio = getFecha(scanner);

        System.out.print("Introduce la fecha de fin (YYYY-MM-DD): ");
        LocalDate fin = getFecha(scanner);

        int diasLaborales = 0;
        while (!inicio.isAfter(fin)) {
            if (inicio.getDayOfWeek() != DayOfWeek.SATURDAY && inicio.getDayOfWeek() != DayOfWeek.SUNDAY) {
                diasLaborales++;
            }
            inicio = inicio.plusDays(1);
        }

        System.out.println("Días laborables en el período: " + diasLaborales);
        scanner.close();
    }

    public static LocalDate getFecha(Scanner scanner) {
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
