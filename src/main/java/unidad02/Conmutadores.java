package unidad02;



import java.util.Scanner;

/**
 * Vamos a usar el conmutador "salir" para determinar cuando salimos
 * de un bucle.
 * 
 * @author diego
 */
public class Conmutadores {

    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);
        int numero;
        int contador = 0;
        int suma = 0;
        final int NUM_FIN = 0;
        boolean salir = false;
        
        System.out.println("Introduce números para sumar.");
        System.out.printf("El %d finaliza la petición. \n", NUM_FIN);
        
        do {
            System.out.printf("Introduzca nº (%d para finalizar):  \n", NUM_FIN);
            numero = entradaTeclado.nextInt();
            //suma = suma + numero;
            salir = numero == NUM_FIN;
            if (!salir){
                contador++;
                suma += numero;
            }
        } while(!salir);
        
        System.out.println("La suma final es: " + suma);
        System.out.println("La media es: " + (double)suma / contador);
        
        
        
        entradaTeclado.close();
        
    }
    
}
