/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja1cej1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author thero
 */
public class Hoja1cEj1 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = leeValores();
        int suma = calcularSuma(lista);
        double media = (lista.size() > 0) ? (double) suma / lista.size() : 0;
        mostrarResultados(lista, suma, media);
    }

    public static ArrayList<Integer> leeValores() {
        ArrayList<Integer> valores = new ArrayList<>();
        int numero;
        System.out.println("Introduce números enteros (termina con -99):");
        do {
            numero = Teclado.leerEntero("Número: ");
            if (numero != -99) {
                valores.add(numero);
            }
        } while (numero != -99);
        return valores;
    }

    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            suma += it.next();
        }
        return suma;
    }

    public static void mostrarResultados(ArrayList<Integer> lista, int suma, double media) {
        System.out.println("\n--- Resultados ---");
        System.out.println("Números leídos: " + lista.size());
        System.out.println("Suma: " + suma);
        System.out.printf("Media: %.2f\n", media);

        int mayores = 0;
        System.out.println("Valores introducidos:");
        for (int n : lista) {
            System.out.println(n);
            if (n > media) {
                mayores++;
            }
        }
        System.out.println("Valores mayores que la media: " + mayores);
    }
}
