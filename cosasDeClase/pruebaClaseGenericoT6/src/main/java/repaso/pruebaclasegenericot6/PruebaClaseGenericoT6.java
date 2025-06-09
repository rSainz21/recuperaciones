/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package repaso.pruebaclasegenericot6;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author DAM109
 */
public class PruebaClaseGenericoT6 {

    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Ana", 30),
            new Persona("Luis", 25),
            new Persona("Marta", 35)
        };

        // Ordenar usando Comparable
        Arrays.sort(personas);
        System.out.println(Arrays.toString(personas));

        // Ordenar usando Comparator
        Arrays.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.nombre.compareTo(p2.nombre);
            }
        });
        System.out.println(Arrays.toString(personas));
    }
}
