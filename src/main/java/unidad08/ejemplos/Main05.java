package unidad08.ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reyes
 */
public class Main05 {
    
    public static void main(String[] args) {
        
        try (PrintWriter escritor=new PrintWriter(new FileWriter("ejemplo10.txt"))){
            escritor.println("Primer printWriter");
            escritor.println(3.5f);
            
        } catch (IOException ex) {
            Logger.getLogger(Main05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
