/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej2;

/**
 *
 * @author thero
 */
public class EnPromocion extends Articulo {
    private double descuento; // En porcentaje

    public EnPromocion(String codigo, String descripcion, double precio, double descuento) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioConDescuento() {
        return getPrecio() * (1 - descuento / 100);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio final: " + getPrecioConDescuento() + " €");
    }
}
