package unidad05;

import java.util.Arrays;

/**
 * Clase Arrays.
 * 
 * @author diego
 */
public class Ejemplo04Arrays {
    public static void main(String[] args) {
        int[] edades = {34, 55, 61, 98, 12};
        
        System.out.println("IMPRIMIR ARRAY ---------------------");
        printArray(edades);
        System.out.println("Con Arrays: " + Arrays.toString(edades));
        
        System.out.println("BÚSQUEDA BINARIA EN ARRAY ---------------------");
        System.out.println("Array: " + Arrays.toString(edades));
        System.out.println("Búsqueda binaria (sin ordenar): " + Arrays.binarySearch(edades, 98));
        Arrays.sort(edades);
        System.out.println("Array: " + Arrays.toString(edades));
        System.out.println("Búsqueda binaria (ordenada): " + Arrays.binarySearch(edades, 98));
        
        System.out.println("RELLENAR ARRAY ---------------------");
        System.out.println("Array antes de rellenar: " + Arrays.toString(edades));
        Arrays.fill(edades, 77);
        System.out.println("Array después de rellenar: " + Arrays.toString(edades));
        
        
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println();
    }
}
