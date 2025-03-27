package unidad08.ejemplos.claseScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Para estas pruebas se ha usado el fichero prueba.txt que se incluye en el
 * directorio del proyecto.
 * 
 * @author diego
 */
public class ejemplo01 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\pruebaModulo08.txt";

        File fichero = new File(nombreFichero);
        
        try {
        
            printTokens(fichero);
            
            System.out.println("--------------------------------");
            
            printLineas(fichero);
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! No se puede abrir el fichero. " + e.getMessage());
//            e.printStackTrace();
        }
    }
    
    public static void printTokens(File fichero) throws FileNotFoundException {
        try (Scanner leer = new Scanner(fichero);) {
            while (leer.hasNext()) {
                System.out.println(leer.next());
                
            }
//            leer.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! No se puede abrir el fichero. " + e.getMessage());
//            e.printStackTrace();
        }
    }

    public static void printLineas(File fichero) throws FileNotFoundException {
        try (Scanner leer = new Scanner(fichero);) {
            while (leer.hasNextLine()) {
                System.out.println(leer.nextLine());
            }
//            leer.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! No se puede abrir el fichero. " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
