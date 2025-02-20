package unidad06.ejemplos.mvc.ejemplo01.view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author diego
 */
public class Ventana extends JFrame {
    private JLabel lbEtiqueta;
    private JTextField tfTexto;
    private JButton btBoton, btBoton2;
    
    public Ventana(String title) {
        setTitle(title);
        initVentana();
        setVisible(true);
    }
    
    public JLabel getEtiqueta() {
        return lbEtiqueta;
    }

    public JTextField getCajaTexto() {
        return tfTexto;
    }

    public JButton getBoton1() {
        return btBoton;
    }

    public JButton getBoton2() {
        return btBoton2;
    }

    private void initVentana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());
        
        setControles();
    }    
    
    private void setControles() {
        lbEtiqueta = new JLabel("Nombre:");
        tfTexto = new JTextField(15);
        btBoton = new JButton("Aceptar");
        
        btBoton2 = new JButton("Aceptar otra vez");

        VerticalPanel verticalPanel = new VerticalPanel(lbEtiqueta, tfTexto);
        verticalPanel.setBorder("Panel con título y borde:");
        add(verticalPanel);

        verticalPanel = new VerticalPanel(btBoton, btBoton2);
        verticalPanel.setMargins();
        add(verticalPanel);

    }
}
