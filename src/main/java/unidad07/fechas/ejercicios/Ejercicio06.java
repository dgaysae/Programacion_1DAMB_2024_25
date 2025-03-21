package unidad07.fechas.ejercicios;

import java.time.Duration;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.LocalDateTime;
/**
 * Ejercicio 6: Cuenta Regresiva para un Evento
 * Dada una fecha futura (por ejemplo, la fecha de un examen o un concierto), mostrar cuántos días, horas y minutos faltan.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la fecha y hora del evento (YYYY-MM-DDTHH:MM): ");
        LocalDateTime evento = getFechaHora(scanner);

        LocalDateTime ahora = LocalDateTime.now();
        Duration duracion = Duration.between(ahora, evento);

        System.out.println("Faltan " + duracion.toDays() + " días, " + duracion.toHoursPart() + " horas y " + duracion.toMinutesPart() + " minutos para el evento.");

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
