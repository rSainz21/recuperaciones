/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examen2.ejercicio2examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Ejercicio2Examen {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        double precio;
        Random r = new Random();
        System.out.println("Introduce el precio de los productos comprados (precio -1 para finalizar): ");
        int puntos=0;
        while (salir == false) {
            System.out.println("Precio del producto: ");
            precio = teclado.nextInt();
            if (precio > -1) {
                int y = r.nextInt(10);
                System.out.println("Aleatorio aplicado: " + y);
                puntos = (int) (precio/10);
                int puntosDescuento=(int) (puntos+Math.round(y/100*precio));
                System.out.println("Total puntos obtenidos: " + puntosDescuento);
            }else if(precio==-1){
                salir=true;
               
            }else{
                System.out.println("El precio no puede ser negativo.");
                
            }
            
            
        }
        System.out.println("Total de puntos obtenidos en la compraes: "+puntos);

    }
}
