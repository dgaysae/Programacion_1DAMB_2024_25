package unidad07.fechas.ejercicios;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.time.ZoneId.SHORT_IDS;

/**
 * Ejercicio 4: Conversión de Zona Horaria
 * Dada una fecha y hora en una zona horaria, convertirla a otra zona horaria específica.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la fecha y hora en Madrid (YYYY-MM-DDTHH:MM): ");
        LocalDateTime fechaHoraMadrid = getFechaHora(scanner);

        ZonedDateTime madridTime = fechaHoraMadrid.atZone(ZoneId.of("Europe/Madrid"));
        ZonedDateTime newYorkTime = madridTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Hora en Nueva York: " + newYorkTime);

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
