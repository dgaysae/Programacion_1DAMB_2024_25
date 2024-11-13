package unidad03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class MainScanner {

    static Scanner entradaTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce entero: ");
        int numero = obtenerEnteroDeTeclado();
        
        System.out.println("Has introducido el número " + numero);
    }

    public static int obtenerEnteroDeTeclado() {
        String numeroTxt;
        int numeroObtenido;

        try {
            numeroTxt = entradaTeclado.nextLine();
            numeroObtenido = Integer.parseInt(numeroTxt);
        } catch (InputMismatchException e) {
            numeroObtenido = 0;
        }
        //entradaTeclado.nextLine();

        return numeroObtenido;
    }

}
