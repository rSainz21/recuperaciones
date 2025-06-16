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
public class Alumno extends Persona{
    private int[]notas;

    public Alumno(int numNotas) {
        super();
        notas = new int[numNotas];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce " + numNotas + " notas:");
        for (int i = 0; i < numNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }
    }
    
    private double calcularMedia() {
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    @Override
    public String mostrar() {
        return "ALUMNO\nDNI: " + getDNI() + "\nNombre: " + getNombre() +
               "\nDirección: " + getDireccion() + "\nMedia: " + calcularMedia();    
    }
}
