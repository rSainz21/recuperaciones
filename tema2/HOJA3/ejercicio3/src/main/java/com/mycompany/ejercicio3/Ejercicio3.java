/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Satelite s1 = new Satelite(45,288,50);
        Satelite s2= new Satelite();
        s2.variarAltura(13);
        s2.variarPosicion(45,45);
        System.out.println(s2.enOrbita());
        System.out.println(s1.enOrbita());
        System.out.println(s2.posicion());
        
    }
}
