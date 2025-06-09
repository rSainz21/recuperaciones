/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio1hoja2tema4;

/**
 *
 * @author dam1
 */
public class Ejercicio1Hoja2Tema4 {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        operacion.mostrarArray();

        operacion.multiplicacion();
        operacion.mostrarArray();

        int sumaPares = operacion.sumaDePosiciones();
        System.out.println("Suma de los elementos en posiciones pares: " + sumaPares);
    }
}
