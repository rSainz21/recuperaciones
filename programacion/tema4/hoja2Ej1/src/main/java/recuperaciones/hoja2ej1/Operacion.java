/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Operacion {
    private int[]array=new int[5];

    public Operacion() {
        Scanner t=new Scanner(System.in);
        System.out.println("Introduce 5 numeros enteros: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Numero "+(i+1)+":");
            array[i]=t.nextInt();
        }
    }
    
    public void multiplicar(){
        System.out.println("--Multiplicando todo por 2--");
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]*2;
        }
    }
    public void mostrar(){
        System.out.println("--Mostrando el contenido del array--");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public int suma(){
        int suma = 0;
        System.out.println("Sumando posiciones pares...");
        for (int i = 0; i < array.length; i+=2) {
            suma+=array[i];
        }
        return suma;
    }
    
}
