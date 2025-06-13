/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja1ej1;

import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Calculo {
    private Scanner scanner;

    public Calculo(Scanner scanner) {
        scanner = new Scanner(System.in);
    }
    
    public void metodo1(){
        System.out.println("Introduce un numero por teclado");
        int numero=scanner.nextInt();
        if(numero>100 && numero<1000){
            System.out.println("EWsta comprendido");
        }else{
            System.out.println("vaya mierda");
        }
    }
    
    public void metodo2(){
        System.out.println("Introduce un numero por teclado");
        int numero=scanner.nextInt();
        if(numero>0){
            System.out.println("positivo");
        }else if(numero<0){
            System.out.println("negativo");
        }else{
            System.out.println("mierdon es nulo");
        }
    }
    
    public void metodo3(){
        System.out.println("Introduce un numero por teclado");
        int numero=scanner.nextInt();
        if(numero%2==0 && numero%5==0){
            System.out.println("divisible atope");
        }else{
            System.out.println("mierdon");
        }
    }
    public void metodo5(){
        System.out.println("Introduce un numero por teclado");
        int numero=scanner.nextInt();
        if ((numero % 4 == 0 && numero % 100 != 0) || (numero % 400 == 0)) {
            System.out.println("divisible atope y bisiesyo");
        }else{
            System.out.println("no");
        }
            
        
        
    
    }
}
