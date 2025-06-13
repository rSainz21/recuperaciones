/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja5;

/**
 *
 * @author thero
 */
public class Restaurante {
    private int huevos;
    private double chorizo;

    public Restaurante(int docenasHuevos, double kilosChorizo) {
        this.huevos = docenasHuevos*12;
        this.chorizo = kilosChorizo;
        
    }
    
    public void addHuevos(int masDocenas){
        this.huevos+=masDocenas*12;
        
    }
    
    public void addChorizo(double masChorizo){
        this.chorizo+=masChorizo;
    }

    public int getNumPlatos() {
        int platosHuevos=huevos/2;
        int platosChorizo=(int)(chorizo/0.2);
        return Math.min(platosHuevos, platosChorizo);
    }

    public int getHuevos() {
        return huevos;
    }

    public double getKilosChorizo() {
        return chorizo;
    }
    
    public void sirvePlato(){
        if (getNumPlatos()>0){
            this.huevos-=2;
            this.chorizo-=0.2;
            System.out.println("Se a servido un plato");
        }else{
            System.out.println("No hay suficientes ingredientes");
        }
    }

    @Override
    public String toString() {
        return "Restaurante{" + "huevos=" + huevos + ", chorizo=" + chorizo + '}';
    }
    
   
}
