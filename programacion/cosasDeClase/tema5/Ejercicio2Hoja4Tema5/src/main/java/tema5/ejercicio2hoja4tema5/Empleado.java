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
public class Empleado {
    private String nombre;
    private String departamento;
    private int edad;
    private boolean casado;
    private double salario;

    // Constructor sin parámetros
    public Empleado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Departamento: ");
        this.departamento = sc.nextLine();
        System.out.print("Edad (18-65): ");
        this.edad = sc.nextInt();
        System.out.print("Casado (true/false): ");
        this.casado = sc.nextBoolean();
        System.out.print("Salario: ");
        this.salario = sc.nextDouble();
    }

    // Constructor con parámetros
    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    // Método para mostrar la clasificación según la edad
    public String clasificacionPorEdad() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    // Método para imprimir los datos del empleado
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Edad: " + edad);
        System.out.println("Casado: " + casado);
        System.out.println("Salario: " + salario);
        System.out.println("Clasificación: " + clasificacionPorEdad());
    }

    // Método para aumentar el salario en un porcentaje
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }
}
