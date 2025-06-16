/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej3;

/**
 *
 * @author thero
 */
public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(String id, double lado) {
        super(id);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado con lado " + lado;
    }
}
