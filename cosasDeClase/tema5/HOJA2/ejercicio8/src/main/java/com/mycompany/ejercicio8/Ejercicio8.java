/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.print("Introduce el radio del circulo: ");

        double radio = new Scanner(System.in).nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio,2);
        System.out.printf("La longitud del circulo es: %.2f\n", longitud);
        System.out.printf("El área del circulo es: %.2f\n", area);
    }
}
