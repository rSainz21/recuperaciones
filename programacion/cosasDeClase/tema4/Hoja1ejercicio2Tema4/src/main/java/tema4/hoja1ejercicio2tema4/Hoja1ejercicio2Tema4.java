/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.hoja1ejercicio2tema4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Hoja1ejercicio2Tema4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float[] temperatura=new float[10];
        double suma=0;
        
        for (int i=0;i<temperatura.length;i++){ 
            System.out.println("Introduce la temperatura "+(i+1)+": ");
            temperatura[i]=teclado.nextFloat();
            suma+=temperatura[i];
        }
        
        double media=suma/temperatura.length; 
        System.out.printf("La media de las temperaturas es: %,.2f",media);
    }
}
