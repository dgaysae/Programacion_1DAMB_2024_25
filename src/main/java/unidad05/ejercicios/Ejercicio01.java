package unidad05.ejercicios;

/**
 * Inicializar array.
 * Escribe un programa en Java en el que se defina un array de 100 números
 * enteros, se inicialicen todos los elementos al valor –1 y se impriman por
 * pantalla.
 * 
 * @author diego
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int[] listaNumeros = new int[100];
        
        for(int i = 0; i < listaNumeros.length; i++){
            listaNumeros[i] = -1;
        }
        
        for(int i = 0; i < listaNumeros.length; i++){
            System.out.print(listaNumeros[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------");
        
        int[] masNumeros = new int[100];
        for(int i = 0; i < masNumeros.length; i++){
            masNumeros[i] = -1;
        }

        // Se puede recorrer con un for each:
        for (int numero : masNumeros) {
            System.out.print(numero + " ");
        }
    }
}
