/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio3hoja2tema3;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Ejercicio3Hoja2tema3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número entero:");
        int numero = scanner.nextInt();
        
        System.out.println("Elige una opción:");
        System.out.println("1. Calcular el cuadrado del número");
        System.out.println("2. Calcular el doble del número");
        System.out.println("3. Calcular la raíz cuadrada del número");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1 -> System.out.println("El cuadrado de " + numero + " es " + (numero * numero));
               
            case 2 -> System.out.println("El doble de " + numero + " es " + (numero * 2));
               
            case 3 -> {
                if (numero >= 0) {
                    System.out.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
                } else {
                    System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
                }
            }
            default -> System.out.println("Opción no válida.");
               
        }
    }  
} 
