/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author dam1
 */
public class Satelite {
    private int meridiano,paralelo,distancia;

    public Satelite() {
        this.distancia=0;
        this.meridiano=0;
        this.paralelo=0;
    }

    public Satelite(int meridiano, int paralelo, int distancia) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia = distancia;
    }
     
    public String posicion(){
        return "meridiano: "+meridiano+" paralelo: "+paralelo+" a "+distancia+"km de la Tierra";
    }
    
   public void variarAltura(int desp){
       this.distancia+=desp;
   }
    
   public void variarPosicion(int mer,int par){
       this.meridiano=mer;
       this.paralelo=par;
   }
   public boolean enOrbita(){
       return distancia<16;
   }
           
    
}
