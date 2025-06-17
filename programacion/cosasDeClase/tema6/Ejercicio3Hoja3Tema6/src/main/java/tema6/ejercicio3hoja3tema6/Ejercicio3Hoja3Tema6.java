/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio3hoja3tema6;

/**
 *
 * @author DAM109
 */
public class Ejercicio3Hoja3Tema6 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.ingresarCliente(new Cliente("001", "Juan", "Pérez", "123456789", 1500.50));
        banco.ingresarCliente(new Cliente("002", "Ana", "Gómez", "987654321", 2500));
        banco.ingresarCliente(new Cliente("003", "Luis", "Martínez", "555555555", 1200));

        System.out.println("Cliente con saldo mayor:");
        System.out.println(banco.clienteConSaldoMayor());

        System.out.println("\nBuscar cliente código 002:");
        System.out.println(banco.buscarCliente("002"));

        System.out.println("\nEliminar cliente código 001:");
        banco.eliminarCliente("001");

        System.out.println("\nListado clientes:");
        banco.mostrarClientes();
    }
}