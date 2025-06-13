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
        Numero n1 = new Numero();
        System.out.println("Dime un numero:");
        Numero n2 = new Numero(new Scanner(System.in).nextInt());
        System.out.println("sumo 4 al 1: "+n1.suma(4));
        System.out.println("resto 3 al 2: "+n2.resta(3));
        System.out.println("muestro el valor del 1: "+n1.getNumero());
        System.out.println("muestro el valor del 2: "+n2.getNumero());
        System.out.println("calculo el doble del 2: "+n2.doble());
        System.out.println("calculo el triple del 2: "+n2.triple());
    }
}
