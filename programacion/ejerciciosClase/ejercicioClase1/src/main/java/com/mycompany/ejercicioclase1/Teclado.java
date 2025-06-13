/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclase1;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Teclado {

    public static int introEntero(String mensaje) {
        boolean salir = false;
        int entero = 0;
        while (!salir) {
            try {
                System.out.println(mensaje);
                String valor = new Scanner(System.in).nextLine();
                if (!valor.matches("\\d+")) {
                    throw new ExcepcionPersonalizada("No es un numero entero");
                } else if (Integer.parseInt(valor) <= 0) {
                    throw new ExcepcionPersonalizada("El numero entero tiene que ser positivo");
                } else {
                    salir = true;
                    entero = Integer.parseInt(valor);
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("El numero tiene que ser entero, sin decimales");
            }
        }
        return entero;
    }

    public static int introEntero2(String mensaje) throws ExcepcionPersonalizada, NumberFormatException {
        boolean salir = false;
        int entero = 0;

        System.out.println(mensaje);
        String valor = new Scanner(System.in).nextLine();
        if (!valor.matches("\\d+")) {
            throw new ExcepcionPersonalizada("No es un numero entero");
        } else if (Integer.parseInt(valor) <= 0) {
            throw new ExcepcionPersonalizada("El numero entero tiene que ser positivo");
        } else {
            salir = true;
            entero = Integer.parseInt(valor);
        }

        return entero;
    }
}
