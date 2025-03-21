package unidad08.ejemplos.objetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * 
 * @author diego
 */
public class EscribirCoches extends ObjectOutputStream {

    public EscribirCoches(OutputStream out) throws IOException {
        super(out);
    }
    
    @Override
    protected void writeStreamHeader() throws IOException {}
    
}
