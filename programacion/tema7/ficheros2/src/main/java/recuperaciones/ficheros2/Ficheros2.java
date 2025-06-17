/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.ficheros2;

import java.io.File;

/**
 *
 * @author thero
 */
public class Ficheros2 {

    public static void main(String[] args) {
        
        String ruta = "C:\\Users\\thero\\Documents\\GitHub\\recuperaciones\\programacion";
        String nombreFichero = "fichero.txt";

        File fichero = new File(ruta, nombreFichero);
        
        if (fichero.exists()) {
            System.out.println("Nombre del fichero: " + fichero.getName());
            System.out.println("Ruta de acceso: " + fichero.getAbsolutePath());
            System.out.println("¿Es de lectura? " + fichero.canRead());
            System.out.println("¿Es de escritura? " + fichero.canWrite());
            System.out.println("Tamaño del fichero: " + fichero.length() + " bytes");
        } else {
            System.out.println("El fichero no existe.");
        }
    }
}
