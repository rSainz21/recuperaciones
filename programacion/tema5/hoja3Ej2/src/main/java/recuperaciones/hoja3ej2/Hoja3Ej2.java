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
        System.out.println("== CREANDO ALUMNO ==");
        Alumno a = new Alumno(3);
        System.out.println(a.mostrar());

        System.out.println("\n== CREANDO PROFESOR ==");
        Profesor p = new Profesor(2);
        System.out.println(p.mostrar());
    }
}