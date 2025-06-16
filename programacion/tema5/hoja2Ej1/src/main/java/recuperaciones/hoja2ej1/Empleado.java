/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej1;

/**
 *
 * @author thero
 */
public class Empleado {
    private String nombre;
    private double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldoBase;
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo: " + getSueldo() + " €");
    }
}