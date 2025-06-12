package unidad08.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Otra versión del mismo ejercicio, creando una falsa pila.
 * 
 * @see Ejercicio03a
 * @author diego
 */
public class Ejercicio03b {
    public static void main(String[] args) {
        BufferedReader leerDeFichero = null;
        PrintWriter escribirEnFichero = null;
        try {
            leerDeFichero = new BufferedReader(new FileReader("./fichero.txt"));
            escribirEnFichero = new PrintWriter(new FileWriter("./fichero_COPIA.txt", true));

            ArrayList<String> lineas = new ArrayList<>();
            String linea;

            while ((linea = leerDeFichero.readLine()) != null) {
                System.out.println(linea);
                lineas.add(0, linea);
            }

            for (String lineaTexto : lineas) {
                escribirEnFichero.println(lineaTexto);
            }

            leerDeFichero.close();
            escribirEnFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error de entrada y salida");
        }
        
        cerrar(leerDeFichero);
        cerrar(escribirEnFichero);
    }

    public static void cerrar(AutoCloseable objetoCerrar) {
        try{
            if (objetoCerrar != null) {
                objetoCerrar.close();
            }
        } catch (Exception e) {}
    }
}
