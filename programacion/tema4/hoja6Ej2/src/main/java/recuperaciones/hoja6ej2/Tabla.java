/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6ej2;

import java.util.Random;

/**
 *
 * @author thero
 */
public class Tabla {
    // Array privado de 4x5
    private int[][] matriz = new int[4][5];

    // Constructor: inicializa con valores aleatorios del 1 al 100
    public Tabla() {
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = r.nextInt(100) + 1; // entre 1 y 100
            }
        }
    }

    // Mostrar la matriz
    public void mostrar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Mayor de una fila
    public int mayorF(int fila) {
        if (fila < 0 || fila >= 4) {
            throw new IllegalArgumentException("Fila fuera de rango");
        }

        int mayor = matriz[fila][0];
        for (int j = 1; j < 5; j++) {
            if (matriz[fila][j] > mayor) {
                mayor = matriz[fila][j];
            }
        }
        return mayor;
    }
    
    public int mayorC(int columna){
        if (columna<0 || columna>=4) {
            throw new IllegalArgumentException("columna fuera de rango");
            
        }
        
        int mayor=matriz[0][columna];
        for (int i = 0; i < 4; i++) {
            if (matriz[i][columna]>mayor) {
                mayor=matriz[i][columna];   
            }    
        }
        return mayor;   
    }
    
    public double media(){
        int suma=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                suma+=matriz[i][j];
                
            }    
        }
        return suma/(4*5);
    }
}