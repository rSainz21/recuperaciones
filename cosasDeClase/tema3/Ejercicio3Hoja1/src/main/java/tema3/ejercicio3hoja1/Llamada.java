/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio3hoja1;

/**
 *
 * @author dam1
 */
public class Llamada {
    private int duracion; // Duración en segundos

    // Constructor
    public Llamada() {
        this.duracion = 0;
    }

    // Método aPagar
    public double aPagar(int minutos, int segundos) {
        // Convertir a segundos
        int totalSegundos = minutos * 60 + segundos;
        double coste;

        // Calcular el coste
        if (totalSegundos <= 60) {
            coste = 0.25;
        } else {
            int segundosAdicionales = totalSegundos - 60;
            coste = 0.25 + (segundosAdicionales / 10) * 0.1;
        }

        return coste;
    }
}