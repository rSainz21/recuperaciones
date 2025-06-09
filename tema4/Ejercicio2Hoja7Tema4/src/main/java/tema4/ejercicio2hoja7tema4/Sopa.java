/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2hoja7tema4;

import java.util.Random;

/**
 *
 * @author DAM109
 */
public class Sopa {
    
    private char[][] sopa;

    
    public Sopa() {
        sopa = new char[10][20];
        inicializarSopa();
        
        
    }

    
    public Sopa(int filas, int columnas) {
        this.sopa = new char[filas][columnas];
        inicializarSopa();
        Random letras=new Random();
        for (int i=0; i<sopa.length;i++){
            for (int j=0; j<sopa.length;j++){
                sopa[i][j]=(char) (letras.nextInt(90-65+1)+65);
            }
            
        }
    }

    
    private void inicializarSopa() {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                Random letras=new Random();
                sopa[i][j]=(char) (letras.nextInt(90-65+1)+65);
            }
        }
    }

    
    public void mostrar() {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public void setPalabra(String palabra, int x, int y, int D) {
        if (D == 1) { // Dirección horizontal
            for (int i = 0; i < palabra.length(); i++) {
                if (x>=0 && x<sopa.length && (y+i)>=0 && (y+i)< sopa[0].length){
                    sopa[x][y+i]= palabra.charAt(i);
                }else{
                    System.out.println("La palabra no cabe horizontalmente jajajajaja");
                }
            }
                                 
        } else if (D == -1) { // Dirección vertical
            for (int i = 0; i < palabra.length(); i++) {
                if ((x+i)>=0 && (x+i)< sopa.length && y>=0 && y<sopa[0].length){
                    sopa[x + i][y] = palabra.charAt(i);
                }else{
                    System.out.println("La palabra no cabe verticalmente jajajajaja");
                }
                
            }
        }
    }

}
