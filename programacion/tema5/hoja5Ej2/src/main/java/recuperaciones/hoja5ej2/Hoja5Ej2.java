/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja5ej2;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja5Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número máximo de clientes del banco: ");
        int max = sc.nextInt();
        Banco banco = new Banco(max);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ingresar un cliente");
            System.out.println("2. Mostrar los clientes del banco");
            System.out.println("3. Buscar un cliente");
            System.out.println("4. Eliminar un cliente");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1-> banco.ingresarCliente();
                
                case 2->banco.mostrarClientes();
                
                case 3->{
                    System.out.print("Introduce el código del cliente: ");
                    int buscar = sc.nextInt();
                    System.out.println(banco.buscar(buscar));
                }
                case 4->{
                    System.out.print("Introduce el código del cliente a eliminar: ");
                    int eliminar = sc.nextInt();
                    banco.eliminarCliente(eliminar);
                }
                case 5->System.out.println("Saliendo...");
                
                default->System.out.println("opcion no valida");
            }    
        } while (opcion!=5);
    }
}
