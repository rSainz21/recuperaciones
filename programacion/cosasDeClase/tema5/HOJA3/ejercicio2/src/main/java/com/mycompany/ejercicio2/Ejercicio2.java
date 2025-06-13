/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        System.out.println("Introduce el numero");
        int n= new Scanner(System.in).nextInt();
        System.out.println("Introduce el multiplo");
        int m=new Scanner(System.in).nextInt();
        int c= n>m? m- n%m : m-n;
        String cadena = m==c? n+" es multiplo de "+m: "A "+n+" hay que sumarle "+c+" para que sea multiplo de "+m; 
        System.out.println(cadena);
    }
}
