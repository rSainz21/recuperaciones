/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja4ej2;

/**
 *
 * @author thero
 */
public class Hoja4Ej2 {

    public static void main(String[] args) {
        Coche coche1=new Coche("9192HGP");
        Coche coche2=new Coche("2831FVW",100);
        coche1.acelera(80);
        coche1.frenar(90);
        coche1.mostrarLetras();
        System.out.println(coche1);
        
        coche2.acelera(30);
        coche2.mostrarLetras();
        System.out.println(coche2);
        
    }
}
