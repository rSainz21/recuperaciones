/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej3;

/**
 *
 * @author thero
 */
public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(String id, double base, double altura) {
        super(id);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triángulo con base " + base + " y altura " + altura;
    }
}
