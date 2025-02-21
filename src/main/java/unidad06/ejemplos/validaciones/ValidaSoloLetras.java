package unidad06.ejemplos.validaciones;

import javax.swing.*;

/**
 * Encapsular una validación en un objeto InputVerifier nos permite usarla en cualquier parte
 * de este u otros programas.
 */
public class ValidaSoloLetras extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        JTextField textField = (JTextField) input;
        String texto = textField.getText();
        return !texto.isBlank() && texto.matches("[a-zA-Z]+");
    }
}
