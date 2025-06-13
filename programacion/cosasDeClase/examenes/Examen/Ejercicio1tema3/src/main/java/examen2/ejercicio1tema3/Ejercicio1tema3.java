/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examen2.ejercicio1tema3;
import java.util.Scanner;
/**
 *
 * @author DAM1
 */
public class Ejercicio1tema3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        MaquinaExpendedora maquina1=new MaquinaExpendedora(1.50,20);
        boolean salir=false;
        String opcion = null ;
        do{
            System.out.println("----- Maquina Expendedora -----");
            System.out.println("a. Comprar Producto");
            System.out.println("b. Ver saldo");
            System.out.println("c. Recargar saldo");
            System.out.println("d. Salir");
        }while(opcion.contains("abc"));
        System.out.println("Selecciona una opcion (a-d): ");
        opcion=teclado.nextLine();
        
            int opciones=1;
            String texto;
            texto=switch(opciones){
            case 'a' ->{
                if()
            }
                    
                    "Comprando producto. :se a restado "+maquina1.getCostoProducto()+"€ a tu saldo.";
            case 2->"Tu saldo actual es de "+maquina1.getSaldo()+"€";
         
            default-> "Opcion no valida. Por favor, seleccione una opcion valida.";
            };
        }
    }

