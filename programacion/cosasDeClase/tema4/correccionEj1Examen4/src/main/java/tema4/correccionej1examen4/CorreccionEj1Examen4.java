/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.correccionej1examen4;
import java.util.Scanner;
/**
 *
 * @author DAM109
 */
public class CorreccionEj1Examen4 {

    public static void main(String[] args) {
        OperacionesVector operacion=new OperacionesVector();
        boolean salir=false;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        
        do
        {  
        System.out.println("Menu de opciones: ");
        System.out.println("1. Mostrar vector");
        System.out.println("2. Encontrar numero primo");
        System.out.println("3. Invertir vector");
        System.out.println("4. Divisores");
        System.out.println("5. Salir");
        opcion=scanner.nextInt();
        switch(opcion){
            case 1-> operacion.mostrar();
            
            case 2-> operacion.encontrarPrimo();
            case 3-> operacion.invertirVector();
            //case 4-> operacion.divisores();
          
        }
        
            
        }while(salir=true);
        
        
        
            
        
        
        

            
          
    }
}