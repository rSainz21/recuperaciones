/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja1gej1;

/**
 *
 * @author thero
 */
public class Hoja1gEj1 {

    public static void main(String[] args) {
       Contenedor<Integer> c = new Contenedor<Integer>();

        c.insertarAlFinal(5);
        c.insertarAlFinal(8);
        c.insertarAlPrincipio(3);
        c.insertarAlFinal(1);

        System.out.println("Contenido: " + c);

        c.ordenar();
        System.out.println("Ordenado: " + c);

        Integer extraido = c.extraerDelPrincipio();
        System.out.println("Extraído del principio: " + extraido);
        System.out.println("Después de extraer: " + c);
    }
}