package unidad08.Object_Input_Output_Stream;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ejemplo02 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\datosPersonajes.obj";

        try (ObjectInputStream lectorObjeto = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nombreFichero)));) {
            System.out.println("Bytes del fichero: " + lectorObjeto.available());
            Persona pers;
//            while (lectorObjeto.available() > 0) {
//                pers = (Persona) lectorObjeto.readObject();
//                pers.mostrar();
////                System.out.print("Persona: ");
////                System.out.println(pers);
//            }
            do {
                pers = (Persona) lectorObjeto.readObject();
                if (pers != null)
                    System.out.println(pers);
//            } while (true);
            } while (pers != null);

        } catch (EOFException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error! No se ha podido tratar el fichero. " + e.getMessage());
//            e.printStackTrace();
        } catch (ClassNotFoundException cnfE) {
            cnfE.printStackTrace();
        }
//        System.out.println("*********************************");
//        System.out.println("Operación finalizada.");
    }
}
