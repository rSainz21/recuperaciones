/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoj1ej5;

/**
 *
 * @author thero
 */
public class Hoj1Ej5 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;            
        }
        int aux;
        for (int i = 0; i < numeros.length/2; i++) {
            aux=numeros[i];
            numeros[i]=numeros[numeros.length-1-i];
            numeros[numeros.length-1-i]=aux;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
