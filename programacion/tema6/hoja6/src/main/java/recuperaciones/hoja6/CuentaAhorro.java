/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6;

import java.util.Map;

/**
 *
 * @author thero
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tipoInteres;

    public CuentaAhorro(Persona titular, String ccc, double tipoInteres) {
        super(titular, ccc);
        
         if (tipoInteres < 0.5 || tipoInteres > 8.5) {
            throw new IllegalArgumentException("Tipo de interés fuera de rango (0.5 - 8.5)");
        }
         // Asigna el tipo de interés si es válido
        this.tipoInteres = tipoInteres;
    }

    // Método que devuelve un mapa con los datos de la cuenta
    @Override
    public Map<String, String> listaObjeto() {
        // Llama al método del padre para obtener los datos comunes
        Map<String, String> datos = super.listaObjeto();

        // Añade los datos propios de CuentaAhorro
        datos.put("Tipo de interés", String.valueOf(tipoInteres));
        datos.put("Tipo de cuenta", "Cuenta Ahorro");
        return datos;
    }

    @Override
    public void ingresar(double cantidad) {
        // Solo se permite ingresar cantidades positivas
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad inválida");
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0 || cantidad > saldo)
            throw new Exception("Saldo insuficiente o cantidad inválida");
        saldo -= cantidad;
    }
}
