package unidad02.ejercicios;

/**
 *
 * @author diego
 */
public class CadenasTexto {

    public static void main(String[] args) {

        String nombre = "Anselmo Onofrio";
        String buscar = "Anselmo";
        int longitud = nombre.length();
        int posicion = 3;

        System.out.printf("Caracter en la posición %d: %c \n",
                posicion,
                nombre.charAt(posicion));

        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }

        System.out.printf("Nombre: %s \n", nombre);
        System.out.printf("Nombre en mayúsculas: %s \n", nombre.toUpperCase());
        System.out.printf("Nombre: %s \n", nombre);

        System.out.printf("%s tiene %d caracteres \n",
                nombre,
                longitud);

        // comprobamos si una cadena contiene otra:
        System.out.printf("la cadena \"%s\" se encuentra en \"%s\"? \n",
                buscar,
                nombre);
        System.out.println(nombre.contains(buscar));

        System.out.printf("En qué posición está la cadena \"%s\" dentro de \"%s\"? \n",
                buscar,
                nombre);

        posicion = nombre.indexOf(buscar);
        System.out.println(posicion);

        nombre += " Francisco";
        System.out.printf("En qué posición está la cadena \"%s\" dentro de \"%s\"? \n",
                buscar,
                nombre);
        System.out.println(nombre.indexOf(buscar, ++posicion));

        buscar = "elmo";
        System.out.printf("En qué posición está la cadena \"%s\" dentro de \"%s\"? \n",
                buscar,
                nombre);
        //System.out.println(nombre.indexOf(buscar, 3, 7));

        nombre += "    ";
        System.out.println("Contar espacios en " + nombre);
        System.out.println("Espacios = " + contarEspacios1(nombre));
        
        System.out.println("Espacios = "+ contarEspacios3("asdfasdfasdf"));
    }

    public static int contarEspacios1(String texto) {
        int contador = 0;
        final int ESPACIO_NUM_ASCII = 32;

        for (int i = 0; i < texto.length(); i++) {
            // Valor ASCII del espacio = 32
            if (texto.charAt(i) == ESPACIO_NUM_ASCII) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarEspacios2(String texto) {
        final char ESPACIO = ' ';
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ESPACIO) {
                contador++;
            }
        }

        return contador;
    }
    
    public static int contarEspacios3(String texto) {
        final String BUSCAR = " ";
        int contadorDeEspacios = 0;
        int posicion = 0;
        
        posicion = texto.indexOf(BUSCAR, posicion);
        while (posicion >= 0) {
            contadorDeEspacios++;
            posicion++;
            posicion = texto.indexOf(BUSCAR, posicion);
        }
        
        return contadorDeEspacios;
    }

}
