/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2hoja9tema4;

/**
 *
 * @author DAM109
 */
public class Multiplicar {

    private int[][] matriz;

    public Multiplicar() {
        matriz = new int[10][10];
        inicializarMatriz();
    }

    private void inicializarMatriz() {
        for (int i = 0; i < 10; i++) {
            matriz[0][i] = i;
            matriz[i][0] = i;
        }
    }

    public void multiplica() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                matriz[i][j] = matriz[i][0] * matriz[0][j];
            }
        }
    }

    public void muestra() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int[] valoresAspa() {
        int[] aspa = new int[19];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            aspa[index++] = matriz[i][i];
        }
        for (int i = 0; i < 10; i++) {
            aspa[index++] = matriz[i][9 - i];
        }
        return aspa;
    }

    public int[] tablaMultiplicar(int numero) {
        if (numero < 1 || numero > 9) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 9.");
        }
        int[] tabla = new int[9];
        for (int i = 1; i < 10; i++) {
            tabla[i - 1] = matriz[numero][i];
        }
        return tabla;
    }

    

}
