/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja9ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja9Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array1 = new Array();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar");
            System.out.println("2. Introducir valores");
            System.out.println("3. Media");
            System.out.println("4. Modificar valor");
            System.out.println("5. Rotar a la izquierda");
            System.out.println("6. Rotar a la derecha");
            System.out.println("7. Comparar con otro array");
            System.out.println("8. Suma de pares");
            System.out.println("9. Rellenar con múltiplos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1->array1.mostrar();
                    
                case 2->array1.rellenar();
                    
                case 3->System.out.println("Media: " + array1.media());
                    
                case 4->{
                    System.out.print("Introduce posición (1-10): ");
                    int pos = sc.nextInt();
                    System.out.print("Introduce nuevo valor: ");
                    int val = sc.nextInt();
                    array1.modificar(val, pos);
                }
                case 5->array1.rotarIzquierda();
               
                case 6->array1.rotarDerecha();
                    
                case 7->{
                    System.out.println("Introduce los valores del segundo array para comparar:");
                    Array array2 = new Array();
                    array2.rellenar();
                    array1.comparar(array2);
                }
                case 8->array1.sumaPares();
                    
                case 9->{
                    System.out.print("Introduce un número para generar múltiplos: ");
                    int num = sc.nextInt();
                    array1.multiplos(num);
                }
                case 10->System.out.println("Hasta luego, máquina.");
                    
                default->System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
