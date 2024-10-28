package unidad02.ejercicios;

/**
 * Pares
 * Ahora sí empiezan los bucles. Escribe un programa que muestre todos los
 * números pares entre A y B, siendo estos dos valores dos números introducidos
 * por teclado. A debe ser menor que B, claro. En caso contrario, el programa
 * debe avisarnos, pero con cariño.
 * 
 * @author diego
 */
public class Ejercicio09 {
    
    public static void main(String[] args) {
        // Metemos valores en las variables, pero deben introducirse por teclado.
        int a = -7;
        int b = 12;
        if (a % 2 != 0) a++;
        for (int contador = a; contador <= b; contador += 2) {
            /*
            Supongamos que os piden que el cero no se cuente
            como número par:
            */
            if (contador != 0){
                System.out.println(contador + " es par.");
            }
        }
        
    }
    
}
