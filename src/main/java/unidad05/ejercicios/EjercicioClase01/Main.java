package unidad05.ejercicios.EjercicioClase01;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        MiArray a = new MiArray(4);
        
        while(!a.estaLleno()) {
            //a.insertar();
            a.add();
        }
        
        System.out.println("El valor máximo es: " + a.max());
        a.aumentarLength();
    }
}
