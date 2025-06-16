/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja9ej1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Array {
    private int[]vector;

    public Array() {
        vector=new int[10];
    }
    
    public void rellenar(){
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce las notas del alumno: " + vector);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce la nota numero " + (i + 1));
            vector[i] = t.nextInt();
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]+" ");
            
        }
        System.out.println();
    }
    
    public double media(){
        double suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
        }
        return suma/vector.length;
    }
    
    public void modificar(int num, int pos){
         if (pos >= 1 && pos <= vector.length) {
            vector[pos - 1] = num;
        } else {
            System.out.println("Posición fuera de rango (1-10)");
        }
    }
    
    public void rotarIzquierda(){
        int primero=vector[0];
        for (int i = 0; i < vector.length-1; i++) {
            vector[i]=vector[i+1];
        }
        vector[vector.length-1]=primero;
    }
    
    public void rotarDerecha(){
        int ultimo = vector[vector.length - 1];
        for (int i = vector.length - 1; i > 0; i--) {
            vector[i] = vector[i - 1];
        }
        vector[0] = ultimo;
    }
    
    public void comparar(Array a) {
        System.out.print("Elementos en común: ");
        boolean hayComun = false;
        for (int i = 0; i < this.vector.length; i++) {
            for (int j = 0; j < a.vector.length; j++) {
                if (this.vector[i] == a.vector[j]) {
                    System.out.print(this.vector[i] + " ");
                    hayComun = true;
                }
            }
        }
        if (!hayComun) {
            System.out.print("Ninguno");
        }
        System.out.println();
    }
    
    public void sumaPares(){
       int suma=0;
       
        for (int i = 0; i < 10; i++) {
            if (vector[i]%2==0) {
                suma+=vector[i];
            }
        }
        System.out.println("Suma de los números pares: " + suma);
    }
    
    public void multiplos(int numero){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numero * (i + 1);
        }
    }
}
