/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1hoja1;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class calculo {
    private Scanner scanner;

        public calculo() {
        scanner = new Scanner(System.in);
    }

    public void metodo1() {
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        if (numero >= 100 && numero <= 1000) {
            System.out.println("El número está comprendido entre 100 y 1000.");
        } else {
            System.out.println("El número no está comprendido entre 100 y 1000.");
        }
    }
    public void metodo2(){
        System.out.println("Introduce un numero: ");
        int numero= scanner.nextInt();
        if (numero>0){
            System.out.println("El numero es positivo.");
        } else if(numero<0){
            System.out.println("El numero es negativo.");
        }else{
            System.out.println("El numero es nulo.");
        }
    }
    
    public void metodo3(){
        System.out.println("Introduce un numero: ");
        int numero=scanner.nextInt();
        if(numero%2==0 && numero%5==0){
            System.out.println("Es divisible entre 5 y 2.");
        }else{
            System.out.println("No es divisible entre 5 y 2.");
        }
    }
    
    public void metodo4(){
        System.out.println("Introduce un numero: ");
        double numero=scanner.nextInt();
        if(numero%1==0){
            System.out.println("No tiene parte fraccionaria.");
        }else{
            System.out.println("Si tiene parte fraccionaria.");
        }
    }
    public void metodo5() {
        System.out.print("Introduce un año entre 1900 y 2100: ");
        int año = scanner.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }
    public void metodo6(){
        System.out.print("Introduce un año entre 1900 y 2100: ");
        int numero = scanner.nextInt();
        if(numero%2==0){
            System.out.println("Es un numero par.");
        }else{
            System.out.println("Es un numero impar.");
        }
    }
    public void metodo7(){
        System.out.print("Introduce un año entre 1900 y 2100: ");
        int numero = scanner.nextInt();
        if (numero>=1 && numero<=10){
        }else if(numero%2==0){
            System.out.println("Es un numero par.");
        }else{
            System.out.println("No es un numero.");
        }
    }
    public void metodo8(){
        System.out.println("Introduce el primer numero: ");
        int numero1= scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2= scanner.nextInt();
        System.out.println("Introduce el tercero numero: ");
        int numero3=scanner.nextInt();
    }
    
    
    


}
