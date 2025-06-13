/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej2;

/**
 *
 * @author thero
 */
public class Numero {
    private int entero;

    public Numero() {
        this.entero=0;
    }

    public Numero(int entero) {
        this.entero = entero;
    }
    
    public void suma(int cantidad){
        this.entero=entero+cantidad;
    }
    
    public void resta(int cantidad){
        this.entero=entero-cantidad;
    }

    public int getEntero() {
        return entero;
    }
    
    public void doblar(){
        this.entero=entero*2;
    }
    
    public void triplicar(){
        this.entero=entero*3;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    
    
    
    
    
}
