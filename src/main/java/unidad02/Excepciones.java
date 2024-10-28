package unidad02.ejemplosClase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Excepciones {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        int numero1,
                numero2;
        double division = 0;

        try {
            System.out.println("Introduce un número: ");
            numero1 = entradaTeclado.nextInt();

            System.out.println("Introduce otro número: ");
            numero2 = entradaTeclado.nextInt();
            division = numero1 / numero2;
        } catch (ArithmeticException e) {
            System.out.println("Operación no válida!!!!!!!!!!");
            System.out.println("El error es: " + e.getMessage());
            //e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Dato incorrecto!!!!!!!!!!");
            System.out.println("El error es: " + e.getMessage());
            //e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error genérico!!!!!!!!!!");
        } finally {
            System.out.println("Esto es el finally");
        }
        
        System.out.println("División = " + division);

        entradaTeclado.close();
    }

}
