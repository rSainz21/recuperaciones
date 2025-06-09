/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio3hojamaintema4;

/**
 *
 * @author DAM109
 */
public class Ejercicio3HojaMainTema4 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, introduce un nombre y sueldo correctos ");
            return;
        }

        String nombre = args[0];
        double sueldo = Double.parseDouble(args[1]);

        Empleado empleado = new Empleado(nombre, sueldo);
        empleado.imprimirDatos();
        empleado.verificarImpuestos();
    }
    public static boolean esNumerico(String numerico){
        boolean salida=true;
        for(char c : numerico.toCharArray()){
            if(!Character.isDigit(c) && c !='.'){
                salida=false;
            }
        }
        return salida;
    }
    
}
