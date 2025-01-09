package unidad05.ejercicios;

/**
 * Crear dos métodos que acepten como parámetro un array de enteros y devuelvan:
 * - Uno el máximo valor de todos.
 * - El otro, el valor mímino.
 * 
 * @author diego
 */
public class MaximoMinimo {
    public static void main(String[] args) {
        int[] notas = {5, 9, 10, 3, 9};
        
        System.out.println("Valor máximo: " + maximo(notas));
        System.out.println("Valor mínimo: " + minimo(notas));
        
    }
    
    public static int maximo(int[] listaNumeros) {
        int maximo = Integer.MIN_VALUE;
        
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] > maximo) {
                maximo = listaNumeros[i];
            }
        }
        
        return maximo;
    }

    public static int minimo(int[] listaNumeros) {
        int minimo = Integer.MAX_VALUE;
        
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] < minimo) {
                minimo = listaNumeros[i];
            }
        }
        
        return minimo;
    }
}
