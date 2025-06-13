/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado;
        System.out.println("Introduce la base del producto");
        float base=new Scanner(System.in).nextFloat();
        System.out.println("Introduce el iva");
        float iva=new Scanner(System.in).nextFloat();
        base*=(100+iva)/100;
        
        System.out.println("el valor total es: "+base);
       
    }
}
