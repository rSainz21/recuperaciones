/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio4hojamaintema4;

/**
 *
 * @author DAM109
 */
public class Ejercicio4HojaMainTema4 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor introduce algo valido");
            System.exit(1);
        }

        int valor1 = Integer.parseInt(args[0]);
        int valor2 = Integer.parseInt(args[1]);

        Operaciones operaciones = new Operaciones(valor1, valor2);
        operaciones.imprimirResultados();
    }
}
