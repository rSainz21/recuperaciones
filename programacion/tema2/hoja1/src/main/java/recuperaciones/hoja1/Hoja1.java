/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja1;

/**
 *
 * @author thero
 */
public class Hoja1 {

    public static void main(String[] args) {
        CajaAhorro n1=new CajaAhorro();
        n1.depositar(500);
        System.out.println(n1.obtenerSaldo());
        n1.girar(200);
        System.out.println(n1.obtenerSaldo());
        System.out.println(n1.obtenerTransacciones());
        CajaAhorro n2=new CajaAhorro(200);
        System.out.println(n2.obtenerSaldo());
        System.out.println(n2.obtenerTransacciones());
    }
}
