/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio4hoja1;

/**
 *
 * @author dam1
 */
public class Billete {
    private double distancia;
    private int diasEstancia;

    // Constructor 
    public Billete(double distancia, int diasEstancia) {
        this.distancia = distancia;
        this.diasEstancia = diasEstancia;
    }

    // Método para calcular el importe del billete
    public double importe() {
        double precioPorKm = 0.60;
        double importeTotal = distancia * precioPorKm;

        // Aplicar descuento 
        if (diasEstancia > 7 && distancia > 800) {
            importeTotal *= 0.70; // Aplicar un 30% de descuento
        }

        return importeTotal;
    }
}