/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio1hoja5tema3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio1Hoja5tema3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de filas: ");
        int filas = teclado.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");

            }
            for (int asteriscos = 1; asteriscos <= (2 * i - 1); asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
