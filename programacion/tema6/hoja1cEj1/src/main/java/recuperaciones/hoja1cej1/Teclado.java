/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja1cej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Teclado {
    private static final Scanner t=new Scanner(System.in);
    
    public static int leerEntero(String mensaje){
       int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(t.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada no válida. Introduce un número entero.");
            }
        }
        return numero;
    }
}