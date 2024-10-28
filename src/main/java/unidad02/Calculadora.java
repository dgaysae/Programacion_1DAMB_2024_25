package unidad02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Calculadora {

    public static Scanner entradaTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        int iNum1,
                iNum2,
                opcion;
        double dNum1;

        opcion = printMenu();

        if (opcion != 5) {
            // Petición de operandos al usuario
            System.out.println("Introduzca el primer operando: ");
            iNum1 = obtenerEnteroDeTeclado();

            System.out.println("Introduzca el segundo operando: ");
            iNum2 = obtenerEnteroDeTeclado();
            
            switch (opcion) {
                case 1:
                    System.out.printf("%d + %d = %d \n",
                            iNum1,
                            iNum2,
                            iNum1 + iNum2);
                    break;
                case 2:
                    System.out.printf("%d - %d = %d \n",
                            iNum1,
                            iNum2,
                            iNum1 - iNum2);
                    break;
                case 3:
                    System.out.printf("%d * %d = %d \n",
                            iNum1,
                            iNum2,
                            iNum1 * iNum2);
                    break;
                case 4:
                    if (iNum2 != 0) {
                        System.out.printf("%d / %d = %d \n",
                                iNum1,
                                iNum2,
                                iNum1 / iNum2);
                    } else {
                        System.out.println("ERROR! División por cero!");
                    }
                    break;
                default:
                    System.out.println("ERROR! Operación no válida!");
            }
        }

        entradaTeclado.close();
    }

    public static int printMenu() {
        int opcion = 0;

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("----------");

        do {
            System.out.print("Introduzca la operación a realizar: ");
            opcion = obtenerEnteroDeTeclado();
        } while (opcion < 1 || opcion > 5);

        return opcion;
    }

    public static int obtenerEnteroDeTeclado() {
        int numeroObtenido;

        try {
            numeroObtenido = entradaTeclado.nextInt();
        } catch (InputMismatchException e) {
            numeroObtenido = 0;
        }
        entradaTeclado.nextLine();

        return numeroObtenido;
    }

    public static double obtenerDoubleDeTeclado() {
        double numeroObtenido;
        try {
            numeroObtenido = entradaTeclado.nextDouble();
        } catch (InputMismatchException e) {
            numeroObtenido = 0;
        }
        entradaTeclado.nextLine();

        return numeroObtenido;
    }

}
