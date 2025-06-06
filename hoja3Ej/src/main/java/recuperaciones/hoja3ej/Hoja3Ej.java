/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja3ej;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja3Ej {

    public static void main(String[] args) {
        double longitudM;
        Scanner t=new Scanner(System.in);
        System.out.println("Introduce la distancia de tu lanzamiento en metros: ");
        longitudM=t.nextDouble();
        double longitudCm=longitudM*100;
        int centimetros=(int)longitudCm;
        System.out.println("La distancia en centimetros es: "+centimetros+" centimetros");
        
        
    }
}
