package unidad08.ejemplos.Object_Input_Output_Stream.ejemplo02;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Este ejemplo muestra cómo escribir objetos en un fichero.
 * El objeto ObjectOutputStream suele escribir una cabecera con información de los objetos que va
 * a escribir justo a continuación en el fichero.
 * Por tanto, hay que detectar si el fichero es nuevo o si tiene o no datos para usar en su lugar otro
 * objeto ObjectOutputStream, pero éste no debe escribir esa cabecera.
 * @author diego
 */
public class Main10_ObjectOutputStream {

    public static final File fichero = new File("./objectoutputstream.test");

    public static void main(String[] args) {
        escribirObjetoEnFichero();
        leerObjetoDeFichero();
    }

    public static void escribirObjetoEnFichero() {

        FileOutputStream escribirEnFichero = null;
        ObjectOutputStream escribirObjetos = null;
        try {
            if (fichero.exists()) {
                escribirEnFichero = new FileOutputStream(fichero, true);
                escribirObjetos = new EscribirCoches(escribirEnFichero);
            } else {
                escribirEnFichero = new FileOutputStream(fichero);
                escribirObjetos = new ObjectOutputStream(escribirEnFichero);
            }

            escribirObjetos.writeObject(new Coche("Audi", "AudiChachi", 1200));
            escribirObjetos.writeObject(new Coche("Audi1", "AudiChachi1", 1300));
            escribirObjetos.writeObject(new Coche("Audi2", "AudiChachi2", 1400));
            escribirObjetos.writeObject(new Coche("Audi3", "AudiChachi3", 1500));

            System.out.println("Objeto guardado correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("ERROR! No se ha podido realizar la operación en el fichero. " + e.getMessage());
        }

        cerrar(escribirEnFichero, escribirObjetos);
    }

    private static void cerrar(AutoCloseable... objetosACerrar) {
        try {
            for (AutoCloseable objetoACerrar : objetosACerrar) {
                if (objetoACerrar != null) {
                    objetoACerrar.close();
                }
            }
        }
        catch (IOException e) {}
        catch (Exception e) {}
    }

    private static void leerObjetoDeFichero() {
        try (ObjectInputStream leerObjetos = new ObjectInputStream(
                new FileInputStream(fichero))) {
            // Forma habitual:
//            Coche coche;
//            while ( (coche = (Coche) leerObjetos.readObject()) != null) {
//                System.out.println("Coche: " + coche);
//            }

            //Forma menos elegante:
            while (true) {
                Coche coche = (Coche) leerObjetos.readObject();
                System.out.println("Coche: " + coche);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (EOFException e) {
            System.out.println("Fichero leido correctamente!!!!!!!!!!!! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException.- " + e.getMessage());
        }
    }
}
