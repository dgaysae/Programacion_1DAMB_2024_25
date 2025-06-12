package recuperacion;

/**
 *
 * @author diego
 */
public class Fibonacci {
    public static void main(String[] args) {
        int capacidad = 20;

        printFibonacci(capacidad);
    }
    
    public static void printFibonacci(int capacidad) {
        int suma = 0;
        int numero = 1;
        int numeroAnterior = 0;
        
        String sucesion = numero + ", ";
        
        for(int i = 1; i < capacidad; i++) {
            suma = numero + numeroAnterior;
            numeroAnterior = numero;
            numero = suma;
            sucesion += numero + ", ";
        }
        
        sucesion = sucesion.substring(0, sucesion.length() - 2);
        System.out.println(sucesion);
    }
}
