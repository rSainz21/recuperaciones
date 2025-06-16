/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej1;

/**
 *
 * @author thero
 */
public class Cono extends Figura {

    public Cono(double radio, double altura) {
        super(radio, altura);
    }
    
    public double getGeneratriz() {
        return Math.sqrt((radio * radio) + (altura * altura));
    }

    @Override
    public double volumen() {
        double generatriz = getGeneratriz();
        return Math.PI * radio * (radio + generatriz);
    }

    @Override
    public double area() {
        return (Math.PI * radio * radio * altura) / 3;
    }
    
}
