/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.fechasej2;

/**
 *
 * @author thero
 */
public class FechasEj2 {

    public static void main(String[] args) {
        Veterinario cartes=new Veterinario();
        Mascota m1 = new Mascota("Luna", 2015, 6, 10);
        Mascota m2 = new Mascota("Toby", 2020, 3, 5);
        Mascota m3 = new Mascota("Max", 2018, 12, 1);
        Mascota m4 = new Mascota("Nina", 2010, 8, 25);
        
        cartes.anadir(m1);
        cartes.anadir(m2);
        cartes.anadir(m3);
        cartes.anadir(m4);
        
        System.out.println("El animal tiene: "+m1.getEdad()+" años");
        System.out.println(cartes.mostrar());
        System.out.println(cartes.mostrarMayores());
        
        
    }
}
