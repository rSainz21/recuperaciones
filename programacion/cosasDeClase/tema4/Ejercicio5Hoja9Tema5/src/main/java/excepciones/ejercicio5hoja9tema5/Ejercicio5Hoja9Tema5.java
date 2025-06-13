/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package excepciones.ejercicio5hoja9tema5;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author DAM109
 */
public class Ejercicio5Hoja9Tema5 {

    public static void main(String[] args) {
        int numero;
        int intentos=0;
        int secreto=(int)(Math.random()*500)+1;
        boolean salir=false;
        System.out.println("El objetivo es introducir numeros entre 1 y 500 hasta que aciertes");
        while(!salir){
            try {
                System.out.println("Introduce un numero: ");
                numero=new Scanner(System.in).nextInt();
                
                if(numero==secreto ){
                    System.out.println("numero acertado");

                    System.out.println("Has acertado el numero "+numero+" en "+intentos+" intentos");
                    salir=true;
                }else if(numero<1 || numero>500){
                    System.out.println("Vaya gilipollas, ese numero esta fuera de rango");
                }else if(numero<secreto){
                    System.out.println("Introduce un numero mayor bro");
                }else if(numero>secreto){
                    System.out.println("Introduce un numero mas pequeño hermano");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe ser un numero entero");
                
            }finally{
                intentos++;
            }
        }
        
    }
}
