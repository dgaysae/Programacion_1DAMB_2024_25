package recuperacion;

import java.util.Arrays;

/**
 *
 * @author diego
 */
public class CrearMatriz01 {

    public static void main(String[] args) {
        int[] X = {5, 6, 9, 1, 2};
        int filas = 5;
        
        printMatrizGenerada(filas, X);
    }

    public static void printMatrizGenerada(int filas, int[] arrayOrigen) {
        int[][] matriz = new int[filas][arrayOrigen.length];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < arrayOrigen.length; columna++) {
                matriz[fila][columna] = arrayOrigen[columna];
            }
        }

        printMatriz(matriz);
    }
    
    public static void printMatrizGenerada2(int filas, int[] arrayOrigen) {
        int[][] matriz = new int[filas][arrayOrigen.length];

        for (int fila = 0; fila < filas; fila++) {
            matriz[fila] = arrayOrigen.clone();
        }
        
        printMatriz(matriz);
    }
    
    public static void printMatriz(int[][] matriz) {
        for(int fila = 0; fila < matriz.length; fila++) {
            System.out.println(Arrays.toString(matriz[fila]));
        }
    }
    
    
}
