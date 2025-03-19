package unidad08.ejemplos;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Reyes
 */
public class Main07 {
    public static void main(String[] args) {
        
        try (PrintWriter escritor = new PrintWriter(new FileWriter("ejemplo10.txt" ,true));
                BufferedReader lector = new BufferedReader(new InputStreamReader(System.in))){
            
            String linea;
            
            do {
                System.out.println("Si pulsas * se sale");
                
                linea = lector.readLine();
                if(!linea.equals("*")){
                escritor.print(linea);
                }
                
            } while (!linea.equals("*"));
            
        } catch (IOException e) {
            System.out.println("ERROR"+ e.getMessage());
        }
        
    }
}
