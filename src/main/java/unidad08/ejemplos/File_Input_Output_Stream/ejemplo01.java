package unidad08.ejemplos.File_Input_Output_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ejemplo01 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\prueba.txt";
        try (FileInputStream fis = new FileInputStream(nombreFichero);) {

            System.out.println("Tamaño aproximado en bytes: " + fis.available());

            int byteLeido;
            while((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido);
            }
            
            System.out.println("Lectura OK");

        } catch (FileNotFoundException e) {
            System.out.println("Error! El fichero no existe. " + e.getMessage());
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error! No se ha podido tratar el fichero. " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
