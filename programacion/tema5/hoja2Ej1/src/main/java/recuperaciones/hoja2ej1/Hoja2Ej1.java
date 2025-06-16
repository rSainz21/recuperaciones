/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej1;

/**
 *
 * @author thero
 */
public class Hoja2Ej1 {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juan", 2000);
        Encargado enc1 = new Encargado("Laura", 2000);

        System.out.println("=== EMPLEADO ===");
        e1.mostrarDatos();

        System.out.println("\n=== ENCARGADO ===");
        enc1.mostrarDatos();
    }
}
