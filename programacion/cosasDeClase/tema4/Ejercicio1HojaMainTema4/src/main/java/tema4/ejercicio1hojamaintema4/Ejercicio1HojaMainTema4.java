/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio1hojamaintema4;

/**
 *
 * @author DAM109
 */
public class Ejercicio1HojaMainTema4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java NumeroArmstrong <numero>");
            System.exit(1);
        }

        int numero = Integer.parseInt(args[0]);

        // Verificar si el número es de tres cifras
        if (numero >= 100 && numero <= 999) {
            if (esNumeroArmstrong(numero)) {
                System.out.println(numero + " es un número Armstrong.");
            } else {
                System.out.println(numero + " no es un número Armstrong.");
            }
        } else {
            System.out.println("Por favor, introduce un número de tres cifras.");
        }
    }

    public static boolean esNumeroArmstrong(int numero) {
        int suma = 0;
        int temp = numero;
        int numCifras = String.valueOf(numero).length();

        while (temp != 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, numCifras);
            temp /= 10;
        }

        return suma == numero;
    }
}
