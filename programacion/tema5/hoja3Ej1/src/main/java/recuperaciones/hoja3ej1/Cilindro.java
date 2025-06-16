/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej1;

/**
 *
 * @author thero
 */
public class Cilindro extends Figura {

    public Cilindro(double radio, double altura) {
        super(radio, altura);
    }

    @Override
    public double volumen() {
        
        return Math.PI * radio * radio * altura;
        
    }

    @Override
    public double area() {
        
        return 2 * Math.PI * radio * (radio + altura);
        
    }
    
}
