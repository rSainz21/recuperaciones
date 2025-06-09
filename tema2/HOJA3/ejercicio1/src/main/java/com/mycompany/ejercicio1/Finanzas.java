/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author dam1
 */
public class Finanzas {
    
    private double cambio;

    public Finanzas() {
        
        this.cambio=1.06;
        
    }

    public Finanzas(double cambio) {
        this.cambio = cambio;
    }
   public double dolaresToEuros(double dinero){
      return dinero*cambio;
    
}
    public double eurosToDolares(double dinero){
      return dinero/cambio;
    
}
    
}
