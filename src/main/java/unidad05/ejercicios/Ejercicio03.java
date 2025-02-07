package unidad05.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Una posible solución del ejercicio 3 de la relación.
 * @author diego
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<String> clavesABorrar = new ArrayList<>();
        
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("seis", 6);
        mapa.put("menosUno", -1);
        mapa.put("cuatro", 4);
        mapa.put("dos", 2);
        mapa.put("uno", 1);
        mapa.put("menosSeis", -6);
        mapa.put("menosDos", -2);
        
        System.out.println(mapa);
        System.out.println("----------------------");
        System.out.println("Borrar negativos:");

        for(Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            if (entrada.getValue() < 0) {
                clavesABorrar.add(entrada.getKey());
            }
        }
        System.out.println("Claves a borrar: " + clavesABorrar);
        for(String claveABorrar : clavesABorrar) {
            mapa.remove(claveABorrar);
        }
        
        System.out.println(mapa);
        
    }
}
