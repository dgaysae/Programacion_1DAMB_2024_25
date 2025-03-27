package unidad08.ejemplos.Object_Input_Output_Stream.ejemplo02;

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
