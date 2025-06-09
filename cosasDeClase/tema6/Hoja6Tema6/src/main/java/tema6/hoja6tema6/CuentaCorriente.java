/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hoja6tema6;

/**
 *
 * @author DAM109
 */
class CuentaCorriente extends CuentaBancaria {
    protected boolean siAutoriza;
    
    public CuentaCorriente(Persona titular, String ccc) {
        super(titular, ccc);
        this.siAutoriza = true;
    }
    
    @Override
    public void ingresar(double cantidad) {
        if (cantidad > 0) saldo += cantidad;
    }
    
    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) saldo -= cantidad;
    }
}