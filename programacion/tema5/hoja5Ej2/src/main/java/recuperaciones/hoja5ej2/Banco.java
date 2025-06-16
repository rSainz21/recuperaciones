/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja5ej2;

/**
 *
 * @author thero
 */
public class Banco {
    private Cliente[]clientes;
    private int contador;

    public Banco(int numClientes) {
        clientes=new Cliente[numClientes];
        this.contador=0;
    }
    
    public void ingresarCliente(){
        if (contador>=clientes.length) {
            System.out.println("No caben mas clientes, esta lleno");
        }else{
            Cliente nuevo=new Cliente(contador);
            clientes[contador]=nuevo;
            System.out.println("Cliente ingresado con codigo: "+contador);
            contador++;
        }
    }
    
    public String buscar(int codigo){
        if (codigo >= 0 && codigo < contador && clientes[codigo] != null) {
            return clientes[codigo].toString();
        } else {
            return "Cliente no encontrado.";
        }     
    }
    
    public void eliminarCliente(int codigo) {
        if (codigo >= 0 && codigo < contador && clientes[codigo] != null) {
            clientes[codigo] = null;
            System.out.println("Cliente eliminado.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
    
    public void mostrarClientes() {
        boolean hayClientes = false;
        for (int i = 0; i < contador; i++) {
            if (clientes[i] != null) {
                System.out.println(clientes[i].getInfo());
                hayClientes = true;
            }
        }
        if (!hayClientes) {
            System.out.println("No hay clientes en el banco.");
        }
    }
    
    
}