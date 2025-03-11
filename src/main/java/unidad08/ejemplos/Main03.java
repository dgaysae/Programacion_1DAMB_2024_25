package unidad08.ejemplos;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

/**
 * Este ejemplo nos sirve para ver el funcionamiento de un flujo de datos o stream.
 * En este caso se usan clases para abrir flujos de datos que ya residen en memoria,
 * por lo que esto no tiene una utilidad real, sino más bien pedagógica.
 * @author diego
 */
public class Main03 {
    public static void main(String[] args) {
        String texto = new String("No por mucho madrugar amanece más temprano\n")
                + "No por mucho madrugar amanece más temprano\n"
                + "No por mucho madrugar amanece más temprano\n"
                + "Una novela de Jack Torrance";
        char[] arrayCaracteres = new char[texto.length()];
        int caracter = 0;
        StringReader flujoEntrada = new StringReader(texto);
        CharArrayWriter flujoSalida = new CharArrayWriter();
        try {
            while ((caracter = flujoEntrada.read()) != -1) {
                flujoSalida.write(caracter);
            }
            arrayCaracteres = flujoSalida.toCharArray();
            System.out.println(arrayCaracteres);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            flujoEntrada.close();
            flujoSalida.close();
        }
    }
}
