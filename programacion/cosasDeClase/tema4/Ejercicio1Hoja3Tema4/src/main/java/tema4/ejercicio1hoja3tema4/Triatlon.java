/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1hoja3tema4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Triatlon {
    private int dorsal;
    private String  nombre;
    private int[] puntuaciones;
    
    public Triatlon(int dorsal, String nombre, int numPruebas){
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.puntuaciones = new int[numPruebas];
        Scanner teclado= new Scanner(System.in);
        for (int i = 0; i < numPruebas; i++) {
            System.out.print("Introduce la puntuacion de la prueba " + (i + 1) + ": ");
            this.puntuaciones[i] = teclado.nextInt();
        }
    }
    public Triatlon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el dorsal: ");
        this.dorsal = scanner.nextInt();
        System.out.print("Introduce el nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Introduce el número de pruebas: ");
        int numPruebas = scanner.nextInt();
        this.puntuaciones = new int[numPruebas];
        for (int i = 0; i < numPruebas; i++) {
            System.out.print("Introduce la puntuación para la prueba " + (i + 1) + ": ");
            this.puntuaciones[i] = scanner.nextInt();
        }
    }
    public double puntuacionMedia() {
        int suma = 0;
        for (int puntuacion : puntuaciones) {
            suma += puntuacion;
        }
        return (double) suma / puntuaciones.length;
    }
    public  boolean esSeleccionado(){
        for (int i = 0; i>puntuaciones.length; i++) {
            if (puntuaciones[i]>10) {
                return true;
            }   
        }
        return false;
    }
    
}
