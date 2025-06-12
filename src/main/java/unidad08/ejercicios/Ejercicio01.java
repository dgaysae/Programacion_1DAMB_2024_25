package unidad08.ejercicios;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

/**
 * Contar los 1000 primeros números.
 * Se irán guardando de 20 en 20 en un fichero.
 * 
 * @author diego
 */
public class Ejercicio01 {
    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser elegirFichero = new JFileChooser();
        int estado = elegirFichero.showSaveDialog(null);
        if (estado != JFileChooser.APPROVE_OPTION) {
            return;
        }
        PrintWriter escribirEnFichero = new PrintWriter(elegirFichero.getSelectedFile());
        
        for (int i = 1; i <= 1000; i++) {
            escribirEnFichero.print(i + " ");
            if (i % 20 == 0) {
                escribirEnFichero.println();
            }
        }
        
        escribirEnFichero.close();
    }
}
