/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package recuperaciones.hoja6;

/**
 *
 * @author thero
 */
public interface Series {

    int inicio = 0;

    int getSiguiente();

    void reiniciar();

    void setComenzar(int x);

    public default void mostrarInicio() {
        System.out.println(inicio);
    }

    public static void nombreInterfaz() {
        System.out.println("Interfaz Series");
    }
}
