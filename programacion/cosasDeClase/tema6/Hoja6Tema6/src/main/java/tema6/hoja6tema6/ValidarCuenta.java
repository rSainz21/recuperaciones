/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hoja6tema6;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class ValidarCuenta {
    public static String ValidarCuenta() throws Exception{
        System.out.println("Introduce el codigo de cuenta corriente");
        String ccc=new Scanner(System.in).nextLine();
        if(!ccc.matches("[0-9][20]")){
            throw new Exception("El codigo de cuenta tiene que tener 20 digitos");
        }
        
    }
    private static int digControl(String ccc){
        int suma=0;
        int[]factores=(1,2,4,8,5,10,9,7,3,6);
        for (int i = 0; i < 10; i++) {
            suma+= Integer.parseInt(String.valueOf(ccc.charAt(i)))*factores[i];
        }
        int num=11-(suma%11);
        if(num==10){
            num=1;
        }else if(num==11){
            num=0;
        }
    }
}
