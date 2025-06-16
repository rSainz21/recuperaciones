/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerreros;

/**
 *
 * @author thero
 */
public class Griego extends Guerrero {
    
    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    @Override
    public boolean retirarse() {
        boolean retirarse;
        if (herido=true) {
            retirarse=true;
        }else{
            retirarse=false;
        }
        return retirarse;
    }
    
}
