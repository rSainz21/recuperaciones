/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio3hoja7tema4;

/**
 *
 * @author DAM109
 */
public class Ejercicio3Hoja7Tema4 {

    public static void main(String[] args) {
        Serie serie = new Serie(5, '+'); // Ejemplo con suma
        System.out.println("Resultado: " + serie.resultado());

        Serie serie2 = new Serie(5, '*'); // Ejemplo con producto
        System.out.println("Resultado: " + serie2.resultado());
    }
}
