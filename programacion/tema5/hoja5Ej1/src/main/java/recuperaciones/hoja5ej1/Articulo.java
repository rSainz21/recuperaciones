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
public class Articulo {
    private String codigo;
    private String descripcion;
    private int existencias;

    public Articulo() {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce el codigo del articulo:");
        this.codigo = s.nextLine();
        System.out.println("Introduce la descripcion del articulo:");
        this.descripcion = s.nextLine();
        System.out.println("Introduce el numero de existencias del articulo:");
        this.existencias = s.nextInt();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }
    
    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Existencias: " + existencias);
        System.out.println("-----------------------------");
    }
    
    
    
    
}
