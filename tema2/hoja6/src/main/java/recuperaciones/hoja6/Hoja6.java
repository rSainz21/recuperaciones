/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja6;

/**
 *
 * @author thero
 */
public class Hoja6 {

    public static void main(String[] args) {
        Taller dominos=new Taller(6,3);
        System.out.println(dominos.getCambiosTotales());
        dominos.cambioCompleto();
        dominos.cambioParcial();
        dominos.cambioCompleto();
        
        
    }
}
