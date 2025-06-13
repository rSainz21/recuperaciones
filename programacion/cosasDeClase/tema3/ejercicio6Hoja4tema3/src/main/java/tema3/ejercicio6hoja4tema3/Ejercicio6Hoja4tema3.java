/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio6hoja4tema3;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio6Hoja4tema3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean salir=false;
        
        while (!salir) {
            System.out.print("Introduce una cantidad: ");
            double apuesta = scanner.nextDouble();
            
            int resultado = random.nextInt(2) + 1; //esto es para generar un 1 o un 2 aleatorio
            
            if (resultado == 1) {// si el resultado es 1 se apuesta el doble 
                double ganancia = apuesta * 2;
                System.out.println("Has ganado el doble de tu apuesta: " + ganancia + " euros.");
            } else {//si sale el dos pierdo todo
                System.out.println("Has perdido todo.");
            }
            
            System.out.print("¿Quieres volver a intentarlo? (si/no): ");
            String jugarDeNuevo = new Scanner(System.in).nextLine();
            
            if (!jugarDeNuevo.equalsIgnoreCase("si")) {
                System.out.println("Gracias por jugar.");
                salir=true;
            
               
            }
        }
    }
}

    

