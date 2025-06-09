/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio4hojamaintema4;

/**
 *
 * @author DAM109
 */
public class Operaciones {
    private int valor1;
    private int valor2;

    // Constructor
    public Operaciones(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Método para calcular la suma
    public int sumar() {
        return valor1 + valor2;
    }

    // Método para calcular la resta
    public int restar() {
        return valor1 - valor2;
    }

    // Método para calcular la multiplicación
    public int multiplicar() {
        return valor1 * valor2;
    }

    // Método para calcular la división
    public double dividir() {
        if (valor2 != 0) {
            return (double) valor1 / valor2;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }

    // Método para imprimir los resultados
    public void imprimirResultados() {
        System.out.println("Suma: " + sumar());
        System.out.println("Resta: " + restar());
        System.out.println("Multiplicación: " + multiplicar());
        System.out.println("División: " + dividir());
    }

}
