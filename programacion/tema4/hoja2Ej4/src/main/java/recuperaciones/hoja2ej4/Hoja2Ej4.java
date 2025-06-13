/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej4;

/**
 *
 * @author thero
 */
public class Hoja2Ej4 {

    public static void main(String[] args) {
        Alumno javi=new Alumno("javi");
        System.out.println("La nota mas alta de javi es: "+javi.mayor());
        System.out.println("La nota mas baja de javi es: "+javi.menor());
        System.out.println(javi.mostrar());
    }
}
