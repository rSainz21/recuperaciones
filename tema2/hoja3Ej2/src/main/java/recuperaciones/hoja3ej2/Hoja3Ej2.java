/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja3ej2;

/**
 *
 * @author thero
 */
public class Hoja3Ej2 {

    public static void main(String[] args) {
        Numero n1=new Numero();
        n1.suma(20);
        n1.resta(10);
        System.out.println(n1.getEntero());
        n1.doblar();
        n1.triplicar();
        System.out.println(n1.getEntero());
        n1.setEntero(0);
        System.out.println(n1.getEntero());
    }
}
