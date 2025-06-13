/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja9ej2;

/**
 *
 * @author thero
 */
public class Hoja9Ej2 {

    public static void main(String[] args) {
        Alimento leche=new Alimento("leche",15,10,true);
        System.out.println(leche.esDietetico());
        leche.calorias(200);
    }
}
