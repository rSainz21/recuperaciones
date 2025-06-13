/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja1;

/**
 *
 * @author thero
 */
public class CajaAhorro {

    private int saldo;
    private int transacciones;
    
    public CajaAhorro() {
        this.saldo=0;
        this.transacciones=0;
    }

    public CajaAhorro(int saldo) {
        this.saldo = saldo;
        this.transacciones=1;
    }

    public void depositar(int cantidad) {
        this.saldo += cantidad;
        transacciones++;
    }
    public void girar(int cantidad){
        this.saldo-=cantidad;
        transacciones++;
    }
    public int obtenerSaldo(){
        return saldo;
    }
    public int obtenerTransacciones(){
        return transacciones;
    }

    
    
    
}
