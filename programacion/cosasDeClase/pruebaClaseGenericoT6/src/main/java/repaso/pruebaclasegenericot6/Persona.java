/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.pruebaclasegenericot6;

/**
 *
 * @author DAM109
 */
class Persona implements Comparable<Persona> {
    String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int compareTo(Persona otra) {
        return otra.edad - this.edad;
    }
    
     @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
