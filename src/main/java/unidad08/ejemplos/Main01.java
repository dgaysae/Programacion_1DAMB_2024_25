package unidad08.ejemplos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class Main01 {
    public static void main(String[] args) {
        boolean isDirectory = false;
        
//        File fichero = new File("/home/diego/Descargas/Cafetera - enunciado.txt");
        File fichero = new File("/home/diego");
        
        if (fichero.exists()) {
            isDirectory = fichero.isDirectory();
            
            System.out.println("Existe");
            if (isDirectory) {
                System.out.print("d");
            }
            else {
                System.out.print("-");
            }
            
            if (fichero.canRead()) {
                System.out.print("r");
            }
            else {
                System.out.print("-");
            }
            
            if (fichero.canWrite()) {
                System.out.print("w");
            }
            else {
                System.out.print("-");
            }
            
            if (fichero.canExecute()) {
                System.out.print("x");
            }
            else {
                System.out.print("-");
            }
            
            System.out.print(" ");
            System.out.print(fichero.length());

            System.out.print(" ");
            System.out.println(fichero.getName());
            
            System.out.println("");
            System.out.println(fichero.getAbsolutePath());
            try {
                System.out.println(fichero.getCanonicalPath());
            }
            catch (IOException e) {
                System.out.println("Error!");
            }
            
            if (isDirectory) {
                System.out.println("Contenido del directorio:");
                
                File[] ficheros = fichero.listFiles();
                
                for(File archivo : ficheros) {
                    System.out.println(archivo);
                }
                
                
            }
            
        }
        else {
            System.out.println("Te lo has inventado");
        }
    }
}
