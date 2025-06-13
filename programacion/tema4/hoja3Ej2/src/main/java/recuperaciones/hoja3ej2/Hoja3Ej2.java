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
        Curso daw=new Curso("1º de daw",3);
        System.out.println("---INICIALES DE LOS ALUMNOS---");
        daw.iniciales();
        System.out.println("---DESPLAZANDO ALUMNOS UN PUESTO A LA DERECHA---");
        daw.desplaza();
        daw.iniciales();
        System.out.println("Alumno en posicion 2: "+daw.verNombre(2));
        System.out.println("¿Es un curso DAW?: " + daw.esDaw());
        
    }
}
