/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej3;

/**
 *
 * @author thero
 */
public class Circulo extends Forma {
    private double radio;

    public Circulo(String id, double radio) {
        super(id);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Círculo con radio " + radio;
    }
}
