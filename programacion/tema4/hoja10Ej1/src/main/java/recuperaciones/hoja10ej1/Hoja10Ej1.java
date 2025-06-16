/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja10ej1;

/**
 *
 * @author thero
 */
public class Hoja10Ej1 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Armstrong <numero de 3 cifras>");
            return;
        }

        int numero = Integer.parseInt(args[0]);

        if (numero < 100 || numero > 999) {
            System.out.println("El número debe tener exactamente 3 cifras.");
            return;
        }

        int suma = 0;
        int temp = numero;
        while (temp > 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, 3);
            temp /= 10;
        }

        if (suma == numero) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " NO es un número Armstrong.");
        }
    }
}
