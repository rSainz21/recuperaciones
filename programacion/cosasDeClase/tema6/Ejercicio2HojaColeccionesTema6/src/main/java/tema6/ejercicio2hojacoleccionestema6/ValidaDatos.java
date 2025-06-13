/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2hojacoleccionestema6;

import java.time.LocalDate;
import java.util.regex.Pattern;

/**
 *
 * @author DAM109
 */
public class ValidaDatos {
    
    public static boolean validaNombre(String nombre){
        boolean nombreValidado=nombre.matches("[a-zA-Z0-9]{3,30}");
        return nombreValidado;     
    }
    
    public static boolean validarDNI(String DNI){
        boolean DniValidado=DNI.matches("[0-9]{8}[A-Z]");
        return DniValidado;
    }
    
    public static boolean validarFecha(String fechaNac){
        boolean fechaValidada=fechaNac.matches("\\d{4}-\\d{2}-\\d{2}");
        return fechaValidada;
        
    }
}
