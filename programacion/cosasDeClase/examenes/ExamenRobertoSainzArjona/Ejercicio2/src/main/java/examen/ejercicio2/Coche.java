/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.ejercicio2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Coche {
    private String propietario;
    private String modelo;
    private LocalDate fecha;

    public Coche(String propietario, String modelo, LocalDate fecha) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce el nombre del propietario:");
        this.propietario = s.nextLine();
        System.out.println("Introduce el modelo del proceso:");
        this.modelo = s.nextLine();
        System.out.println("Introduce la fecha de entrada:");
        
    }
    
    

    public String getPropietario() {
        return propietario;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public String toString(){
        Scanner t=new Scanner(System.in);
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        return "Coche (Propietario: "+propietario+" Modelo: "+modelo+" Fecha de entrada: "+fecha;
        
    }
}
