/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejerciciobuclesclase;

/**
 *
 * @author dam1
 */
public class Ejerciciobuclesclase {

    public static void main(String[] args) {
       int n;
       int i=1;
       boolean salir=false;
       
       while(salir==false && i<=5){
           n=(int)Math.floor(Math.random()*500)+1;
           System.out.println(n);
           i++;
           salir=(n%7==0);
}
    }
    
}
    
    