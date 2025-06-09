/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.correccionej2examen4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
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
       this.propietario=propietario;
       this.modelo=modelo;
       this.fecha=fecha;
        
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
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy").withLocale(Locale.es,)
        
        return "Coche (Propietario: "+propietario+" Modelo: "+modelo+" Fecha de entrada: "+fecha;
        
    }
}


