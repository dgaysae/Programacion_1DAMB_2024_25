package unidad05.ejercicios;

/**
 * Crear un método que acepte como parámetro un array de enteros y devuelva
 * la media aritmética de sus valores.
 * 
 * @author diego
 */
public class MediaAritmetica {
    public static void main(String[] args) {
        int[] notas = {5, 9, 10, 3, 9};
        
        System.out.println("Media de notas = "
                + mediaAritmetica(notas));
        
    }
    
    public static double mediaAritmetica(int[] listaNotas) {
        int suma = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            suma += listaNotas[i];
        }
        return (double)suma / listaNotas.length;
    }
}
