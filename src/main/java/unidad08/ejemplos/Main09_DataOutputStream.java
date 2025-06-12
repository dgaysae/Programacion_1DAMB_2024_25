package unidad08.ejemplos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author diego
 */
public class Main09_DataOutputStream {
    public static void main(String[] args) {
        escribirData();
        leerData();
    }

    private static void escribirData() {
        try (DataOutputStream escribirDatosTipados = new DataOutputStream(new FileOutputStream("./dataoutputstream.test"))) {
            int numero = 6;
            String texto = "José";
            boolean cierto = true;
            double real = 19.98;
            
            escribirDatosTipados.writeInt(numero);
            escribirDatosTipados.writeUTF(texto);
            escribirDatosTipados.writeBoolean(cierto);
            escribirDatosTipados.writeDouble(real);
        }
        catch (FileNotFoundException e) {
            
        }
        catch (IOException e) {
            
        }
    }

    private static void leerData() {
        try (DataInputStream leerData = new DataInputStream(new FileInputStream("./dataoutputstream.test"))) {
            System.out.println("número: " + leerData.readInt());
            System.out.println("texto UTF: " + leerData.readUTF());
            System.out.println("cierto: " + leerData.readBoolean());
            System.out.println("real: " + leerData.readDouble());
        }
        catch(FileNotFoundException e) {
            
        }
        catch(IOException e) {
            
        }
    }
}
