/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja9ej2;

/**
 *
 * @author thero
 */
public class Multiplicar {
    private int[][] tabla;

    public Multiplicar() {
        tabla = new int[10][10];
        // Inicializar primera fila y primera columna
        for (int i = 1; i < 10; i++) {
            tabla[0][i] = i;
            tabla[i][0] = i;
        }
    }

    public void multiplica() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                tabla[i][j] = tabla[i][0] * tabla[0][j];
            }
        }
    }

    public void muestra() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }
    }

    public int[] valoresAspa() {
        int[] aspa = new int[19];
        int k = 0;

        for (int i = 0; i < 10; i++) {
            aspa[k++] = tabla[i][i]; // Diagonal principal
        }

        for (int i = 0; i < 10; i++) {
            if (i != 9 - i) {
                aspa[k++] = tabla[i][9 - i]; // Diagonal inversa
            }
        }

        return aspa;
    }

    public int[] tablaMultiplicar(int n) {
        int[] vector = new int[9];
        for (int i = 1; i <= 9; i++) {
            vector[i - 1] = n * i;
        }
        return vector;
    }
}