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
        Finanzas f1 = new Finanzas();
        System.out.println("¿Cuantos dolares tienes?");
        double dolares= new Scanner(System.in).nextDouble();
        System.out.printf("%s%,.2f","Tus euros serian :",f1.dolaresToEuros(dolares));
        System.out.println("¿Cuantos euros tienes?");
        double euros= new Scanner(System.in).nextDouble();
        System.out.printf("%s%,.2f","Tus euros serian :",f1.eurosToDolares(euros));
        Finanzas f2 = new Finanzas(1.10);
        System.out.printf("%s%,.2f","Tus euros serian :",f2.dolaresToEuros(dolares));
        
    }
}
