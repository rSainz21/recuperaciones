/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej2;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Vector {
    private int[]array=new int[5];

    public Vector() {
        Scanner t=new Scanner(System.in);
        System.out.println("Introduce 5 numeros enteros: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Numero "+(i+1)+":");
            array[i]=t.nextInt();
        }
    }
    
    public int mayor(){
        int mayor=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>mayor) {
                mayor=array[i];
            }
        }
        return mayor;
    }
    
    public int menor(){
        int menor=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<menor) {
                menor=array[i];
            }
        }
        return menor;
    }
    
    public double media(){
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
        }
        double media=suma/array.length;
        return media;
    }
}
