/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.hoja1ej3;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja1Ej3 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;            
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres buscar: ");
        int buscado = s.nextInt();
        
        boolean encontrado=false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==buscado) {
                System.out.println("Numero encontrado en la posicion "+(i+1));
                encontrado=true;
                
            }               
        }
        if (!encontrado) {
            System.out.println("Numero no encontrado");
        }
        

    }
}
