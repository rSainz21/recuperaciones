/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio3hoja1;

/**
 *
 * @author dam1
 */
public class Ejercicio3Hoja1 {

    public static void main(String[] args) {
        Llamada llamada = new Llamada();
        double coste = llamada.aPagar(1, 30); // Ejemplo con 1 minuto y 30 segundos
        System.out.println("El coste de la llamada es: " + coste + "€");
    }
}
