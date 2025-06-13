/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.fehcasej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class FechasEj1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuántas letras quieres introducir? ");
        int n = s.nextInt();
        Letra[] letra = new Letra[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nLetra " + (i + 1) + ":");
            letra[i] = new Letra();
        }
        System.out.println("---Letras vencidas---");
        for (int i = 0; i < letra.length; i++) {
            if (letra[i].vencida()) {
                letra[i].mostrar();
            }
        }

        System.out.println("---Demorando letras 15 dias---");
        for (int i = 0; i < letra.length; i++) {
            if (letra[i].vencida() && letra[i].devuelveMes() == 1) {
                letra[i].demora(15);
                letra[i].mostrar();
            }
        }
        System.out.println("--Visualizando titular y numero de las letras no vencidas---");
        for (int i = 0; i < letra.length; i++) {
            if (!letra[i].vencida()) {
                System.out.println("Titular: " + letra[i].getTitular() + "\nDias que faltan: " + letra[i].diasFaltan());
            }
        }

    }
}
