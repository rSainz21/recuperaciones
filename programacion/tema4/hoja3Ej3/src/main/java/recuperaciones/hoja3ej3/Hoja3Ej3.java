/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja3ej3;

/**
 *
 * @author thero
 */
public class Hoja3Ej3 {

    public static void main(String[] args) {
        Comunidad c = new Comunidad("Cantabria y alrededores", 5);

        System.out.println("\nMostrar: " + c.mostrar());

        System.out.println("Provincia al azar: " + c.sorteo());

        String buscada = "Burgos";
        int posicion = c.buscar(buscada);
        if (posicion != -1) {
            System.out.println("La provincia " + buscada + " está en la posición: " + posicion);
        } else {
            System.out.println("La provincia " + buscada + " no se encuentra.");
        }
    }
}

