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
        Finanzas finanza1=new Finanzas();
        Scanner t=new Scanner(System.in);
        System.out.println("Introduce los dolares a cambiar: ");
        double dolares=t.nextDouble();
        System.out.printf("Al cambio son: % ,.2f\n",finanza1.dolaresAeuros(dolares)," Euros");
        System.out.println("Introduce los euros a cambiar: ");
        double euros=t.nextDouble();
        System.out.printf("Al cambio son: % ,.2f\n",finanza1.eurosAdolares(euros)," Dolares");
        Finanzas finanza2=new Finanzas(1.1);
        System.out.printf("Al cambio son: % ,.2f\n",finanza2.dolaresAeuros(dolares)," Euros");
        
    }
}
