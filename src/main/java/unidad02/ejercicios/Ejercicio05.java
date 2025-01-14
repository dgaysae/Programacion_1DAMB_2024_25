package unidad02.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Parte decimal Averiguar si un número real introducido por teclado tiene o no
 * parte fraccionaria (utilícese el método Math.round() que aparece descrito en
 * el tema 1, o si no, búscalo en Internet)
 *
 * @author diego
 */
public class Ejercicio05 {

    public static Scanner entradaTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        double numero = leerNumeroDeTeclado();
        double numeroRedondeo = Math.round(numero);

        System.out.println("Nº introducido: " + numero);
        System.out.println("Nº redondeado: " + numeroRedondeo);

        // Método 1.- Comprobar si son iguales:
        System.out.println("Método 1.- Comprobar si son iguales");
        if (numero != numeroRedondeo) {
            System.out.println("Si hay parte decimal");
        } else {
            System.out.println("No hay parte decimal");
        }

        /*
        Método 2.- Comprobar si la resta es cero. Esto nos permite obtener la
        parte decimal.
         */
        System.out.println("----------------------------------------");
        System.out.println("Método 2.- Comprobar si la resta es cero");
        double resta = numero - numeroRedondeo;
        if (resta != 0) {
            System.out.printf("Si hay parte decimal, que es %.2f", 1 - Math.abs(resta));

        } else {
            System.out.println("No hay parte decimal");
        }

        entradaTeclado.close();
    }

    public static double leerNumeroDeTeclado() {
        boolean esNumeroReal = false;
        double numeroReal = 0;
        do {
            try {
                System.out.println("Introduzca un nº real: ");
                numeroReal = entradaTeclado.nextDouble();
                esNumeroReal = true;
            } catch (InputMismatchException e) {
                System.out.println("Nº incorrecto. Inténtelo de nuevo: ");
                esNumeroReal = false;
            }

            entradaTeclado.nextLine();

        } while (!esNumeroReal);

        return numeroReal;
    }

}
