package RECUPERACION.cartonBingo;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase que crea un cartón de bingo.
 * Las reglas que sigue para ello son:
 * <ol>
 *     <li>En la columna 1 puede haber números entre 1 y 10, en la 2ª entre 11 y 20, en la 3ª entre 21 y 30… y en la última entre 81 y 90.</li>
 *     <li>Los números de cada columna van ordenados de menor (arriba) a mayor (abajo).</li>
 *     <li>Todas y cada una de las filas tienen 4 huecos.</li>
 * </ol>
 * La carga por columnas de la matriz es mucho más correcta (por filas es muy poco "elegante").
 * @author diego
 */
public class CartonBingo {

    public static final int FILAS = 3;
    public static final int COLUMNAS = 9;
    public static final int HUECOS_POR_FILA = 4;

    private Integer[][] carton = new Integer[3][9];
    private Random aleatorio = new Random();

    public CartonBingo() {
//        loadCartonByFilas();
        loadCartonByColumnas();

        ponerHuecos();
    }

    /**
     * Carga la matriz del cartón fila a fila.
     */
    private void loadCartonByFilas() {

        for (int fila = 0; fila < carton.length; fila++) {
            for (int columna = 0; columna < carton[fila].length; columna++) {

                carton[fila][columna] = getAleatorio(fila, columna);

            }
        }
    }

    /**
     * Rellena el cartón columna a columna.
     */
    private void loadCartonByColumnas() {

        for (int columna = 0; columna < COLUMNAS; columna++) {

            rellenarColumna(columna);

        }
    }

    /**
     * Crea una lista de tres números y los ordena para colocarlos en la columna.
     * La columna determina el rango de números válidos.
     * Cuando se crea hay que comprobar que no esté repetido.
     * @param columna
     */
    private void rellenarColumna(int columna) {
        int[] numerosColumna = new int[FILAS];
        int limiteInferior = 0;
        int limiteSuperior = 0;
        int valorAleatorio = 0;
        boolean valorRepetido = false;

        limiteInferior = columna * 10 + 1;
        limiteSuperior = columna * 10 + 10;

        for (int i = 0; i < numerosColumna.length; i++) {
            do {
                valorRepetido = false;
                valorAleatorio = aleatorio.nextInt(limiteInferior, limiteSuperior + 1);

                if (contains(numerosColumna, valorAleatorio)) {
                    valorRepetido = true;
                } else {
                    numerosColumna[i] = valorAleatorio;
                }
            } while (valorRepetido);
        }

        Arrays.sort(numerosColumna);

        for (int fila = 0; fila < FILAS; fila++) {
            carton[fila][columna] = numerosColumna[fila];
        }
    }

    /**
     * Comprueba si el número introducido está en el array.
     * @param listaNumeros
     * @param numeroABuscar
     * @return true si el numero a buscar está en la lista de números.
     */
    private boolean contains(int[] listaNumeros, int numeroABuscar) {
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] == numeroABuscar) {
                return true;
            }
        }
        return false;
    }

    private int getAleatorio(int fila, int columna) {
        int limiteInferior = columna * 10 + 1;
        int limiteSuperior = columna * 10 + 10;

        switch (fila) {
            case 0:
                return aleatorio.nextInt(limiteInferior, limiteInferior + 3);
            case 1:
                return aleatorio.nextInt(limiteInferior + 3, limiteInferior + 6);
            default:
                return aleatorio.nextInt(limiteInferior + 6, limiteSuperior);
        }
    }

    public void printCarton() {
        for (int fila = 0; fila < carton.length; fila++) {
            System.out.println(Arrays.toString(carton[fila]));
        }
    }

    private void ponerHuecos() {
        int[] huecos;

        for (int fila = 0; fila < FILAS; fila++) {
            huecos = getIndicesHuecos();
            for (int i = 0; i < huecos.length; i++) {
                int indice = huecos[i];
                carton[fila][indice] = null;
            }
        }
    }

    /**
     * El do-while, al repetirse en varios métodos, es recomendable refactorizarlo
     * en otro método.
     * @return 
     */
    private int[] getIndicesHuecos() {
        int[] indicesHuecos = new int[HUECOS_POR_FILA];
        int valorAleatorio;
        boolean valorRepetido = false;
        
        for (int i = 0; i < indicesHuecos.length; i++) {
            do {
                valorRepetido = false;
                valorAleatorio = aleatorio.nextInt(0, COLUMNAS);

                if (contains(indicesHuecos, valorAleatorio)) {
                    valorRepetido = true;
                } else {
                    indicesHuecos[i] = valorAleatorio;
                }
            } while (valorRepetido);
        }

        return indicesHuecos;
    }

}
