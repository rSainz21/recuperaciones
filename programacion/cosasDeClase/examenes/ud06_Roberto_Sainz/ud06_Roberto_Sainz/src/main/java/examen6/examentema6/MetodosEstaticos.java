/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen6.examentema6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author DAM1
 */
public class MetodosEstaticos implements Identificable {
    private static String Genero;
    private static String Tema;
    public static void pedirGenero() {
        try{
            System.out.println("Introduce el genero (DRAMA,FICCION,ROMANCE,TERROR");
            String genero=new Scanner(System.in).next();
            if(genero.equalsIgnoreCase(Genero)){
                System.out.println("El genero es valido");
            }
        }catch(InputMismatchException e){
            System.out.println("Introduce un genero que valga");
            
        }
    }
    
    public static void pedirTema() {
        try{
            System.out.println("Introduce el genero (DRAMA,FICCION,ROMANCE,TERROR");
            String tema=new Scanner(System.in).next();
            if(tema.equalsIgnoreCase(Tema)){
                System.out.println("El tema es valido");
            }
        }catch(InputMismatchException e){
            System.out.println("Introduce un tema que valga");
            
        }
    }

    public static boolean validarISBN(String ISBN) {
        boolean valido = false;
        if (ISBN.matches("[0-9]{13}")) {

            System.out.println("El ISBN es valido");
            valido = true;
        } else {
            System.out.println("El ISBN no es valido");
            valido = false;
        }

        return valido;

    }
    
}


