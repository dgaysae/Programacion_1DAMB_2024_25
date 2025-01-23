package unidad05.listasEnlazadas;

/**
 * 
 * @author diego
 */
public class ListaEnlazada {
    
    class Nodo {
        int dato;
        Nodo siguiente;
    }
    
    private Nodo lista;
    
    public boolean isEmpty() {
        return (lista == null);
    }
    
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
