/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hoja6tema6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DAM109
 */
abstract class CuentaBancaria implements Identificable {
    protected Persona titular;
    protected double saldo;
    protected String entidad;
    protected String oficina;
    protected String cuenta;
    
    public CuentaBancaria(Persona titular, String ccc) {
        this.titular = titular;
        String[] partes = ccc.split("-");
        this.entidad = partes[0];
        this.oficina = partes[1];
        this.cuenta = partes[3];
        this.saldo = 0;
    }
    
    public abstract void ingresar(double cantidad);
    public abstract void retirar(double cantidad);
    
    public Map<String, String> listaObjeto() {
        Map<String, String> info = new HashMap<>();
        info.put("Entidad", entidad);
        info.put("Oficina", oficina);
        info.put("Cuenta", cuenta);
        info.put("Saldo", String.valueOf(saldo));
        return info;
    }
}