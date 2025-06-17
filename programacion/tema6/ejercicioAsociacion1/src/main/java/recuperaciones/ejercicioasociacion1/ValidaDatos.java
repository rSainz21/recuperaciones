/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicioasociacion1;

import java.time.LocalDate;

/**
 *
 * @author thero
 */
public class ValidaDatos {
    public static boolean validaNombre(String nombre){
        boolean nombreValidado=nombre.matches("[a-zA-Z0-9]{3,30}");
        return nombreValidado;     
    }
    
    public static boolean validaFecha(String fechaNac){
        boolean fechaValidada=fechaNac.matches("\\d{4}-\\d{2}-\\d{2}");
        return fechaValidada;
    }
    
    public static boolean validaDNI(String DNI){
        boolean dniValidado=DNI.matches("[0-9]{8}[A-Z]");
        return dniValidado;
    }
}
