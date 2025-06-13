/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja1ej5;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja1Ej5 {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int x;
        int y;
        System.out.println("Introduce el valor x: ");
        x=t.nextInt();
        System.out.println("Introduce el valor y: ");
        y=t.nextInt();
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("x+y= "+(x+y));
        System.out.println("x-y= "+(x-y));
        System.out.println("x*y= "+(x*y));
        System.out.println("x/y= "+(x/y));
        System.out.println("x^2= "+Math.pow(x, 2));
        System.out.println("√ x = " + Math.sqrt(x));
        
        
        
    }
}
