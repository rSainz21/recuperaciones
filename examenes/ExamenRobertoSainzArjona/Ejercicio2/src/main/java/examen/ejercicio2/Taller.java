/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.ejercicio2;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author DAM1
 */
public class Taller {
    private String []coches;
    private int contador;
    private int capacidad;
    public Taller(int capacidad){
        this.coches=coches;
    }
    
    public boolean agregarCoche(){
        Scanner teclado=new Scanner(System.in);
        if(capacidad>0){
            System.out.println("El coche puede ser reparado");
            contador++;
            System.out.println("Introduce los datos del coche");
            for(int i=0;i<coches.length;i++){
                String coches=teclado.nextLine();
                
            }
        }else{
            System.out.println("No hay sitio para poder reparar el coche, el taller esta lleno");
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
