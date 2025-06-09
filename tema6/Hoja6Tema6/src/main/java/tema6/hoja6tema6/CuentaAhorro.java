/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hoja6tema6;

/**
 *
 * @author DAM109
 */
class CuentaAhorro extends CuentaBancaria {
    private double tipoInteres;
    public static final double MIN_TIPO_INTERES = 0.5;
    public static final double MAX_TIPO_INTERES = 8.5;
    
    public CuentaAhorro(Persona titular, String ccc, double tipoInteres) {
        super(titular, ccc);
        this.tipoInteres = tipoInteres;
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