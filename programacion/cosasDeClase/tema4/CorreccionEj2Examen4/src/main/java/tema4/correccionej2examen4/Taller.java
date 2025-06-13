/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.correccionej2examen4;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Taller {
    private Coche []coches;
    private int contador;
    
    
    public Taller(int maxCoches){
        this.coches=new Coche[maxCoches];
        this.contador=0;
    }
    
    public boolean agregarCoche(Coche coche){
       boolean encontrado=false;
        for (int i = 0; (i < contador && !encontrado); i++) {
            if(coches[i].equals(coches)){
                
            }
        }
        return false;
        
    }
    
    public void eliminarCoche(){
        
    }
    public void consultarCoche(){
        
    }
    
    public void consultarModelo(){
        
    }
    
    public void consultarEntrada(){
        
    }
    
    public String mostrarTaller(){
        for(int i=0;i<coches.length;i++){
                System.out.println(i);
                
            }
        return "coches actualmente en el taller: ";
    }
    
}


