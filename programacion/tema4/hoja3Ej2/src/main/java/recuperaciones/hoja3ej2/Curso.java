/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej2;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Curso {
    private String curso;
    private String[]nombres;

    public Curso(String curso,int n) {
        this.curso=curso;
        nombres = new String[n];
        Scanner t=new Scanner(System.in);
        System.out.println("Introduce los nombres de los alumnos:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Intruduce el nombre nº "+(i+1)+":");
            nombres[i]=t.nextLine();
        }
    }
    
    public void iniciales(){
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i]!=null) {
                System.out.println(nombres[i].charAt(0)+". ");
            }
        }
        System.out.println();
    }
    
    public void desplaza(){
        if (nombres.length>0) {
            String ultimo=nombres[nombres.length-1];
            for (int i = nombres.length-1; i > 0; i--) {
                nombres[i]=nombres[i-1];
            }
            nombres[0]=ultimo;    
        }
    }
    
    public String verNombre(int posicion){
        if (posicion>=1 && posicion<=nombres.length) {
            return nombres[posicion-1];
        }else{
            return "posicion no valida";
        }  
    }
    
    public boolean esDaw(){
        return curso.toUpperCase().contains("DAW");
    }
    
    
}
