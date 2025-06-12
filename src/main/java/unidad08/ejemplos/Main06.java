package unidad08.ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reyes
 */
public class Main06 {

    public static void main(String[] args) {
        try (BufferedReader lector = new BufferedReader(new FileReader("ejemplo10.txt"))) {
            String linea;
            int contador=0;
            while ((linea = lector.readLine()) != null) {
                String [] palabras=linea.split("\\s+");
                contador+=palabras.length;
                System.out.println("linea-->" + linea);
            }
            System.out.println("Las palabras del documento son--> "+ contador);
        } catch (Exception ex) {
            Logger.getLogger(Main06.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
