package unidad02.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Numeros ordenados
 * Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de
 * menor a mayor.
 * Complétalo con otro método que nos diga si los números, además de estar
 * ordenados, son consecutivos.
 * 
 * @author diego
 */
public class Ejercicio06 {
    
    public static Scanner entradaTeclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num1 = leerEnteroDeTeclado();
        int num2 = leerEnteroDeTeclado();
        int num3 = leerEnteroDeTeclado();
        
        if (num1 < num2 && num2 < num3) {
            System.out.println("Están ordenados de menor a mayor");
            if (sonConsecutivos(num1, num2, num3)) {
                System.out.println("Además, ¡son consecutivos!");
            }
        }
        else {
            System.out.println("No están ordenados de menor a mayor");
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
    
    public static boolean sonConsecutivos(int n1, int n2, int n3) {
        //if ((n1 + 1 == n2) && (n2 + 1 == n3)) {
        if ((n3 - n2 == 1) && (n2 - n1 == 1)) {
            return true;
        }
        return false;
    }
    
}
