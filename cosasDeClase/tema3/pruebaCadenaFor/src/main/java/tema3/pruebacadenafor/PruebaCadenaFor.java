/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.pruebacadenafor;

/**
 *
 * @author dam1
 */
public class PruebaCadenaFor {

    public static void main(String[] args) {
        
        String cadena="Hello world";
        boolean salir=false;
        
        for(int i=0;(i<cadena.length()&&!salir);i++){
            if (cadena.charAt(i)=='W'){
                salir=true;
            }else{
                System.out.println(cadena.charAt(i));
            }
         
        }
    }
}

