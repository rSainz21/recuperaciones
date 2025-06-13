/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.hoja1ej1;



/**
 *
 * @author thero
 */
public class Hoja1Ej1 {

    public static void main(String[] args) {
        int[] miArray = new int[10];

        // Inicializar todas las posiciones a -2 en el momento de la definición (con un for)
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = -2;
        }

        // Mostrar el array
        System.out.println("Array inicializado a -2:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i] + " ");
        }

        // Cambiar todas las posiciones a -1 usando otro for
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = -1;
        }

        // Mostrar el array actualizado
        System.out.println("Array tras poner todo a -1 con FOR:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i] + " ");
        }

        // Rellenar con valores aleatorios (entre 0 y 99)
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = (int)(Math.random() * 100);
        }

        // Mostrar el array con valores aleatorios
        System.out.println("\n\nArray con valores aleatorios:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i] + " ");
        }

        System.out.println(); // Salto final
    }
}

