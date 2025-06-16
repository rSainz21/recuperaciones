/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja3ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja3Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cono
        System.out.print("Introduce el radio del cono: ");
        double radioCono = sc.nextDouble();
        System.out.print("Introduce la altura del cono: ");
        double alturaCono = sc.nextDouble();

        Cono cono = new Cono(radioCono, alturaCono);
        System.out.printf("\n--- CONO ---\nÁrea: %.2f\nVolumen: %.2f\n", cono.area(), cono.volumen());

        // Cilindro
        System.out.print("\nIntroduce el radio del cilindro: ");
        double radioCilindro = sc.nextDouble();
        System.out.print("Introduce la altura del cilindro: ");
        double alturaCilindro = sc.nextDouble();

        Cilindro cilindro = new Cilindro(radioCilindro, alturaCilindro);
        System.out.printf("\n--- CILINDRO ---\nÁrea: %.2f\nVolumen: %.2f\n", cilindro.area(), cilindro.volumen());

        sc.close();
    }
}