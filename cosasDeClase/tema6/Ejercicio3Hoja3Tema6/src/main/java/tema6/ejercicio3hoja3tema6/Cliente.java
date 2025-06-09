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
    private int codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private double saldo;

    public Cliente(int codigo, String nombre, String apellidos, String telefono, double saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Apellidos: " + apellidos +
               ", Teléfono: " + telefono + ", Saldo: " + saldo;
    }
}

