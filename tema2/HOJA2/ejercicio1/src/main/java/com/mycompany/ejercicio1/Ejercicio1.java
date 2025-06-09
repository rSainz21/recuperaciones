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
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10);
        Circulo c3 = new Circulo(new Scanner(System.in).nextDouble());
        c1.setRadio(5);
        c1.getRadio();
        c3.getRadio();
        c2.area();
        c3.longitud();
        c3.area();
        
        
    }
}
