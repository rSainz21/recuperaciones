/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4hoja3tema6;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Atleta {
//dorsal (int), nombre(String), 
//tiempo(double) y los métodos:
//• Un constructor que pide los datos por teclado
//• Métodos get y set que creas necesarios
    int dorsal;
    String nombre;
    double tiempo;

    public Atleta(int dorsal, String nombre, double tiempo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Atleta{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", tiempo=" + tiempo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.dorsal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atleta other = (Atleta) obj;
        return this.dorsal == other.dorsal;
    }
    
    
    
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    
    
    

}
