/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3hoja3tema6;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author DAM109
 */
public class Banco {
    private Set<Cliente> clientes;

    public Banco() {
        clientes = new LinkedHashSet<>(); // No permite duplicados, mantiene orden inserción
    }

    public boolean ingresarCliente(Cliente c) {
        return clientes.add(c); // Devuelve false si ya existía un cliente con ese código
    }

    public Cliente buscarCliente(String codigo) {
        for (Cliente c : clientes) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarCliente(String codigo) {
        Cliente c = buscarCliente(codigo);
        if (c != null) {
            return clientes.remove(c);
        }
        return false;
    }

    public Cliente clienteConSaldoMayor() {
        Cliente mayor = null;
        for (Cliente c : clientes) {
            if (mayor == null || c.getSaldo() > mayor.getSaldo()) {
                mayor = c;
            }
        }
        return mayor;
    }

    public void mostrarClientes() {
        clientes.forEach(System.out::println);
    }
}
