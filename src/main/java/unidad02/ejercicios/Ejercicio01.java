package unidad02.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Leer un número por teclado mediante un método, y decir si es positivo o
 * negativo con otro método. La salida por consola puede ser algo así como: "el
 * número X es positivo"
 *
 * @author diego
 */
public class Ejercicio01 {

    public static Scanner entradaTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        int iNumero = leerEnteroDeTeclado();
        if (esPositivo(iNumero)) {
            System.out.println("El número es positivo");
        }
        else {
            System.out.println("El número es negativo");
        }
        
        System.out.println("El número es positivo? - " + esPositivo2(iNumero));
        esPositivo3(iNumero);
        
        int suma = leerEnteroDeTeclado() + leerEnteroDeTeclado();
        System.out.println("Suma = " + suma);

        entradaTeclado.close();
        
    }
    
    public static boolean esPositivo(int numero) {
        boolean esPositivo = false;
        if (numero >= 0) {
            esPositivo = true;
        }
        
        return esPositivo;
    }

    public static boolean esPositivo2(int numero) {
        return (numero >= 0);
    }
    
    public static void esPositivo3(int numero) {
        if (numero >= 0) {
            System.out.println("El número es positivo");
        }
        else {
            System.out.println("El número es negativo");
        }
    }

    public static int leerEnteroDeTeclado() {
        int numero = 0;
        boolean esNumero = false;

        do {
            try {
                System.out.println("Intro número: ");
                numero = entradaTeclado.nextInt();
                esNumero = true;
            } catch (InputMismatchException e) {
                System.out.println("Dato no válido");
                esNumero = false;
            }
            entradaTeclado.nextLine();

        } while (!esNumero);

        return numero;
    }
}
