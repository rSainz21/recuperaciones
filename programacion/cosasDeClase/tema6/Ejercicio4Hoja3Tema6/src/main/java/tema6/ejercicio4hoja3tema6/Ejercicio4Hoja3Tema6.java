/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio4hoja3tema6;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Ejercicio4Hoja3Tema6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrera carrera = new Carrera();
        int opcion;

        do {
            System.out.println("\nMENU:");
            System.out.println("1.- Añadir un atleta");
            System.out.println("2.- Tiempo medio");
            System.out.println("3.- Dar la vuelta");
            System.out.println("4.- Salir");
            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debes introducir un número entre 1 y 4.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    Atleta nuevo = new Atleta(3,"rober",4.6);
                    
                        System.out.println("Atleta añadido correctamente.");
                   
                case 2:
                    double media = carrera.calculartiempoMedio();
                    if (media == 0) {
                        System.out.println("No hay atletas para calcular el tiempo medio.");
                    } else {
                        System.out.printf("Tiempo medio: %.2f segundos\n", media);
                    }
                    break;
                case 3:
                    carrera.darLaVuelta();
                    System.out.println("Colección dada la vuelta.");
                    System.out.println("Atletas en orden invertido:");
                    carrera.mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 4);
    }
}