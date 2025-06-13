/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion.minireto;
import java.util.Random;
/**
 *
 * @author DAM109
 */
public class Usuario {
    private String correoElectronico;
    private String nombre;
    private String apellidos;
    private String fechaNac;
    private String telefono;
    private String genero;
    private String provincia;
    private boolean recibirNotificaciones;
    
    public Usuario(String correoElectronico, String nombre, String apellidos, String fechaNacimiento, boolean recibirNotificaciones) {
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNacimiento;
        this.recibirNotificaciones = recibirNotificaciones;
    }
    
    public Usuario(String correoElectronico, String nombre, String apellidos, String fechaNac, String telefono, String genero, String provincia, boolean recibirNotificaciones){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.correoElectronico=correoElectronico;
        this.fechaNac=fechaNac;
        this.genero=genero;
        this.provincia=provincia;
        this.telefono=telefono;
        this.recibirNotificaciones=recibirNotificaciones;   
    }   
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNac;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNac = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public boolean isRecibirNotificaciones() {
        return recibirNotificaciones;
    }

    public void setRecibirNotificaciones(boolean recibirNotificaciones) {
        this.recibirNotificaciones = recibirNotificaciones;
    }
    
    @Override
     public String toString() {
        return "Usuario{" +
                "correoElectronico='" + correoElectronico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento='" + fechaNac + '\'' +
                ", telefono='" + telefono + '\'' +
                ", genero='" + genero + '\'' +
                ", provincia='" + provincia + '\'' +
                ", recibirNotificaciones=" + recibirNotificaciones +
                '}';
    }
}


