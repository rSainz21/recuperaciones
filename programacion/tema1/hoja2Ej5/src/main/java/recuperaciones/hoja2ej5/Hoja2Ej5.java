/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej5;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja2Ej5 {

    public static void main(String[] args) {
        double precio=0;
        final double IVA=0.21;
        final double DESCUENTO=0.10;
        Scanner t=new Scanner(System.in);
        System.out.println("El precio del producto sin IVA es: ");
        precio=t.nextDouble();
        double precioIVA=precio+(precio*IVA);
        double precioIVAdescuento=precioIVA-(precioIVA*DESCUENTO);
        System.out.printf("El precio con IVA es % ,.2f\n",precioIVA);
        System.out.printf("El precio con descuento es % ,.2f\n",precioIVAdescuento);
        
        
    }
}
