/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hoja6tema6;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DAM109
 */
public class Persona implements Identificable {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    
    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Map<String, String> listaObjeto() {
        Map<String, String> info = new HashMap<>();
        info.put("Nombre", nombre);
        info.put("Apellidos", apellidos);
        info.put("Fecha de Nacimiento", fechaNacimiento.toString());
        return info;
    }
}