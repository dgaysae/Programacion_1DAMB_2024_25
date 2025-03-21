package unidad07.fechas.ejercicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Ejercicio 2: Diferencia entre dos Fechas y Horas
 * Dado un evento con fecha y hora de inicio y fin, calcular la duración exacta en horas y minutos.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la fecha y hora de inicio (YYYY-MM-DDTHH:MM): ");
        LocalDateTime inicio = getFechaHora(scanner);

        System.out.print("Introduce la fecha y hora de fin (YYYY-MM-DDTHH:MM): ");
        LocalDateTime fin = getFechaHora(scanner);

        Duration duracion = Duration.between(inicio, fin);
        System.out.println("Duración: " + duracion.toHours() + " horas y " + duracion.toMinutesPart() + " minutos.");

        scanner.close();
    }

    public static LocalDateTime getFechaHora(Scanner scanner) {
        boolean fechaValida = false;
        LocalDateTime fechaNacimiento = null;
        do {
            try {
                fechaNacimiento = LocalDateTime.parse(scanner.nextLine());
                fechaValida = true;
            }
            catch (DateTimeParseException e) {
                System.out.println("ERROR! La fecha y hora introducida no es correcta. Vuelva a intentarlo: ");
            }
        } while (!fechaValida);

        return fechaNacimiento;
    }
}
