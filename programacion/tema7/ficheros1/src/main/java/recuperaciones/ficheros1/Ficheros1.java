/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.ficheros1;

import java.io.File;

/**
 *
 * @author thero
 */
public class Ficheros1 {

    public static void main(String[] args) {


        String ruta = "C:\\Users\\thero\\Documents\\GitHub\\recuperaciones\\programacion";
        String nombreFichero = "fichero.txt";

        File fichero = new File(ruta, nombreFichero);
        if (fichero.exists()) {
            System.out.println("El fichero existe.");
        } else {
            System.out.println("El fichero no existe.");
        }
    }
}
