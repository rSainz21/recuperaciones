/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja5;

/**
 *
 * @author thero
 */
public class Hoja5 {

    public static void main(String[] args) {
        Restaurante dominos=new Restaurante(0,3.2);
        System.out.println(dominos);
        
        dominos.addChorizo(1);
        System.out.println(dominos);
        System.out.println(dominos.getNumPlatos());
        dominos.sirvePlato();
        
    }
}
