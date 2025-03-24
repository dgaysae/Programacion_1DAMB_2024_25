package unidad08.Object_Input_Output_Stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ejemplo01 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\datosPersonajes.obj";

        String[] nombres = {"Cid", "Bilbo", "Luck", "Darth", "James", "Guybrush"};
        String[] apellidos = {"Campeador", "Bolson", "Vader", "Goldfinger", "Bond", "Threepwood"};
        int[] edades = {36, 42, 25, 53, 44, 27};
        float[] alturas = {1.78f, 1.23f, 1.67f, 2.12f, 1.96f, 1.83f};
        boolean[] existieron = {true, false, false, false, false, false};
        
        try (ObjectOutputStream escritorObjeto = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nombreFichero)));) {

            for(int i = 0; i < nombres.length; i++) {
                escritorObjeto.writeObject(
                new Persona(nombres[i], apellidos[i], edades[i], alturas[i], existieron[i]));
            }
            
            System.out.println("Escritura OK");
            
        } catch (IOException e) {
            System.out.println("Error! No se ha podido tratar el fichero. " + e.getMessage());
//            e.printStackTrace();
        }

        System.out.println("*********************************");
        System.out.println("Operación finalizada.");
    }
}
