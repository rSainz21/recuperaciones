/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja4ej2;

/**
 *
 * @author thero
 */
public class Coche {
    private String matricula;
    private int velocidad;

    public Coche(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad=0;
    }
    
    public void acelera(int incremento){
        velocidad=(velocidad+incremento>120)? 120:velocidad+incremento;
    }
    
    public void frenar(int decremento){
        velocidad=(velocidad-decremento<0)? 0:velocidad-decremento;
    }
    
    public void mostrarLetras(){
        String letras=matricula.substring(matricula.length()-3);
        System.out.println("Las letras de la matricula son: "+letras);
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", velocidad=" + velocidad + '}';
    }
    
    
    
    
}
