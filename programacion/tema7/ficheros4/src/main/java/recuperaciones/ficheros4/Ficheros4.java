/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.ficheros4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Ficheros4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del directorio: ");
        String directorio = scanner.nextLine();
        scanner.close();

        File dir = new File(directorio);
        if (dir.exists() && dir.isDirectory()) {
            listarFicheros(dir);
            
        } else {
            System.out.println("El directorio no existe.");
        }
    }

    public static void listarFicheros(File dir) {
        // Listar ficheros del directorio y subdirectorios
        File[] ficheros = dir.listFiles();
        if (ficheros != null) {
            for (File fichero : ficheros) {
                if (fichero.isDirectory()) {
                    // Si es un directorio, recursivamente listar los ficheros dentro
                    listarFicheros(fichero);
                } else {
                    System.out.println(fichero.getAbsolutePath());
                }
            }
        }
    }
}
