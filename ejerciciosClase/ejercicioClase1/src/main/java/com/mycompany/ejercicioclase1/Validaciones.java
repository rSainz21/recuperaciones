/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicioclase1;

/**
 *
 * @author DAM109
 */
public class Validaciones {

    public static void main(String[] args) {
        System.out.println(" --- Tratando la excepcion --- ");
        String enunciado = "Escribe un numero positivo";
        int entero = Teclado.introEntero(enunciado);
        System.out.println("Este es el valor introducido : " + entero);
        System.out.println("\n --- Lanzando la excepcion --- ");
        boolean salir = false;
        int entero2 = 0;
        while (!salir) {
            try {
                entero2 = Teclado.introEntero2(enunciado);
                salir = true;
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("El numero tiene que ser entero, sin decimales");
            }
        }
        System.out.println("Este es el numero entero: " + entero2);
    }
}
