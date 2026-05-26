package unidad05.estructurasDinamicas.pilas_colas;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     Todas las inserciones y eliminaciones se realizan por un solo extremo llamado tope o cima.
 * </p>
 * <p>
 *     Una cola es una estructura LIFO (Last In, First Out). Esto es, el último elemento
 *     en entrar en la cola es el primero que sale.
 * </p>
 * <p>
 *     Las operaciones básicas en una cola son:
 *     <ul>
 *         <li>push (apilar): agrega un nuevo elemento en la cima de la pila.</li>
 *         <li>pop (desapilar): elimina y devuelve el elemento que se encuentra en la cima.</li>
 *         <li>peek / top (cima): devuelve el elemento que está en la cima sin eliminarlo de la pila.</li>
 *         <li>isEmpty (vacía): comprueba si la pila está vacía.</li>
 *     </ul>
 * </p>
 * <p>
 *     La pila de este ejemplo se compone de un nodo que contiene un dato numérico Integer y un puntero al
 *     siguiente elemento.<br>
 * </p>
 */
public class PilaNumeros {

    /**
     * Las clases sirven para permitirnos construir tipos de datos complejos.
     * Este es el caso, donde cada nodo de la cola se compondrá de un número
     * entero y un puntero al siguiente elemento de la cola.
     */
    class Nodo {
        Integer dato;
        Nodo siguiente;
    }

    /**
     * Variable que apunta al nodo que hay en la cima de la cola.
     */
    private Nodo cima = null;

    /**
     * Tamaño de la pila.
     */
    private Integer size = 0;

    /**
     * Comprueba si la pila está vacía.
     * @return true si no tiene elementos.
     */
    public boolean isEmpty() {
        return (cima == null);
    }

    /**
     * Agrega un nuevo elemento en la cima de la pila.
     * @param nuevoNumero Número que se incluirá en el nodo.
     */
    public void push(Integer nuevoNumero) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = nuevoNumero;

        if (isEmpty()) {
            cima = nuevoNodo;
        }
        else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
        size++;
    }

    /**
     * Elimina y devuelve el elemento que se encuentra en la cima.
     * @return Número incluido en el nodo.
     */
    public Integer pop() {
        if (isEmpty()) return null;

        Nodo nodoAux = cima.siguiente;
        Integer numero = cima.dato;
        cima = nodoAux;
        size--;

        return numero;
    }

    /**
     * Devuelve el elemento que está en la cima sin eliminarlo de la pila.
     * @return Número del último nodo.
     */
    public Integer peek() {
        if (isEmpty()) return null;

        return cima.dato;
    }

    public Integer size() {
        return size;
    }

    public void print() {
        List<Integer> lista = new ArrayList<>();
        Nodo nodoAux = cima;
        while(nodoAux != null) {
            lista.add(nodoAux.dato);
            nodoAux = nodoAux.siguiente;
        }

        System.out.println(lista);
    }
}
