/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja5ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Almacen {
    private Articulo[]articulos;

    public Almacen(int n) {
        articulos=new Articulo[n];
    }
    
    public void rellenar(){
        System.out.println("Introduce los articulos:");
        for (int i = 0; i < articulos.length; i++) {
            System.out.println("Introduce el articulo numero "+(i+1)+":");
            articulos[i]=new Articulo();
        }
    }
    
    public void pedidos(){
        System.out.println("datos de los articulos con menos de 10 existencias");
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getExistencias()<10) {
                articulos[i].mostrarInfo();
            }
        }
    }

    
}
