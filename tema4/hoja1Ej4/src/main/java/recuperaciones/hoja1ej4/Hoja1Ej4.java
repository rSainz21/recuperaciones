/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja1ej4;

/**
 *
 * @author thero
 */
public class Hoja1Ej4 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;            
        }
        
        int[] arrayInvertido = new int[10];
        for (int i = 0; i < arrayInvertido.length; i++) {
            arrayInvertido[i]=numeros[10-1-i];
        }
        
        System.out.println("Array Invertido: ");
        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.print(arrayInvertido[i]+" ");
        }
        
    }
}
