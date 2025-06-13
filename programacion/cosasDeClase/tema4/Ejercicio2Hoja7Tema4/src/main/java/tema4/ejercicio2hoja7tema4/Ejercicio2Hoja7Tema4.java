/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio2hoja7tema4;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Ejercicio2Hoja7Tema4 {

    public static void main(String[] args) {
        Sopa sopa=new Sopa();
        Scanner teclado=new Scanner(System.in);
        System.out.println("Sopa de letras inicial: ");
        sopa.mostrar();
        System.out.println("Escribe la palabra que quieres añadir: ");
        String palabra1=teclado.nextLine();
        sopa.setPalabra(palabra1, 2, 3, 1);
        System.out.println("\nSopa de letras despues de añadir"+palabra1+"horizontalmente:");
        sopa.mostrar();
        System.out.println("Escribe la palabra que quieres añadir: ");
        String palabra2=teclado.nextLine();
        sopa.setPalabra(palabra2, 4, 5, -1);
        System.out.println("\nSopa de letras despues de añadir"+palabra2+"vertical:");
        sopa.mostrar();
        
        
    }
}