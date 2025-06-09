/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1hoja3tema6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author DAM109
 */
public class Mundo {

    private Set<String> paises;

    // Constructor
    public Mundo() {
        paises = new HashSet<>();
    }

    public void añadirPais(String pais) {
        if (paises.add(pais.toLowerCase())) {
            System.out.println("Se ha insertado correctamente");
        } else {
            System.out.println("No se ha añadido");
        }
    }

    public void borrarPais(String pais) {
        Iterator<String> itera = paises.iterator();
        boolean encontrado = false;
        try {

            while (itera.hasNext() && !encontrado) {
                String mundo = itera.next();
                if (mundo.equalsIgnoreCase(pais)) {
                    itera.remove();
                    System.out.println("Se ha eliminado el curso");
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se ha encontrado el curso");
            }
        } catch (UnsupportedOperationException ex) {
            System.out.println("No se ha podido borrar el pais");
        }

    }

    public void listarPaises() {
        if (paises.isEmpty()) {
            System.out.println("No hay países en la lista.");
        } else {
            System.out.println("Paises registrados:");
            for (String pais : paises) {
                System.out.println(pais);
            }
        }
    }
}
