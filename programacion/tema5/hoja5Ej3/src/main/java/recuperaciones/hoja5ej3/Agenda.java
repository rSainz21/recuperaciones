/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja5ej3;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Agenda {
    private Persona[]personas;
    private int contador;

    public Agenda(int tamaño) {
        personas=new Persona[tamaño];
        this.contador =0;
    }
    
    public void insertar(){
        if (contador>=personas.length) {
            System.out.println("No caben mas personas, agenda llena");
        }else{
            Scanner n=new Scanner(System.in);
            System.out.println("Introduce el nombre:");
            String nombre=n.nextLine();
            System.out.println("Introduce numero de telefono:");
            String telefono=n.nextLine();
            personas[contador]=new Persona(nombre,telefono);
            contador++;
            System.out.println("Persona añadida.");
        }
    }
    
    public void mostrar(){
        if (contador == 0) {
            System.out.println("La agenda está vacía.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(personas[i].toString());
            }
        }
    }
    
    public void buscar(String nombre){
        boolean encontrado=false;
        for (int i = 0; i < contador; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(personas[i].toString());
                encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("La persona no esta en la agenda");
        }   
    }
    
    public void modificar(String nombre){
        Scanner t=new Scanner(System.in);
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Teléfono actual de " + personas[i].getNombre() + ": " + personas[i].getTelefono());
                System.out.print("Introduce el nuevo teléfono: ");
                String nuevoTelefono = t.nextLine();
                personas[i].setTelefono(nuevoTelefono);
                System.out.println("Teléfono actualizado correctamente.");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ninguna persona con ese nombre.");
        }
    }
    
    public void getNumContactos(){
        System.out.println("Hay "+contador+" contactos en la agenda");
    }
    
    
    
    
}
