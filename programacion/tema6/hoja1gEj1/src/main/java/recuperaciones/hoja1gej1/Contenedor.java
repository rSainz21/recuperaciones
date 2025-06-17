/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja1gej1;

import java.util.Arrays;

/**
 *
 * @author thero
 */
public class Contenedor<T extends Comparable<T>> {
    private T[] elementos;

    // Constructor: array vacío
    @SuppressWarnings("unchecked")
    public Contenedor() {
        elementos = (T[]) new Comparable[0];
    }

    // Insertar al principio
    public void insertarAlPrincipio(T nuevo) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        System.arraycopy(elementos, 0, elementos, 1, elementos.length - 1);
        elementos[0] = nuevo;
    }

    // Insertar al final
    public void insertarAlFinal(T nuevo) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = nuevo;
    }

    // Extraer del principio
    public T extraerDelPrincipio() {
        if (elementos.length == 0) return null;

        T primero = elementos[0];
        T[] nuevoArray = Arrays.copyOfRange(elementos, 1, elementos.length);
        elementos = nuevoArray;
        return primero;
    }

    // Ordenar usando Arrays.sort()
    public void ordenar() {
        Arrays.sort(elementos);
    }

    // toString
    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}