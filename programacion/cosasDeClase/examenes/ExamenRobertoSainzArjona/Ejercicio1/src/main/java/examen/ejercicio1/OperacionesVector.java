/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.ejercicio1;

/**
 *
 * @author DAM1
 */
public class OperacionesVector { //Roberto Sainz Arjona DAM109
    private int [] vector={5,3,7,9,6,28,57};
    
    public OperacionesVector(){
        this.vector=vector;
    }
    
    public void mostrar(){
        for(int i=0;i<vector.length;i++){
            System.out.println("Vector: ["+i);
        }
        System.out.println("]");
    }
    
    public void encontrarPrimo(){
        
    }
    
    public void invertirVector(){
        int [] aux=new int[vector.length];
        for(int i=vector.length-1;i>=0;i--){
            for(int j=vector.length-1;j>=0;j++){
                aux[j]=vector[i];
                System.out.println(aux[j]);
            }
        }
    }
     public void divisores(int num){
         
     }
    //int[]aux=new int[vector.length];
    //int i=numeros.leng-1; j=0;i>=0;i--;j++
    //aux[j]=numeros[i]
    //sout    aux[j]
}

