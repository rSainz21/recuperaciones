/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio3hoja1tema5;

/**
 *
 * @author DAM109
 */
public class AparatoElectrico {
    private static double consumoTotal = 0.0;
    private double potencia;
    private boolean encendido;

    public AparatoElectrico(double potencia) {
        this.potencia = potencia;
        this.encendido = false;
    }

    public void enciende() {
        if (!this.encendido) {
            this.encendido = true;
            consumoTotal += this.potencia;
        }
    }

    public void apaga() {
        if (this.encendido) {
            this.encendido = false;
            consumoTotal -= this.potencia;
        }
    }

    public static double consumo() {
        return consumoTotal;
    }

    
}
