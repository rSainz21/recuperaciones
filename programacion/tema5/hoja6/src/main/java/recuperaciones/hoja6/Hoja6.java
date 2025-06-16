/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja6;

/**
 *
 * @author thero
 */
public class Hoja6 {

    public static void main(String[] args) {
        DeDos serie = new DeDos();

        // Mostrar el inicio
        serie.mostrarInicio();
        Series.nombreInterfaz();

        // Mostrar algunos valores de la serie
        System.out.println("Siguiente: " + serie.getSiguiente());
        System.out.println("Anterior: " + serie.getAnterior());

        System.out.println("Siguiente: " + serie.getSiguiente());
        System.out.println("Anterior: " + serie.getAnterior());

        // Reiniciar y empezar en 100
        serie.reiniciar();
        System.out.println("Tras reiniciar: " + serie.getSiguiente());

        serie.setComenzar(100);
        System.out.println("Comenzando en 100: " + serie.getSiguiente());
    }
}