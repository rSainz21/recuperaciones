/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2.ejercicio1tema3;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class MaquinaExpendedora {
    private double costoProducto;
    private double saldo;
    
    public MaquinaExpendedora(double costoProducto, double saldo){
    this.costoProducto=costoProducto;
    this.saldo=saldo;
    }
    
    public double getCostoProducto(){
        return costoProducto;
    }
    
    public void setCostoProducto(){
        this.costoProducto=costoProducto;
        
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(){
        this.saldo=saldo;
    }
    
    public void restarSaldo(double cantidad){
        if(cantidad>0){
            saldo-=cantidad;
        }
    }
    
    public boolean recargarSaldo(double cantidad){
        boolean bien=false;
        if(cantidad>0){
            saldo+=cantidad;
            bien=true;
        }
        return bien;
    }
        
        
    
   
}
