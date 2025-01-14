package unidad02.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Restar Leídos dos números por teclado, llamémosles A y B, calcular y mostrar
 * la resta del mayor menos el menor. Por ejemplo, si A = 8 y B = 3, el
 * resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el resultado
 * debe ser B – A, es decir, 3.
 *
 * @author diego
 */
public class Ejercicio03 {

    public static Scanner entradaTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a = leerEnteroDeTeclado();
        int b = leerEnteroDeTeclado();
        int resta;
        
        if (a > b) {
            resta = a - b;
            System.out.printf("%d - %d = %d \n", a, b, resta);
        }
        else {
            resta = b - a;
            System.out.printf("%d - %d = %d \n", b, a, resta);
        }
        
        entradaTeclado.close();
    }

    /**
     * 
     * @return 
     */
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
