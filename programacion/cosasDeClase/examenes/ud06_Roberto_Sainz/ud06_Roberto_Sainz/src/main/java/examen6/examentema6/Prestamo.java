/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen6.examentema6;

import java.time.LocalDate;

/**
 *
 * @author DAM1
 */
public class Prestamo implements Prestable, Identificable {
    private String libro;
    private String usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    @Override
    public void calcularCuota() {
        
    }

    public Prestamo(String libro, String usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    
    
   

}
