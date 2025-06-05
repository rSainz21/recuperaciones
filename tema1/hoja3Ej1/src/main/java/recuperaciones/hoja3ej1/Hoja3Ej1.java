/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja3ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja3Ej1 {

    public static void main(String[] args) {
        double baseImponible;
        double IVA;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        baseImponible=t.nextDouble();
        System.out.println("Introduzca el porcentaje de IVA: ");
        IVA=t.nextDouble();
        double importeIVA=baseImponible*(IVA/100);
        double total=baseImponible+importeIVA;
        System.out.printf("El importe del IVA son % ,.2f\n",importeIVA," Euros");
        System.out.printf("El importe total son % ,.2f\n",total," Euros");
        
        
    }
}
