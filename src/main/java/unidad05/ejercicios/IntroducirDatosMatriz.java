package unidad05.ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En este ejemplo se le pide al usuario que indique el número de filas y columnas
 * para dimensionar una matriz.
 *
 * Además se realizan algunas funciones que se explican en cada caso.
 * @author diego
 */
public class IntroducirDatosMatriz {

    public static Scanner entradaTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numFilas, numColumnas;
        System.out.println("CREAR MATRIZ ********************");
        System.out.println("Introduzca nº filas de la matriz:");
        boolean numeroCorrecto = false;
        do {
            numFilas = obtenerEnteroDeTeclado();
            numeroCorrecto = numFilas > 0;
            if (!numeroCorrecto) {
                System.out.println("Introduzca un nº positivo, por favor");
            }
        } while (!numeroCorrecto);

        System.out.println("Introduzca nº columnas de la matriz:");
        do {
            numColumnas = obtenerEnteroDeTeclado();
            numeroCorrecto = numColumnas > 0;
            if (!numeroCorrecto) {
                System.out.println("Introduzca un nº positivo, por favor");
            }
        } while (!numeroCorrecto);

        char[][] matrizCaracteres = new char[numFilas][numColumnas];
        imprimirMatriz(matrizCaracteres);
        
        filasParesImpares(matrizCaracteres);
        imprimirMatriz(matrizCaracteres);
        
        columnasParesImpares(matrizCaracteres);
        imprimirMatriz(matrizCaracteres);
    }
    
    /**
     * Imprime por pantalla la matriz introducida.
     * @param matrizCaracteres Matriz a imprimir.
     */
    public static void imprimirMatriz(char[][] matrizCaracteres) {
        System.out.println("Matriz --------------------");
        for (char[] fila : matrizCaracteres) {
            System.out.println(Arrays.toString(fila));
        }
    }

    /**
     * Rellena la matriz introducida fila a fila, poniendo el caracter 'p'
     * (de par) en las filas pares e 'i' (de impar) en las filas impares.
     * @param matriz Matriz a rellenar
     */
    public static void filasParesImpares(char[][] matriz) {
        boolean esPar;
        char letraRelleno;
        
        for (int fila = 0; fila < matriz.length; fila++) {
            esPar = (fila % 2 == 0);
            letraRelleno = esPar ? 'p' : 'i';
            
            // Alternativa 1, más tradicional:
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = letraRelleno;
            }
            
            // Alternativa 2, usando la clase Arrays:
            //Arrays.fill(matriz[fila], letraRelleno);
        }        
    }

    /**
     * Rellena la matriz introducida columna a columna, poniendo el
     * caracter 'p' (de par) en las columnas pares e 'i' (de impar)
     * en las impares.
     * @param matriz Matriz a rellenar
     */
    public static void columnasParesImpares(char[][] matriz) {
        boolean esPar;
        char letraRelleno;
        
        for (int columna = 0; columna < matriz[0].length; columna++) {
            esPar = (columna % 2 == 0);
            letraRelleno = esPar ? 'p' : 'i';
            
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna] = letraRelleno;
            }
        }
    }

    /**
     * Lee un número entero de teclado.
     *
     * @return Entero introducido por el usuario.
     */
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

}
