/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej2;

import java.time.YearMonth;

/**
 *
 * @author thero
 */
public class Perecedero extends Articulo {
    private int mesCaducidad;
    private int anioCaducidad;

    public Perecedero(String codigo, String descripcion, double precio, int mesCaducidad, int anioCaducidad) {
        super(codigo, descripcion, precio);
        this.mesCaducidad=mesCaducidad;
        this.anioCaducidad=anioCaducidad;    
    }
    
    public boolean estaCaducado() {
        YearMonth hoy = YearMonth.now();
        YearMonth caducidad = YearMonth.of(anioCaducidad, mesCaducidad);
        return hoy.isAfter(caducidad);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Caduca en: " + mesCaducidad + "/" + anioCaducidad);
    }
}
    
    

