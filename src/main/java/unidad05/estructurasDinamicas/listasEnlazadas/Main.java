package unidad05.estructurasDinamicas.listasEnlazadas;

/**
 * 
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        if (listaEnlazada.isEmpty()) {
            System.out.println("La lista está vacía.");
        }
        System.out.println("------------");
        
        System.out.println("Vamos a añadir el 17:");
        listaEnlazada.add(17);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        
        System.out.println("Vamos a insertar los valores 3, 9 y 2:");
        listaEnlazada.insert(3);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        
        System.out.println("------------");
        
        listaEnlazada.add(9);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        
        System.out.println("------------");
        
        listaEnlazada.insert(2);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        
        
    }
}
