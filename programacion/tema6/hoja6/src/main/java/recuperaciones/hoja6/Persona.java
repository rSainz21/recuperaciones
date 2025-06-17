/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thero
 */
public class Persona implements Identificable {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNacimiento;
    }

    public String getNombre() {
        return nombre; 
    }
    public String getApellidos() {
        return apellidos; 
    }
    public LocalDate getFechaNacimiento() {
        return fechaNac; 
    }


    
    

     @Override
    public Map<String, String> listaObjeto() {
        Map<String, String> datos = new HashMap<>();
        datos.put("Nombre", nombre);
        datos.put("Apellidos", apellidos);
        datos.put("Fecha de nacimiento", fechaNac.toString());
        return datos;
    }
}
