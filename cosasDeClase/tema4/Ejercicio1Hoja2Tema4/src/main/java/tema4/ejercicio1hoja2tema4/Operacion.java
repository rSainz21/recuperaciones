/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1hoja2tema4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Operacion {

    private int[] a5;

    public Operacion() {
        a5 = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < a5.length; i++) {
            a5[i] = scanner.nextInt();
        }
    }

    public void multiplicacion() {
        for (int i = 0; i < a5.length; i++) {
            a5[i] *= 2;
        }
    }

    public void mostrarArray() {
        System.out.println("Contenido del array: ");
        for (int i = 0; i < a5.length; i++) {
            System.out.print(a5[i] + " ");
        }
        System.out.println();
    }
    
    public int sumaDePosiciones() {
        int suma = 0;
        for (int i = 0; i < a5.length; i += 2) {
            suma += a5[i];
        }
        return suma;
    }
}

