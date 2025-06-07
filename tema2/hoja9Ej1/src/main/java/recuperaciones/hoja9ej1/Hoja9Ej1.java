/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja9ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja9Ej1 {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.print("Introduce la temperatura para crear la alarma: ");
        double temp = t.nextDouble();
        Alarma a1=new Alarma(temp);
        a1.comprueba();
        a1.mostrarEstado();
        a1.normaliza();
        a1.mostrarEstado();
        
        
    }
}
