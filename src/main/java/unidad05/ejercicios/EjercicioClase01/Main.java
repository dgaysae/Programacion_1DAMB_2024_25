package unidad05.ejercicios.EjercicioClase01;

import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Main {

    static int[] array;
    static int arrayLength = 0;
    static final int LIMITE_POS_VACIAS = 10;
    static final int POS_VACIAS_DEFAULT = 5;

    public static void main(String[] args) {
        array = new int[30];

        for (int i = 0; i < 10; i++) {
            add((int) (Math.random() * 101));
        }

        printPruebas();

        System.out.println("-------------------------");
        borrarDesde(3);
        printPruebas();

        System.out.println("-------------------------");
        add(999);
        printPruebas();

        System.out.println("-------------------------");
        add(25);
        add(376);
        add(73);
        add(17);
        add(863);
        add(215);
        printPruebas();
        
        int[] arrayNuevo = copyOfRange(7, 4);
        if (arrayNuevo == null) {
            System.out.println("No se ha copiado!");
        }
        else {
            System.out.println("Array nuevo: " + Arrays.toString(arrayNuevo));
        }
    }
    
    public static void printPruebas() {
        System.out.println(Arrays.toString(array));
        System.out.println(toString2());
        System.out.println("Longitud: " + length());
    }

    public static void add(int numeroAlFinal) {
        if (arrayLength == array.length) {
            System.out.println("Pruebas > Array lleno");
            aumentarArray();
        }

        array[arrayLength] = numeroAlFinal;
        arrayLength++;
    }

    public static int length() {
        return arrayLength;
    }

    public static void aumentarArray() {
        int[] arrayAux = new int[array.length + POS_VACIAS_DEFAULT];

        //Copiamos el array viejo en el nuevo array:
        for (int i = 0; i < arrayLength; i++) {
            arrayAux[i] = array[i];
        }

        // Referenciamos el array hacia el nuevo:
        array = arrayAux;
    }

    public static boolean isEmpty() {
        return (array != null) && (arrayLength == 0);
    }

    public static void acortarArray() {
        if (isEmpty()) {
            return;
        }
        int numPosicionesLibres = array.length - arrayLength;
        if (numPosicionesLibres >= LIMITE_POS_VACIAS) {
            int[] arrayAux = new int[arrayLength + POS_VACIAS_DEFAULT];
            for (int i = 0; i < arrayLength; i++) {
                arrayAux[i] = array[i];
            }
            array = arrayAux;
        }
    }

    public static boolean indiceDentroDeLimites(int indice) {
        return (indice >= 0 && indice < arrayLength);
    }

    public static void borrarDesde(int posicionInicial) {
        if (!indiceDentroDeLimites(posicionInicial)) {
            System.out.println("ERROR! ArrayIndexOutOfBoundException!!!!");
            return;
        }

        arrayLength = posicionInicial;
    }

    public static void borrar(int desde, int hasta) {
        if (!indiceDentroDeLimites(desde)
                || !indiceDentroDeLimites(hasta)
                || desde >= hasta) {
            System.out.println("ERROR! No hay rango válido que borrar");
            return;
        }
        int copiaMaximo = arrayLength - hasta;
        int contador = 0;

//        for(int i = desde; i < hasta && contador < copiaMaximo; i++) {
        for (int i = desde; i < hasta; i++) {
            array[i] = array[hasta + contador];
            contador++;
            if (contador >= copiaMaximo) {
                break;
            }
        }
        arrayLength = desde + copiaMaximo;
    }

    public static String toString2() {
        StringBuilder msg = new StringBuilder("[");
        for (int i = 0; i < arrayLength; i++) {
            msg.append(array[i]);
            if (i < arrayLength - 1) {
                msg.append(", ");
            }
        }
        msg.append("]");
        return msg.toString();
    }

    /**
     * Copia las posiciones de array desde "from" (incluido) hasta "to"
     * (incluido) en un nuevo array, que devuelve en la salida
     *
     * @param from posicion desde (incluida)
     * @param to posicion hasta (incluida)
     * @return array con los datos copiados
     */
    public static int[] copyOfRange(int from, int to) {
        int[] arrayCopia;
//        if (indiceDentroDeLimites(from)
//                && indiceDentroDeLimites(to)
//                && (from < to)) {
//            
//        }
        try {
            arrayCopia = new int[to - from + 1];
            int contador = 0;
            for(int i = from; i <= to; i++) {
                arrayCopia[contador++] = array[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR! Indices fuera de rango: "
                    + e.getMessage());
            arrayCopia = null;
        } catch (Exception e) {
            System.out.println("ERROR! No se ha podido copiar el array: "
                    + e.getMessage());
            arrayCopia = null;
        }
        return arrayCopia;
    }
    
    /**
     * Ejercicio AISLADO de Manolo.
     * Muestra el array como una tabla.
     */
    public static void mostrarComoTabla() {
        int[] array = new int[20];
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println("");
            }
        }
    }

}
