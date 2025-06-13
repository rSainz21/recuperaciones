/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej4;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Alumno {
    private String nombre;
    private int[]notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas=new int[5];
        Scanner n=new Scanner(System.in);
        System.out.println("Intoduce las notas del alumno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Intruduce la nota nº "+(i+1)+":");
            notas[i]=n.nextInt();
        }
    }
    
    public int mayor(){
        int mayor=notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>mayor) {
                mayor=notas[i];
            }
        }
        return mayor;
    }
    
    public int menor(){
        int menor=notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<menor) {
                menor=notas[i];
            }
        }
        return menor;
    }
    
    public double notaMedia(){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
        }
        double media=suma/notas.length;
        return media;
    }
    
    public String mostrar(){
        
        return nombre.toUpperCase()+" "+notaMedia();
        
    }
       
}
