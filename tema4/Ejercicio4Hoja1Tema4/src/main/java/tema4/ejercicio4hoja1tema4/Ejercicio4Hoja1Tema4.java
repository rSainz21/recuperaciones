/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio4hoja1tema4;

/**
 *
 * @author dam1
 */
public class Ejercicio4Hoja1Tema4 {

    public static void main(String[] args) {
                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int[] arrayInvertido = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arrayInvertido[i] = array[10 - 1 - i];

        }
        
        System.out.println("Array invertido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayInvertido[i] + " ");
        }
    }
}

