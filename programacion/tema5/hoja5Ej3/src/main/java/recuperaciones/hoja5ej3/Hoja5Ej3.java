/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja5ej3;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Hoja5Ej3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño de la agenda:");
        int tamano=sc.nextInt();
        sc.nextLine();
        Agenda contactos=new Agenda(tamano);
        int opcion;
        
        do {        
            System.out.println("---Menu---");
            System.out.println("1.Agregar nuevo contacto");
            System.out.println("2.Mostrar agenda");
            System.out.println("3.Buscar contacto");
            System.out.println("4.Ver numero de contactos en la agenda");
            System.out.println("5.Modificar un telefono");
            System.out.println("6.Salir");
            opcion=sc.nextInt();
            sc.nextLine(); // LIMPIAR buffer después de nextInt()2
            
            switch (opcion) {
                case 1->{
                    contactos.insertar();
                }
                case 2->{
                    contactos.mostrar();
                }
                case 3->{
                    System.out.println("Introduce el nombre del contacto que buscas:");
                    String nombreBuscar=sc.nextLine();
                    contactos.buscar(nombreBuscar);
                }       
                case 4->{
                    contactos.getNumContactos();
                }
                case 5->{
                    System.out.println("Introduce el nombre del contacto que quieres modificar");
                    String nombreModificar=sc.nextLine();
                    contactos.modificar(nombreModificar);
                }
                case 6->{
                    System.out.println("Saliendo...");
                }
                default->{
                    System.out.println("Valor invalido, prueba con otro");
                }
            }
            
        } while (opcion!=6);
    }
}
