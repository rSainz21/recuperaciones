/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2hojacoleccionestema6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Persona {

    private String nombre;
    private String DNI;
    private LocalDate fechaNac;

    public Persona() {
        System.out.println("Introduce un nombre");
        this.nombre = new Scanner(System.in).nextLine();
        while (!ValidaDatos.validaNombre(nombre)) {
            this.nombre = new Scanner(System.in).nextLine();
            System.out.println("Mierda");
        }
        System.out.println("Introduce tu dni");
        this.DNI = new Scanner(System.in).nextLine();
        while (!ValidaDatos.validarDNI(DNI)){
            this.DNI = new Scanner(System.in).nextLine();
            System.out.println("Mierda");
        }
        System.out.println("Introduce tu fecha de nacimiento (yyyy-MM-dd");
        String fecha=new Scanner(System.in).nextLine();
        while (!ValidaDatos.validarFecha(fecha)){
            
            fechaNac = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy/MM/dd"));    
        }
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaNac=" + fechaNac + '}';
    }

    public String getDNI() {
        return DNI;
    }

    public double getCuota() {
        double precio = 0;
        int edad = getEdad();
        if (edad >= 5 && edad <= 10) {
            precio = 1.0;
        } else if (edad >= 11 && edad <= 17) {
            precio = 2.5;
        } else if (edad >= 18) {
            precio = 3.5;
        }
        return precio;
    }

}
