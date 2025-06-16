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
public class Profesor extends Persona {
    private String[]asignaturas;

    public Profesor(int numAsignaturas) {
        super();
        asignaturas = new String[numAsignaturas];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce " + numAsignaturas + " asignaturas:");
        for (int i = 0; i < numAsignaturas; i++) {
            System.out.print("Asignatura " + (i + 1) + ": ");
            asignaturas[i] = sc.nextLine().toUpperCase(); // En mayúsculas
        }
    }

    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("PROFESOR\nDNI: ").append(getDNI())
          .append("\nNombre: ").append(getNombre())
          .append("\nDirección: ").append(getDireccion())
          .append("\nAsignaturas: ");
        for (String asignatura : asignaturas) {
            sb.append(asignatura).append(" ");
        }
        return sb.toString();
    }
}