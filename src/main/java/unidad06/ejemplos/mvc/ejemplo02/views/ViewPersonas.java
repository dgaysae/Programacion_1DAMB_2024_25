package unidad06.ejemplos.mvc.ejemplo02.views;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewPersonas extends JFrame {

    public JTable tabla;
    public DefaultTableModel defaultModel;
    public JButton bt_Add;
    public JButton bt_Remove;
    public JButton bt_Salir;

    public ViewPersonas() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100, 100);
        setSize(500, 500);
        getContentPane().setLayout(new BorderLayout());
        
        bt_Add = new JButton("Añadir");
        bt_Remove = new JButton("Borrar");
        bt_Salir = new JButton("Salir");
        JPanel panelBotones = new VerticalPanel(bt_Add, bt_Remove, bt_Salir);
        getContentPane().add(panelBotones, BorderLayout.EAST);
        
        // Creo el modelo que actualizará la tabla y lo asocio a ella
        defaultModel = new DefaultTableModel();
        tabla = new JTable(defaultModel);
        JScrollPane scroll = new JScrollPane(tabla);
        
        getContentPane().add(scroll, BorderLayout.CENTER);
    }

}
