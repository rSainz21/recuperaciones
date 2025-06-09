/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio2hoja5tema3;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Ejercicio2Hoja5tema3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de lineas: ");
        int lineas = teclado.nextInt();
        
        for(int i=1; i <= lineas; i++){
            if(i%2==0){
                for(int j=1; j<=9; j++){
                    System.out.println(j);
                    
                }
            }else{
                for (int j = 9; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println(); 
        }
    }
}
