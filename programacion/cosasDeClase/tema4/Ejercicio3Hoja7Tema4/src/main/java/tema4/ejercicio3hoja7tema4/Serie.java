/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio3hoja7tema4;
import java.util.Scanner;
/**
 *
 * @author DAM109
 */
public class Serie {

    private double[] numeros;
    private char operacion;

    // Constructor que inicializa el array y la variable char
    public Serie(int tamaño, char operacion) {
        this.numeros = new double[tamaño];
        this.operacion = operacion;
        inicializarArray();
    }

    // Método para inicializar el array con valores pedidos por teclado
    private void inicializarArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextDouble();
        }
    }

    // Método que devuelve el resultado según la operación
    public double resultado() {
        double resultado = (operacion == '+') ? 0 : 1;
        for (double num : numeros) {
            if (operacion == '+') {
                resultado += num;
            } else if (operacion == '*') {
                resultado *= num;
            }
        }
        return resultado;
    }

}