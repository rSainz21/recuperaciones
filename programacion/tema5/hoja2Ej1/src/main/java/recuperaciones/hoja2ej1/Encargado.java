/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej1;

/**
 *
 * @author thero
 */
public class Encargado extends Empleado {

    public Encargado(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * 1.10; // 10% más
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Encargado: " + getNombre());
        System.out.println("Sueldo (con 10% extra): " + getSueldo() + " €");
    }
}


