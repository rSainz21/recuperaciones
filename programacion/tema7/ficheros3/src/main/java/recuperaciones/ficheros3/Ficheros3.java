/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.ficheros3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author thero
 */
public class Ficheros3 {

    public static void main(String[] args) {
        
            String ruta = "C:\\Users\\thero\\Documents\\GitHub\\recuperaciones\\programacion";
            String nombreFichero = "nuevo_fichero.txt";

            File fichero = new File(ruta, nombreFichero);

            try {
                if (fichero.createNewFile()) {
                    System.out.println("El fichero " + nombreFichero + " ha sido creado.");
                    // Escribir algo en el fichero
                    FileWriter writer = new FileWriter(fichero);
                    writer.write("Este es un fichero de prueba.");
                    writer.close();
                } else {
                    System.out.println("El fichero ya existe.");
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al crear el fichero.");
                e.printStackTrace();
            }
        }
    }
