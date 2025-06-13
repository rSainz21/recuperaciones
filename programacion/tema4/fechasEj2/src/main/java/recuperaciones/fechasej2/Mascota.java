/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.fechasej2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author thero
 */
public class Mascota {
    private String nombre;
    private LocalDate fechanac;

    public Mascota(String nombre, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.fechanac = LocalDate.of(anio, mes, dia);
    }
    
    public long getEdad(){
        long edad;
        return edad=ChronoUnit.YEARS.between(fechanac, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", fechanac=" + fechanac + '}';
    }
  
}
