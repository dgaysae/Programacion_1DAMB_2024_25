package unidad08.ejemplos.notepad;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

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
    JLabel jlRuta = new JLabel();
    JLabel jlEstado = new JLabel();
    File ficheroCargado = null;
    
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

        jlRuta.setHorizontalAlignment(SwingConstants.LEFT);
        jlEstado.setHorizontalAlignment(SwingConstants.RIGHT);
        jlEstado.setAlignmentX(JLabel.RIGHT);

        add(new HorizontalPanel(jlRuta, jlEstado), BorderLayout.PAGE_END);
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


        if (ae.getSource() == jmiOpen) {
            openTextFile();
            return;
        }
        boolean ficheroNuevo = (ae.getSource() == jmiSaveAs)
                || (ae.getSource() == jmiSave) && (ficheroCargado == null);

        saveFile(ficheroNuevo);
    }

    private void setEstado(EstadosFichero estado) {
        jlEstado.setText(estado.toString());
    }

    private void setRuta() {
        if (ficheroCargado != null) {
            JOptionPane.showMessageDialog(this, ficheroCargado.getAbsolutePath());
            jlRuta.setText(ficheroCargado.getAbsolutePath());
        }
        else {
            jlRuta.setText("");
        }
    }

    private void openTextFile() {
        setFile(true);
        fromFileToScreen();
        setEstado(EstadosFichero.FICHERO_ABIERTO);
    }

    private void saveFile(boolean newFile){
        if (newFile) {
            setFile(false);
        }
        fromScreenToFile();
        setEstado(EstadosFichero.FICHERO_GUARDADO);
    }

    private void setFile(boolean openFile) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = openFile
                ? fileChooser.showOpenDialog(this)
                : fileChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            ficheroCargado = fileChooser.getSelectedFile();
            if (!ficheroCargado.exists() && openFile) ficheroCargado = null;
        }
        else {
            ficheroCargado = null;
        }

        setRuta();
    }

    /**
     * Limpia el área de texto del bloc de notas.
     */
    private void emptyTextFile() {
        jtaTexto.setText("");
    }

    private void fromScreenToFile() {
        try (PrintWriter escribirEnFichero = new PrintWriter(new FileWriter(ficheroCargado))) {
            escribirEnFichero.write(jtaTexto.getText());
        }
        catch (FileNotFoundException | NullPointerException e) {
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
        }    }
    
    private void fromFileToScreen() {
        emptyTextFile();
        try (BufferedReader leerDeFichero = new BufferedReader(new FileReader(ficheroCargado))) {
            String texto;
            System.out.println("Fichero: " + ficheroCargado.getAbsolutePath());
            while( (texto = leerDeFichero.readLine()) != null ) {
                jtaTexto.append(texto);
                jtaTexto.append("\n");
            }
        }
        catch (FileNotFoundException | NullPointerException e) {
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
