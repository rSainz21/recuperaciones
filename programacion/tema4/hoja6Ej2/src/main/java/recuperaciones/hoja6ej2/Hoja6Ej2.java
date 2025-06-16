/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja6ej2;

/**
 *
 * @author thero
 */
public class Hoja6Ej2 {

    public static void main(String[] args) {
        Tabla t1=new Tabla();
        t1.mostrar();
        System.out.println("El mayor de la fila es "+t1.mayorF(2));
        System.out.println("El mayor de la columna es "+t1.mayorC(3));
        System.out.println(t1.media());
    }
}
