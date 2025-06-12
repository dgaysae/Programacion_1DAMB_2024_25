package unidad08.ejemplos.csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Este ejemplo toma datos de personas por teclado hasta que se introduzca "fin" en el nombre.
 * Todos esos datos los guarda en una lista y luego los almacena en formato CSV en un fichero.
 * Fuente: https://youtu.be/WhpP6HWVOb8?si=SyCtgP_16oi_IJaB
 */
public class CrearCSV {
    public static final String FIN = "FIN";

    public static void main(String[] args) {
        System.out.println("Introducir datos de persona:");

        Scanner leerDeTeclado = new Scanner(System.in);
        ArrayList<Persona> personas = setListaPersonas(leerDeTeclado);
        try (FileWriter escribirEnFichero = new FileWriter(new File("./personas.csv"))) {

            for(Persona persona : personas) {
                escribirEnFichero.write(persona.toCSV() + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Persona> setListaPersonas(Scanner leer) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        String nombre, apellidos, dni;
        double altura;
        Persona persona;
        boolean finalizaEntrada = false;

        do {
            System.out.println("Introduzca los datos de una persona:");
            System.out.print("Nombre: ");
            nombre = leer.nextLine();
            finalizaEntrada = nombre.toUpperCase().equals(FIN);

            if (!finalizaEntrada) {
                System.out.print("Apellidos: ");
                apellidos = leer.nextLine();

                System.out.print("DNI: ");
                dni = leer.nextLine();

                System.out.print("Altura: ");
                altura = Double.parseDouble(leer.nextLine());

                listaPersonas.add(new Persona(nombre, apellidos, dni, altura));
            }
            System.out.println("-------------------------------");
        } while (!finalizaEntrada);

        return listaPersonas;
    }
}
