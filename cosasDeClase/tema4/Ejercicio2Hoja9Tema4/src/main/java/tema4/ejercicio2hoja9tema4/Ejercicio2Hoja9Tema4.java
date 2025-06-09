/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio2hoja9tema4;

/**
 *
 * @author DAM109
 */
public class Ejercicio2Hoja9Tema4 {

    public static void main(String[] args) {
        Multiplicar multiplicar = new Multiplicar();
        multiplicar.multiplica();
        multiplicar.muestra();

        int[] aspa = multiplicar.valoresAspa();
        System.out.println("Valores en aspa:");
        for (int valor : aspa) {
            System.out.print(valor + " ");
        }
        System.out.println();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce el número de la tabla de multiplicar (1-9): ");
        int numero = scanner.nextInt();
        int[] tabla = multiplicar.tablaMultiplicar(numero);
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int valor : tabla) {
            System.out.print(valor + " ");
        }
        System.out.println();
        scanner.close();
    }
}
