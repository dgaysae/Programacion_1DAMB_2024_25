package unidad07.fechas.ejercicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Ejercicio 7: Validación de Fechas y Horarios de Vuelo
 * Simular un sistema de validación de fechas y horarios de vuelos.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la fecha y hora de tu vuelo (YYYY-MM-DDTHH:MM): ");
        LocalDateTime vuelo = getFechaHora(scanner);

        LocalDateTime ahora = LocalDateTime.now();
        if (vuelo.isBefore(ahora)) {
            System.out.println("Error: La fecha del vuelo debe ser futura.");
        } else {
            LocalDateTime llegadaAeropuerto = vuelo.minus(Duration.ofHours(3));
            System.out.println("Debes estar en el aeropuerto a las: " + llegadaAeropuerto);
        }

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
