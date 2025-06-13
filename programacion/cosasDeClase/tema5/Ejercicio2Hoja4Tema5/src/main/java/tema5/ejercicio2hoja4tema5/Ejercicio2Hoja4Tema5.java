/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio2hoja4tema5;

/**
 *
 * @author DAM109
 */
public class Ejercicio2Hoja4Tema5 {

    public static void main(String[] args) {
        Plantilla plantilla = new Plantilla(10); // Capacidad para 10 empleados

        Empleado emp1 = new Empleado("Alice", "Contabilidad", 28, true, 30000);
        Programador prog1 = new Programador("Bob", "Desarrollo", 26, false, 40000, 50, "Java");
        Programador prog2 = new Programador("Charlie", "Desarrollo", 34, true, 45000, 40, "Python");

        plantilla.insertarEmpleado(emp1);
        plantilla.insertarEmpleado(prog1);
        plantilla.insertarEmpleado(prog2);

        System.out.println("Información de todos los empleados:");
        System.out.println(plantilla.informacionEmpleados());

        System.out.println("Mejor programador:");
        Programador mejorProg = plantilla.mejorProgramador();
        if (mejorProg != null) {
            mejorProg.imprimirDatos();
        }

        System.out.println("Empleados senior:");
        System.out.println(plantilla.informacionSeniors());

        System.out.println("Aumentando sueldo a programadores intermedios que dominan Java...");
        plantilla.aumentarSueldoProgramadoresIntermediosJava();
        System.out.println("Información actualizada de todos los empleados:");
        System.out.println(plantilla.informacionEmpleados());
    }
}
