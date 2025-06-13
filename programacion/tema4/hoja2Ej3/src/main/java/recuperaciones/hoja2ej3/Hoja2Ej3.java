/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej3;

/**
 *
 * @author thero
 */
public class Hoja2Ej3 {

    public static void main(String[] args) {
        Invierno invierno = new Invierno(10);

        // Mostrar temperatura media
        
        System.out.printf("\nTemperatura media: %,.2f °C\n", invierno.tempMedia());

        // Mostrar temperaturas en Fahrenheit
        double[] tempsF = invierno.fahrenheit();
        System.out.println("Temperaturas en Fahrenheit: " + invierno.mostrar(tempsF));
    }
}
