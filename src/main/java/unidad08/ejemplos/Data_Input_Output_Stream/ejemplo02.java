package unidad08.ejemplos.Data_Input_Output_Stream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ejemplo02 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\datosPersonajes.data";
        
        try (DataInputStream lectorData = new DataInputStream(new BufferedInputStream(new FileInputStream(nombreFichero)));) {
            
            String nombre;
            String apellido;
            int edad;
            float altura;
            boolean existio = false;

            while (lectorData.available() > 0) {
                nombre = lectorData.readUTF();
                apellido = lectorData.readUTF();
                edad = lectorData.readInt();
                altura = lectorData.readFloat();
                existio = lectorData.readBoolean();
                
                System.out.print(nombre + " " + apellido + " tenía " + edad + " años y medía " + altura + "m.");
                if (existio)
                    System.out.println(" Era un personaje real.");
                else
                    System.out.println(" Es un personaje ficticio.");
            }
            /*
                escritorData.writeUTF(nombres[i]);
                escritorData.writeUTF(apellidos[i]);
                escritorData.writeInt(edades[i]);
                escritorData.writeFloat(alturas[i]);
                escritorData.writeBoolean(existieron[i]);
             */

        } catch (IOException e) {
            System.out.println("Error! No se ha podido tratar el fichero. " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
