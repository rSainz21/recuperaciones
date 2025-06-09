/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1hoja3tema3;

/**
 *
 * @author dam1
 */
public class Fondo {
    private final double C;
    private final double I;
    private final int N;
    
    public Fondo(double capital, double interes, int años) {
        this.C = capital;
        this.I = interes;
        this.N = años;
    }
    public void evolucion() {
        double capitalAcumulado = C;
        for (int año = 1; año <= N; año++) {
            double interesAnual = capitalAcumulado * I / 100;
            capitalAcumulado += interesAnual;
            System.out.println("Año " + año + ": Interés = " + interesAnual + ", Capital acumulado = " + capitalAcumulado);
        }
    }  
}
