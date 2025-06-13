/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej1;

/**
 *
 * @author thero
 */
public class Finanzas {
    private double cambioDolarEuro;

    public Finanzas() {
        this.cambioDolarEuro=1.06;
    }

    public Finanzas(double cambio) {
        this.cambioDolarEuro = cambio;
    }
    public double dolaresAeuros(double dolares){
        return dolares*cambioDolarEuro;
    }
    public double eurosAdolares(double euros){
        return euros/cambioDolarEuro;
        
    }
    
}
