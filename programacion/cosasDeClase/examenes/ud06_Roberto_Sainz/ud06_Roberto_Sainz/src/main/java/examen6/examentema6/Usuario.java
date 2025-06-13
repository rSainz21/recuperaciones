/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen6.examentema6;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author DAM1
 */
public class Usuario implements Identificable {
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaRegistro;

    public Usuario(String nombre, String apellidos, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }
    
}
