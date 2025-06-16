/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja9ej2;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja9Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplicar m = new Multiplicar();

        System.out.println("=== MATRIZ INICIAL ===");
        m.muestra();

        System.out.println("\n=== MATRIZ CON MULTIPLICACIONES ===");
        m.multiplica();
        m.muestra();

        System.out.println("\n=== VALORES EN ASPA ===");
        int[] aspa = m.valoresAspa();
        for (int val : aspa) {
            System.out.print(val + " ");
        }
        System.out.println();

        int num;
        do {
            System.out.print("\nIntroduce el número de tabla de multiplicar (1-9): ");
            num = sc.nextInt();
        } while (num < 1 || num > 9);

        int[] tabla = m.tablaMultiplicar(num);
        System.out.println("Tabla del " + num + ":");
        for (int val : tabla) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}