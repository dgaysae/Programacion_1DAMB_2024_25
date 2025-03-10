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
            // Solicitar al usuario que ingrese su nombre
            System.out.print("Por favor, ingresa tu nombre: ");
            String nombre = reader.readLine(); // Leer una línea de texto

            // Solicitar al usuario que ingrese su edad
            System.out.print("Ahora, ingresa tu edad: ");
            String edadStr = reader.readLine(); // Leer otra línea de texto

            // Convertir la edad de String a int
            int edad = Integer.parseInt(edadStr);

            // Mostrar la información ingresada por el usuario
            System.out.println("\n¡Hola, " + nombre + "!");
            System.out.println("Tienes " + edad + " años.");

            // Verificar si el usuario es mayor de edad
            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer la entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: La edad debe ser un número válido.");
        }
    }
}
