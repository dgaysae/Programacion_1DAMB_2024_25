package unidad05;

import java.util.Arrays;

/**
 * Vamos a entender cómo funciona la clase ArrayList.
 * 
 * @author diego
 */
public class Ejemplo05ArrayList {
    public static void main(String[] args) {
        int[] notas = new int[4];
        Arrays.fill(notas, 6);
        System.out.printf("El array notas tiene %d elementos%n", notas.length);
        System.out.println(Arrays.toString(notas));
        int longitudInicial = notas.length;
        int[] notasAux = new int[longitudInicial + 5];
        for(int i = 0; i < longitudInicial; i++) {
            notasAux[i] = notas[i];
        }
        notas = notasAux;
        notas[longitudInicial] = 7;
        System.out.printf("El array notas tiene %d elementos%n", notas.length);
        System.out.println(Arrays.toString(notas));
        
        
    }
}
