/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.correccionej1examen4;

/**
 *
 * @author DAM109
 */
public class OperacionesVector {

    private int[] vector;

    public OperacionesVector(int[] array) {
        this.vector = array;
    }

    public void mostrar() {
        System.out.println("Vector: [");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(i + " ");
        }
        System.out.println("]");
    }

    public void encontrarPrimo() {
        boolean esPrimoEncontrado = false;
        for (int i = 0; i < vector.length && !esPrimoEncontrado; i++) {
            if (esPrimo(vector[i])) {
                System.out.println("Primer numero primo encontrado: " + vector[i]);
                esPrimoEncontrado = true;
            }
        }
        if (!esPrimoEncontrado) {
            System.out.println("No hay numeros primos en el vector.");
        }
    }

    public void invertirVector() {
        int inicio = 0;
        int fin = vector.length - 1;

        while (inicio < fin) {
            int aux = vector[inicio];
            vector[inicio] = vector[fin];

        }
    }

    public void divisores(int num) {
        int j = 0;
        for (int i = 1; (i <= Math.abs(num) && j < vector.length); i++) {
            if (num % i == 0) {
                vector[j] = num / i;
                j++;
            }
        }
        
    }

    private boolean esPrimo(int num) {
        boolean NoEsPrimo = false;
        if (num > 1) {
            for (int i = 2; (i <= Math.sqrt(num) && !NoEsPrimo); i++) {
                if (num % i == 0) {
                    NoEsPrimo = true;
                }
            }
        } else {
            NoEsPrimo = true;
        }
        return !NoEsPrimo;
    }

}
