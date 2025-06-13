/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja1ej2;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja1Ej2 {

    public static void main(String[] args) {
        double[] temperatura=new double[10];
        Scanner t=new Scanner(System.in);
        double suma=0;
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Introduce la temperatura de la ciudad numero "+(i+1)+":");
            temperatura[i]=t.nextDouble();
            suma+=temperatura[1];
        }
        double media=suma/temperatura.length;
        System.out.println("La temperatura media de las 10 ciudades es: "+media);
    }
}
