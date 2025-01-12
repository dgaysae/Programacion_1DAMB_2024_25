package unidad05;

/**
 * 
 * @author diego
 */
public class Ejemplo02Matrices {
    public static void main(String[] args) {
        int[][] notas = new int[5][6];
        
        notas[2][3] = 8;
        System.out.println("notas[0][0] = " + notas[0][0]);
        System.out.println("notas[2][3] = " + notas[2][3]);
        
        System.out.println("----------------");
        
        imprimirMatriz(notas);
        rellenarMatriz(notas, -9);
        imprimirMatriz(notas);        
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int nota : fila) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }

    public static void rellenarMatriz(int[][] matriz, int defaultValue) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = defaultValue;
            }
        }
    }
}
