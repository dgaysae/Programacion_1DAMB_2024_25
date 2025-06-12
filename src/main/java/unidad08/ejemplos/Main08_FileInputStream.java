package unidad08.ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Main08_FileInputStream {

    public static void main(String[] args) {
        try {
            FileInputStream leerDeFichero = new FileInputStream("./perroo.jpg");
            FileOutputStream escribirEnFichero = new FileOutputStream("./perro_COPIA.jpg");

            byte[] buffer = new byte[512];
            int byteLeidos = 0;
            while ((byteLeidos = leerDeFichero.read(buffer)) != -1) {
                System.out.println(Arrays.toString(buffer));
                escribirEnFichero.write(buffer, 0, byteLeidos);
            }

            System.out.println("Fichero copiado!");

            leerDeFichero.close();
            escribirEnFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! " + e.getMessage());
        } catch (IOException e) {
        }
    }
}
