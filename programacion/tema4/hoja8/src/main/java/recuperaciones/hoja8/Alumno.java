/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Alumno {

    private String nombre;
    private int[] notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new int[5];

        Scanner t = new Scanner(System.in);
        System.out.println("Introduce las notas del alumno: " + nombre);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la nota numero " + (i + 1));
            notas[i] = t.nextInt();
        }
    }

    public int mayor() {
        int[] copia = Arrays.copyOf(notas, notas.length);
        Arrays.sort(copia);
        return copia[copia.length - 1]; // última posición = mayor
    }

    public int menor() {
        int[] copia = Arrays.copyOf(notas, notas.length);
        Arrays.sort(copia);
        return copia[0]; // primera posición = menor
    }

    public void ponerA0() {
        int[] copia = Arrays.copyOf(notas, notas.length);
        Arrays.fill(notas, 0);
    }

    public int buscar(int posicion) {
        int[] copia = Arrays.copyOf(notas, notas.length);
        Arrays.sort(copia);
        return Arrays.binarySearch(copia, posicion);
    }

    public int[] tresMejores() {
        int[] copia = Arrays.copyOf(notas, notas.length);
        Arrays.sort(copia); // Ordenamos de menor a mayor
        // Copiamos los 3 últimos (mayores)
        return Arrays.copyOfRange(copia, copia.length - 3, copia.length);
    }

    // Mostrar todas las notas
    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre + ": " + Arrays.toString(notas));
    }
}
