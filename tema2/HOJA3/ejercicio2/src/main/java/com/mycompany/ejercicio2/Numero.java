package com.mycompany.ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam1
 */
public class Numero {
    private int numero;
    public Numero(){
        this.numero=0;
    }
    public Numero(int num){
        this.numero=(num);
    }
    public int suma(int suma){
       numero+=suma;
       return numero;
    }
    public int resta(int resta){
       numero-=resta;
       return numero;
    }
    public int doble(){
       numero*=2;
       return numero;
    }
    public int triple(){
       numero*=3;
       return numero;
    }

    public int getNumero() {
        return numero;
    }
    
}
