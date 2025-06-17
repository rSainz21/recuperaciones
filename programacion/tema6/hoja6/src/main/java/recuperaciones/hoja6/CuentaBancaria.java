/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thero
 */
public abstract class CuentaBancaria implements Identificable{
    private Persona titular;
    double saldo;
    private String entidad;
    private String oficina;
    private String cuenta;

    public CuentaBancaria(Persona titular, String ccc) throws IllegalArgumentException {
        this.titular = titular;
        this.entidad = ccc.substring(0, 4);
        this.oficina = ccc.substring(5, 9);
        this.cuenta = ccc.substring(12);
        this.saldo = 0.0;
    }
    
    public abstract void ingresar(double cantidad);
    public abstract void retirar(double cantidad) throws Exception;

    public Persona getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getEntidad() {
        return entidad;
    }

    public String getOficina() {
        return oficina;
    }

    public String getCuenta() {
        return cuenta;
    }

    public Map<String, String> listaObjeto() {
        Map<String, String> datos = new HashMap<>();
        datos.putAll(titular.listaObjeto());
        datos.put("Entidad", entidad);
        datos.put("Oficina", oficina);
        datos.put("Cuenta", cuenta);
        datos.put("Saldo", String.valueOf(saldo));
        return datos;
    }
}