/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej3;

/**
 *
 * @author thero
 */
public class Hoja2Ej3 {

    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo("F01", 5.0);
        formas[1] = new Cuadrado("F02", 4.0);
        formas[2] = new Triangulo("F03", 6.0, 3.0);
        formas[3] = new Rombo("F04", 5.0, 2.5);

        for (Forma f : formas) {
            f.identidad();
            System.out.println(f.toString());
            System.out.println();
        }
    }
}