/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.hoja6ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja6Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = {
            {101, 102, 103, 104, 105},
            {201, 202, 203, 204, 205},
            {301, 302, 303, 304, 305},
            {401, 402, 403, 404, 405},
            {501, 502, 503, 504, 505}
        };

        int opcion;
        do {
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Elegir fila");
            System.out.println("2. Elegir columna");
            System.out.println("3. Mostrar diagonal principal");
            System.out.println("4. Mostrar diagonal inversa");
            System.out.println("5. Mostrar diagonal hacia arriba");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el número de fila (0 a 4): ");
                    int fila = sc.nextInt();
                    if (fila >= 0 && fila < matriz1.length) {
                        System.out.print("Fila " + fila + ": ");
                        for (int i = 0; i < matriz1[fila].length; i++) {
                            System.out.print(matriz1[fila][i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Fila no válida.");
                    }
                }
                case 2 -> {
                    System.out.print("Introduce el número de columna (0 a 4): ");
                    int col = sc.nextInt();
                    if (col >= 0 && col < matriz1[0].length) {
                        System.out.print("Columna " + col + ": ");
                        for (int i = 0; i < matriz1.length; i++) {
                            System.out.print(matriz1[i][col] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Columna no válida.");
                    }
                }
                case 3 -> {
                    System.out.print("Diagonal principal: ");
                    for (int i = 0; i < matriz1.length; i++) {
                        System.out.print(matriz1[i][i] + " ");
                    }
                    System.out.println();
                }
                case 4 -> {
                    System.out.print("Diagonal inversa: ");
                    for (int i = 0; i < matriz1.length; i++) {
                        System.out.print(matriz1[i][matriz1.length - 1 - i] + " ");
                    }
                    System.out.println();
                }
                case 5 -> {
                    System.out.print("Diagonal hacia arriba (desde abajo izquierda a arriba derecha): ");
                    for (int i = matriz1.length - 1; i >= 0; i--) {
                        System.out.print(matriz1[i][matriz1.length - 1 - i] + " ");
                    }
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("¡Hasta luego, máquina!");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        } while (opcion != 6);
    }
}
