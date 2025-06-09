/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2hoja3tema4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Curso {
    private String nombreCurso;
    private String[] nombreAlumnos;
    
    public Curso(int numAlumnos){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre del curso: ");
        nombreCurso = teclado.nextLine();
        nombreAlumnos = new String[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
            nombreAlumnos[i] = teclado.nextLine();
        }
    }
    public void iniciales() {
        for (String nombre : nombreAlumnos) {
            System.out.print(nombre.charAt(0) + ". ");
        }
        
    }
    public void desplaza(){
        
    }
    public String verNombre(int posicion) {
        if (posicion > 0 && posicion <= nombreAlumnos.length) {
            return nombreAlumnos[posicion - 1];
        } else {
            return "Posición invalida";
        }
    }
    public  boolean esDaw(){
        if(nombreCurso.contains("DAW")){
            return true;
        }else{
            return false;
        }
        
        
    }


    
}
