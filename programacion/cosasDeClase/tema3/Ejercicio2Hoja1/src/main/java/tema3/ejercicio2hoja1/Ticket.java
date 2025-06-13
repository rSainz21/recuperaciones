/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio2hoja1;

/**
 *
 * @author dam1
 */
public class Ticket {
    private double kilosVendidos;

    // Constructor
    public Ticket(double kilosVendidos) {
        this.kilosVendidos = kilosVendidos;
    }

    // Método para calcular el importe total
    private double calcularImporte() {
        if (kilosVendidos > 10) {
            return kilosVendidos * 1.2;
        } else {
            return kilosVendidos * 1.5;
        }
    }
    public String imprimir() {
        double importeTotal = calcularImporte();
        return "Kilos vendidos: " + kilosVendidos + "\nImporte total: " + importeTotal + "€";
    }

}
