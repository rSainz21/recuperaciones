/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja8;

import java.util.Arrays;

/**
 *
 * @author thero
 */
public class Hoja8 {

    public static void main(String[] args) {
         Alumno a = new Alumno("Pepe");

        a.mostrarNotas();
        System.out.println("Mayor nota: " + a.mayor());
        System.out.println("Menor nota: " + a.menor());

        int buscarNota = 8;
        int pos = a.buscar(buscarNota);
        if (pos >= 0) {
            System.out.println("La nota " + buscarNota + " está en la posición " + pos + " del array ordenado.");
        } else {
            System.out.println("La nota " + buscarNota + " no se encuentra en el array.");
        }

        int[] top3 = a.tresMejores();
        System.out.println("Las tres mejores notas son: " + Arrays.toString(top3));

        a.ponerA0();
        System.out.println("Notas tras poner a cero:");
        a.mostrarNotas();
    }
}