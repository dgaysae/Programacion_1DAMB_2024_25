package unidad07.fechas.ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 * Ejercicio 3: Programador de Tareas Periódicas
 * Dado un día de la semana y una hora de inicio, calcular las próximas 5 ocurrencias de la tarea en las
 * siguientes semanas.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la fecha y hora de la primera tarea (YYYY-MM-DDTHH:MM): ");
        LocalDateTime primeraTarea = getFechaHora(scanner);

        System.out.println("Próximas 5 ocurrencias:");
        for (int i = 1; i <= 5; i++) {
            primeraTarea = primeraTarea.plus(1, ChronoUnit.WEEKS);
            System.out.println(primeraTarea);
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
