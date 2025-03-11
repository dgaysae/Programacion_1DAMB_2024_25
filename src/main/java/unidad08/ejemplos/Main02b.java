package unidad08.ejemplos;

import java.io.File;
import java.util.Scanner;

public class Main02b {
    public static void main(String[] args) {
        File fichero = new File("./src/main/java/unidad07/ejemplos/fichero.txt");
        try (Scanner sc = new Scanner(fichero)) {
            String texto = "";
            while (sc.hasNextLine()) {
                texto += sc.nextLine() + "\n";
            }

            System.out.println("El contenido del fichero es:");
            System.out.println(texto);
        }
        catch (Exception e) {
            System.out.println("ERROR!!!");
        }
    }
}
