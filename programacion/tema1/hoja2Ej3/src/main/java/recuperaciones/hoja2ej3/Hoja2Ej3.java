/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej3;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja2Ej3 {

    public static void main(String[] args) {
        double precioEuros;
        double precioPesetas;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduce el precio de la casa: ");
        precioEuros=t.nextDouble();
        precioPesetas=precioEuros*166.386;
        System.out.println("La casa vale "+precioEuros+" Euros");
        System.out.println("La casa vale "+precioPesetas+" Pesetas");
    }
}
