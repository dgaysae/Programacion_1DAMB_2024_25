package unidad08.ejemplos.notepad;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author diego
 */
public class ViewNotepad extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenu jmFile = new JMenu("File");
    JMenuItem jmiOpen = new JMenuItem("Open");
    JMenuItem jmiSave = new JMenuItem("Save");
    JMenuItem jmiSaveAs = new JMenuItem("Save as...");
    JMenuItem jmiExit = new JMenuItem("Exit");
    JTextArea jtaTexto = new JTextArea();
    File ficheroCargado = new File("");
    
    public ViewNotepad(String title) {
        super(title);
        initWindow();
        setComponents();
        setEventComponents();
        
        setVisible(true);
    }

    private void initWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());
    }

    private void setComponents() {
        add(jtaTexto);
        menuBar.add(jmFile);
        setJMenuBar(menuBar);
        
        jmFile.add(jmiOpen);
        jmFile.add(jmiSave);
        jmFile.add(jmiSaveAs);
        jmFile.add(jmiExit);
    }

    private void setEventComponents() {
        jmiOpen.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiSaveAs.addActionListener(this);
        jmiExit.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == jmiExit) {
            System.exit(0);
        }
        else if (ae.getSource() == jmiOpen) {
            File fichero = getFile();
            fromFileToScreen(fichero);
        }
        else if (ae.getSource() == jmiSave) {
            File fichero = getFile();
            fromFileToScreen(fichero);
        }
    }

    private File getFile() {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion != JFileChooser.APPROVE_OPTION)
            return null;
        
        ficheroCargado = fileChooser.getSelectedFile();
        if (!ficheroCargado.exists()) ficheroCargado = new File("");
        
        return ficheroCargado;
    }
    
    /**
     * Limpia el área de texto del bloc de notas.
     */
    private void emptyTextFile() {
        jtaTexto.setText("");
    }
    
    private void fromFileToScreen(File fichero) {
        String texto = "";
        emptyTextFile();
        try (BufferedReader leerDeFichero = new BufferedReader(new FileReader(fichero))) {
            System.out.println("Fichero: " + fichero.getAbsolutePath());
            while( (texto = leerDeFichero.readLine()) != null ) {
                jtaTexto.append(texto);
                jtaTexto.append("\n");
            }
        }
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Fichero no encontrado",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error leyendo de fichero",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }        
    }
}
