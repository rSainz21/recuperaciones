/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public abstract class Persona {
    private String DNI;
    private String nombre;
    private String direccion;

    public Persona() {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce el dni:");
        this.DNI = s.nextLine();
        System.out.println("Inreoduce el nombre:");
        this.nombre = s.nextLine();
        System.out.println("Introduce la direccion:");
        this.direccion = s.nextLine();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public abstract String mostrar();    
}
