package unidad02.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Raíz cuadrada
 * Calcular la raíz cuadrada de un número introducido por teclado. Hay que
 * tener la precaución de comprobar que el número sea positivo.
 * 
 * @author diego
 */
public class Ejercicio02 {

    public static Scanner entradaTeclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numero = leerEnteroDeTeclado();
        if (numero >= 0) {
            System.out.println("La raiz cuadrada de "
                    + numero
                    + " = "
                    + Math.sqrt(numero));
        }
        else {
            System.out.println("ERROR! No se puede calcular la raiz cuadrada de un número negativo.");
        }

        entradaTeclado.close();
        
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
