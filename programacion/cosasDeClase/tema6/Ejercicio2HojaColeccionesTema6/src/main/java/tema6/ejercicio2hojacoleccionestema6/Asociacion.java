/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2hojacoleccionestema6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DAM109
 */
public class Asociacion {

    private ArrayList<Persona> socios;

    public Asociacion() {
        socios = new ArrayList<>();
    }

    public void insertar(Persona persona) {
        socios.add(persona);
    }

    public void buscar(String DNI) {
        String aux;
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getDNI().equals(DNI)) {
                aux = socios.toString();
            }

        }

    }

    public double calcularRecaudacion() {
        double total = 0;
        for (int i = 0; i < socios.size(); i++) {
            total += socios.get(i).getCuota();
        }
        return total;
    }

}
