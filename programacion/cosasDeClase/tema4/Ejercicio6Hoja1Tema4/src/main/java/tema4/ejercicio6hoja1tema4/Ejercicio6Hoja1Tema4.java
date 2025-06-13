/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio6hoja1tema4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Ejercicio6Hoja1Tema4 {
    public static void main(String[] args) {
        
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("El mayor numero es: " + mayor);
    }
}
