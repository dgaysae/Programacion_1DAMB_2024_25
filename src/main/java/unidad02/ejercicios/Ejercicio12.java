package unidad02.ejercicios;

/**
 *
 * @author diego
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        //printCuadrado(5);
        printTriangulo(9);
    }

    /**
     * 
     * @param altura 
     */
    public static void printCuadrado(int altura) {
        for (int h = 0; h < altura; h++) {
            for (int base = 0; base < altura; base++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    
    public static void printTriangulo(int altura) {
        final String ESPACIO = " ";
        final String ASTERISCO = "*";
        int contEspacios = altura - 1;
        int contAsteriscos = 1;
        
        for (int h = 0; h < altura; h++) {
            for (int contE = 0; contE < contEspacios; contE++) {
                System.out.print(ESPACIO);
            }
            
            for (int contA = 0; contA < contAsteriscos; contA++) {
                System.out.print(ASTERISCO);
            }
            System.out.println("");
            contEspacios--;
            contAsteriscos += 2;
        }
    }

}
