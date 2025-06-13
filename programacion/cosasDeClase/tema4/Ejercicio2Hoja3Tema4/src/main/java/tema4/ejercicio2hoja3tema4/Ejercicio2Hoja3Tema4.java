/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio2hoja3tema4;

/**
 *
 * @author dam1
 */
public class Ejercicio2Hoja3Tema4 {

    public static void main(String[] args) {
        Curso curso = new Curso(12); // Por ejemplo, un curso con 3 alumnos
        curso.iniciales();
    
        System.out.println("Nombre en la posicion 1: " + curso.verNombre(1));
        System.out.println("¿El curso es DAW? " + curso.esDaw());
    }
}

