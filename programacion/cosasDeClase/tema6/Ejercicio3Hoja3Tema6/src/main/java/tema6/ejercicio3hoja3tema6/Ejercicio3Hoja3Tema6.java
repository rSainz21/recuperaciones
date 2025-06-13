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
        
class Cliente {
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

class Banco {
    private Map<Integer, Cliente> usuarios;

    public Banco() {
        usuarios = new LinkedHashMap<>(); // Mantiene el orden de inserción y evita duplicados.
    }

    public void agregarUsuario(Cliente cliente) {
        if (usuarios.containsKey(cliente.getCodigo())) {
            System.out.println("El cliente con este código ya existe.");
        } else {
            usuarios.put(cliente.getCodigo(), cliente);
        }
    }

    public Cliente buscarUsuario(int codigo) {
        return usuarios.getOrDefault(codigo, null);
    }

    public void eliminarUsuario(int codigo) {
        if (usuarios.containsKey(codigo)) {
            usuarios.remove(codigo);
        } else {
            System.out.println("El cliente con este código no existe.");
        }
    }

    public Cliente clienteConSaldoMayor() {
        Optional<Cliente> maxSaldoCliente = usuarios.values().stream()
                .max((c1, c2) -> Double.compare(c1.getSaldo(), c2.getSaldo()));
        return maxSaldoCliente.orElse(null); // Devuelve null si no hay clientes.
    }
}

public