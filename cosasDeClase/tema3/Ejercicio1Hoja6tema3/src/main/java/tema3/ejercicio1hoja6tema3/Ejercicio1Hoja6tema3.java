/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio1hoja6tema3;

/**
 *
 * @author dam1
 */
public class Ejercicio1Hoja6tema3 {

    public static void main(String[] args) {
        Tarjeta tarjeta1= new Tarjeta("Rober Sainz", "1234567812345678", 1000 );
        System.out.println(tarjeta1.getNombreTitular());
        System.out.println(tarjeta1.getNumeroCuenta());
        System.out.println(tarjeta1.getPin());
        System.out.println(tarjeta1.getEstado());
        System.out.println(tarjeta1.getSaldo());
        tarjeta1.desbloquear(tarjeta1.getPin());
        tarjeta1.pagar(100, tarjeta1.getPin(), "calcetines,si,no,hola", false);
        
        
        
    }
}
