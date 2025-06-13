/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package excepcinjes.ejercicio3hoja7tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Ejercicio3Hoja7Tema5 {

    public static void main(String[] args) {
        int numero;
        boolean salir = false;

        while (!salir) {
            try {
                System.out.print("Introduce un número entre 0 y 100: ");
                numero = new Scanner(System.in).nextInt();
                if (numero < 0 || numero > 100) {
                    throw new Exception("El número está fuera de rango.");
                }
                salir = true;

            } catch (InputMismatchException e) {
                System.out.println("No es un nunmero entero");

            } catch (Exception e) {
                System.out.println("Eso no es un número válido. Inténtalo de nuevo.");
                System.out.println(e.getMessage());

            }
        }

    }
}
