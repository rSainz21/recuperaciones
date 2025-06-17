/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3hoja3tema6;

/**
 *
 * @author DAM109
 */
public class Cliente {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private double saldo;

    public Cliente(String codigo, String nombre, String apellidos, String telefono, double saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo; 
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo; 
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

    public String getTelefono() {
        return telefono; 
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono; 
    }

    public double getSaldo() {
        return saldo; 
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo; 
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "codigo='" + codigo + '\'' +
               ", nombre='" + nombre + '\'' +
               ", apellidos='" + apellidos + '\'' +
               ", telefono='" + telefono + '\'' +
               ", saldo=" + saldo +
               '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente otro = (Cliente) obj;
        return codigo.equals(otro.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}