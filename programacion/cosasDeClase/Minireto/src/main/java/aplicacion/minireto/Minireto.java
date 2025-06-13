/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aplicacion.minireto;
import java.util.Scanner;
/**
 *
 * @author DAM109
 */
public class Minireto {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Crear Usario.");
            System.out.println("2. Registrar Retos.");
            System.out.println("3. Realizar Retos.");
            System.out.println("4. Valorar Retos.");
            System.out.println("5. Ver un Reto con sus Waypoints.");
            System.out.println("6. Ver los Retos de un Usuario.");
            System.out.println("7. Ver las Valoraciones de un Reto.");
            System.out.println("8. Salir de la Aplicacion.");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 ->
                    Scanner scanner =new Scanner(System.in);
                    System.out.println("");
                     
                    
                    
                case 2 ->
                    System.out.println("2");
                    
                    
                case 3 ->
                    System.out.println("3");
                    
                    
                case 4 ->
                    System.out.println("4");
                   
                case 5 ->
                    System.out.println("5");
                    
                    
                case 6 ->
                    System.out.println("6");
                    
                    
                case 7 ->
                    System.out.println("7");
                    
                    
                case 8 ->
                    System.out.println("Saliendo...");
                    
                default ->
                    System.out.println("Opción no válida, por favor intenta nuevamente.");
            }
        } while (opcion != 8);
    }
}
