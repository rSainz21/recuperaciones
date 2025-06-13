/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja3ej3;

/**
 *
 * @author thero
 */
public class Hoja3Ej3 {

    public static void main(String[] args) {
        Satelite s1=new Satelite(4000,10000,20000);
        s1.printPosicion();
        s1.variarAltura(-1000);
        s1.variarPosicion(100, -4500);
        s1.printPosicion();
        System.out.println("Esta el satelite en orbita: "+s1.enOrbita());
    }
}
