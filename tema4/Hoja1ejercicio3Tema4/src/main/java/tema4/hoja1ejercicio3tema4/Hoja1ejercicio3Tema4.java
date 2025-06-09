/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.hoja1ejercicio3tema4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Hoja1ejercicio3Tema4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] n = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Introduce un numero del 1 al 10: ");
        int numero = teclado.nextInt();

        boolean encontrar = false;
        for (int i = 0; i < n.length; i++) {
            if (numero == n[i]) {
                System.out.println("El numero que has introducido se encuentra en la posicion: " + i);
                encontrar = true;
            }
        }

        if (!encontrar) {
            System.out.println("Numero no encontrado. ");
        }
    }
}
