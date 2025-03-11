package unidad08.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Este ejemplo nos sirve para ver cómo funciona un flujo de datos externo a nuestro programa
 * en ejecución. El flujo de las entradas de teclado.
 * @author diego
 */
public class Main04a {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
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
        } finally {
            try {
                // Cerrar el BufferedReader
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el BufferedReader: " + e.getMessage());
            }
        }
    }
}
