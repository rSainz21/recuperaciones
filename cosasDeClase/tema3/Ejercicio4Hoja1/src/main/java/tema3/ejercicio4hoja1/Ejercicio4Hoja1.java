/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio4hoja1;

/**
 *
 * @author dam1
 */
public class Ejercicio4Hoja1 {

    public static void main(String[] args) {
        Billete billete = new Billete(850, 10); // Ejemplo con 850 km y 10 días de estancia
        System.out.println("El importe del billete es: " + billete.importe() + "€");
    }
}

