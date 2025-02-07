package unidad05.estructurasDinamicas.listasEnlazadas;

/**
 * Una lista enlazada tiene como unidad de información un nodo, compuesto de una zona para datos y otra
 * para un puntero que apunte al siguiente nodo.
 * @author diego
 */
public class ListaEnlazada {

    /**
     * Clase interna (inner class)
     */
    class Nodo {
        int dato;
        Nodo siguiente;
    }
    
    private Nodo lista;
    
    public boolean isEmpty() {
        return (lista == null);
    }

    /**
     * Inserta un nuevo elemento al principio de la lista.
     * @param nuevoNumero Número a insertar.
     */
    public void insert(int nuevoNumero) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = nuevoNumero;
        
        if (isEmpty()) {
            lista = nuevoNodo;
        }
        else {
            nuevoNodo.siguiente = lista;
            lista = nuevoNodo;
        }
    }
    
    public void add(int numeroAlFinal) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = numeroAlFinal;
        
        if (isEmpty()) {
            lista = nuevoNodo;
        }
        else {
            Nodo nodoAux = lista;
            while(nodoAux.siguiente != null) {
                nodoAux = nodoAux.siguiente;
            }
            nodoAux.siguiente = nuevoNodo;
        }
    }

    /**
     * TODO: Borra el dato de la posición indicada.
     * @param posicion Posición del dato a borrar.
     */
    public void removeAt(int posicion) {

    }

    /**
     * Se puede implementar un contador como otra propiedad de ListaEnlazada
     * y que se actualice (incremente/decremente) cada vez que se añadan o se
     * borren elementos de la lista.
     * @return Tamaño de la lista.
     */
    public int size() {
        //if (isEmpty()) return 0;
        
        Nodo nodoAux = lista;
        int contador = 0;
        while (nodoAux != null) {
            contador++;
            nodoAux = nodoAux.siguiente;
        }
        return contador;
    }
    
    public void printLista() {
        if (isEmpty()) {
            System.out.println("[ ]");
            return;
        }
        
        Nodo nodoAux = lista;
        do {
            System.out.println(nodoAux.dato);
            nodoAux = nodoAux.siguiente;
        } while (nodoAux != null);
    }
}
