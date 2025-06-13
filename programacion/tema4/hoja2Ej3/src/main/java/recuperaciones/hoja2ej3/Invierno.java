/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej3;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Invierno {
    private double[]temperaturas;

    public Invierno(int n) {
        Scanner t=new Scanner(System.in);
        temperaturas = new double[n];
        
        System.out.println("Introduce las temperaturas en el array:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Intruduce la temperatura nº "+(i+1)+":");
            temperaturas[i]=t.nextDouble();
        }
    }
    
    public double tempMedia(){
        double suma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            suma+=temperaturas[i];
        }
        double media=suma/temperaturas.length;
        return media;
    }
    
    public double[] fahrenheit(){
        double[]fahrenheit=new double[temperaturas.length];   
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i]=temperaturas[i]*1.8+32;
        }
        return fahrenheit;
    }
    
    public String mostrar(double[]array){
        String mostrar="";
        for (int i = 0; i < array.length; i++) {
            mostrar+=array[i];
            if (i<array.length-1) {
                mostrar+=" ";
            }
        }
        return mostrar;
    }
    
    
}
