/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2hoja4tema5;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    // Constructor sin parámetros
    public Programador() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Líneas de código por hora: ");
        this.lineasDeCodigoPorHora = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Lenguaje dominante: ");
        this.lenguajeDominante = sc.nextLine();
    }

    // Constructor con parámetros
    public Programador(String nombre, String departamento, int edad, boolean casado, double salario,
                       int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    // Método para imprimir los datos del programador
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Líneas de código por hora: " + lineasDeCodigoPorHora);
        System.out.println("Lenguaje dominante: " + lenguajeDominante);
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }
}
