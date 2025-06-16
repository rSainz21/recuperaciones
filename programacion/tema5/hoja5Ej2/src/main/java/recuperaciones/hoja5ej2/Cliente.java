/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja5ej2;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Cliente {
    private int codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private double saldo;

    public Cliente(int codigo) {
        this.codigo = codigo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Introduce los apellidos: ");
        this.apellidos = sc.nextLine();
        System.out.print("Introduce el teléfono: ");
        this.telefono = sc.nextLine();
        System.out.print("Introduce el saldo: ");
        this.saldo = sc.nextDouble();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getInfo() {
        return "Código: " + codigo +
               ", Nombre: " + nombre +
               ", Apellidos: " + apellidos +
               ", Teléfono: " + telefono +
               ", Saldo: " + saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }
    
    
}