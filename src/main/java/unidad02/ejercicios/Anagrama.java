package unidad02.ejercicios;

/**
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 * 
 * @author diego
 */
public class Anagrama {
    
    public static void main(String[] args) {
        String palabra1 = "sobre";
        String palabra2 = "breso";
        System.out.println(palabra1 + " y " + palabra2 + " son anagramas? "
                + sonAnagramas(palabra1, palabra2));
        
    }
    
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        /**
         * caracter se usa para guardar una letra de palabra1 en cada iteración
         * del bucle.
         * Ejemplo: si palabra1 = "cosa", caracter sería "c", luego "o", etc.
         */
        String caracter;
        
        /**
         * Cada vez que comprobemos un carácter, lo guardamos en esta variable.
         * De esa forma luego sólo hay que comprobar si el caracter está aquí, lo
         * que significa que ya lo hemos evaluado y no hay que volver a hacerlo.
         */
        String caracteresEvaluados = "";
        
        /**
         * Al tomar un carácter, comprobamos cuántas veces se repite en palabra1
         * para luego ver si es el mismo número de repeticiones que en palabra2.
         */
        int caracterSeRepite = 0;
        
        /**
         * Irá indicando la posición de carácter a coger en cada iteración.
         */
        int posicion = 0;
        
        // ponemos ambas palabras en minúsculas para evitar el case-sensitive.
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        
        /*
         Si son la misma palabra o tienen longitudes distintas, obviamente no
         son anagramas.
         */
        if (palabra1.equals(palabra2)
                || palabra1.length() != palabra2.length()) {
            return false;
        }
        
        /*
         Iremos cogiendo caracter a caracter en la primera palabra, evitando
         que la posición salga de los límites de la cadena de texto.
         */
        while (posicion < palabra1.length()) {
            
            // tomamos el caracter de la posición indicada:
            caracter = palabra1.substring(posicion, posicion + 1);


            /*
            Si el caracter ya ha sido evaluado, no hacemos nada y pasamos al
            siguiente.
            */
            if (!caracteresEvaluados.contains(caracter)) {
                caracteresEvaluados += caracter;
                
                // Cuenta las veces que se repite en palabra1:
                caracterSeRepite = contarLetra(palabra1, caracter);
                
                // Si se repite las mismas veces en la palabra2...
                if (caracterSeRepite != contarLetra(palabra2, caracter)) {
                    return false;
                }
            }
            posicion++;
        }
        
        return true;
    }
    
    /**
     * Comprueba el número de veces que una letra se repite en una cadena de
     * texto.
     * El método no admite más que una letra en el segundo parámetro. En caso
     * contrario, devolverá 0.
     * @param palabra Cadena en la que buscar la letra.
     * @param letra Letra a buscar.
     * @return Nº de repeticiones.
     */
    public static int contarLetra(String palabra, String letra) {
        if (palabra.isEmpty() || letra.isEmpty()) return 0;
        if (letra.length() > 1) return 0;
        
        int contador = 0;
        int posicion = 0;
        while (posicion < palabra.length()
                && palabra.indexOf(letra, posicion) >= 0) {
            contador++;
            posicion = palabra.indexOf(letra, posicion) + 1;
        }
        return contador;
    }
}
