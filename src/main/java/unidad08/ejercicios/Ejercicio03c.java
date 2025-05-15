package unidad08.ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * Otra versión del mismo ejercicio, usando una pila.
 * @author diego
 */
public class Ejercicio03c {
    public static void main(String[] args) {
        BufferedReader leerDeFichero = null;
        PrintWriter escribirEnFichero = null;
        try {
            leerDeFichero = new BufferedReader(new FileReader("./fichero.txt"));
            escribirEnFichero = new PrintWriter(new FileWriter("./fichero_COPIA.txt", true));

            Stack<String> lineasStack = new Stack<>();
            String linea;

            while ((linea = leerDeFichero.readLine()) != null) {
                lineasStack.push(linea);
            }

            while (!lineasStack.isEmpty()) {
                escribirEnFichero.println(lineasStack.pop());
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
