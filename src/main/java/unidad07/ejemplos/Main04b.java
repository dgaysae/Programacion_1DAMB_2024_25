package unidad07.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * El mismo ejemplo, pero con try-with-resources
 * @author diego
 */
public class Main04b {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

            String entradaNombre = leerDeTeclado(reader, "Por favor, ingresa tu nombre: ");
            String entradaEdad = leerDeTeclado(reader, "Ahora, ingresa tu edad: ");

            int edad = Integer.parseInt(entradaEdad);

            System.out.println("\n¡Hola, " + entradaNombre + "!");
            System.out.println("Tienes " + edad + " años.");

            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer la entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: la edad debe ser un número válido.");
        } catch (Exception e) {
            System.out.println("Error!!");
        }
    }

    public static String leerDeTeclado(BufferedReader lectorTeclado, String msg) {
        System.out.print(msg);
        try {
            return lectorTeclado.readLine();
        } catch (IOException e) {
            return "";
        }
    }
}
