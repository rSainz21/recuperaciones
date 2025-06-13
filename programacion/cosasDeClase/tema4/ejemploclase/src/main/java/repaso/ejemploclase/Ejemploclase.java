/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package repaso.ejemploclase;

/**
 *
 * @author DAM109
 */
public class Ejemploclase {

    public static void main(String[] args) {
        Libro l1=new Libro("hola","miguel");
        Libro l2=new Libro("adios","rober");
        Libro l3=new Libro("hola","martin");
        Libro l4=new Libro("yeaaa","carmen");
        Libro l5=new Libro("adios","alejandro");
        Biblioteca biblioteca=new Biblioteca("yes","carmen",4);
        if (biblioteca.agregarLibro(l1)){
            System.out.println("Libro uno se añadio");
        }else{
            System.out.println("No se añadio el libro");
        }
        if (biblioteca.agregarLibro(l2)){
            System.out.println("Libro uno se añadio");
        }else{
            System.out.println("No se añadio el libro");
        }
        if (biblioteca.agregarLibro(l3)){
            System.out.println("Libro uno se añadio");
        }else{
            System.out.println("No se añadio el libro");
        }
        if (biblioteca.agregarLibro(l4)){
            System.out.println("Libro uno se añadio");
        }else{
            System.out.println("No se añadio el libro");
        }
        if (biblioteca.agregarLibro(l5)){
            System.out.println("Libro uno se añadio");
        }else{
            System.out.println("No se añadio el libro");
        }
        
    }
}
