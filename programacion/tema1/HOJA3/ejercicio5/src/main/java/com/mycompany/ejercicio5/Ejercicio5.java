/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        int seg=new Scanner(System.in).nextInt();
        int horas= seg>=3600? seg/3600:0;
        seg-= horas>0?horas*3600:0;
        int minutos= seg>=60? seg/60:0;
        seg-= minutos>0?minutos*60:0;
        String cadena= "El tiempo es ";
        cadena+= horas>0?horas+ "h ":"";
        cadena+= minutos>0?minutos+ "min ":"";
        cadena+= seg>0?seg+ "seg ":"";
        System.out.println(cadena);
    }
}
