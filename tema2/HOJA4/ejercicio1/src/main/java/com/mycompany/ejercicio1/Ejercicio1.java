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
        Circulo C1 = new Circulo();
        Circulo C2 = new Circulo((float) 6.30);
        System.out.println("Introduce el radio del un nuevo circulo");
        float radio = new Scanner(System.in).nextFloat();
        C1.setRadio(radio);
        System.out.println("Radio del circulo del primer circulo una vez establecido un radio: " + C2.getRadio());
        System.out.println("Radio del circulo del segundo circulo nada mas crearlo: " + C1.getRadio());
    }
}
