/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej4;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja2Ej4 {

    public static void main(String[] args) {
        double h=0;
        double b=0;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        h=t.nextDouble();
        System.out.println("Introduce la base: ");
        b=t.nextDouble();
        double area=(b*h)/2;
        System.out.printf("El area del triangulo es % ,.2f\n", area);
        
    }
}
