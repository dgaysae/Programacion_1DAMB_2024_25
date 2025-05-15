package unidad08.ejemplos.File_Input_Output_Stream;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ejemplo02 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\nuevoFichero.txt";
        String texto = "Hola, caracola! Este texto se ha insertado desde el programa usando FileOutputStream.";

        try (FileOutputStream fos = new FileOutputStream(nombreFichero);) {
            byte[] cadena = texto.getBytes();
            
            fos.write(cadena);
            
            System.out.println("Escritura OK");

        } catch (FileNotFoundException e) {
            System.out.println("Error! El fichero no existe. " + e.getMessage());
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error! No se ha podido tratar el fichero. " + e.getMessage());
//            e.printStackTrace();
        }
        
        System.out.println("*********************************");
        System.out.println("Operación finalizada.");
    }
}
