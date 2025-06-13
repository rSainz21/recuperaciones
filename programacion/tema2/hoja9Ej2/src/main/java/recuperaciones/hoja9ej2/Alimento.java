/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja9ej2;

/**
 *
 * @author thero
 */
public class Alimento {

    String nombre;
    int grasas;
    int hidratos;
    boolean origenAnimal;

    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getHidratos() {
        return hidratos;
    }

    public boolean isOrigenAnimal() {
        return origenAnimal;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", grasas=" + grasas + ", hidratos=" + hidratos + ", origenAnimal=" + origenAnimal + '}';
    }

    public boolean esDietetico() {
        boolean dietetico;
        if (grasas < 12 && origenAnimal == true) {
            dietetico = true;
            System.out.println("Es saludable para dieta");
        } else {
            dietetico = false;
            System.out.println("Engorda, no vale para dieta");
        }
        return dietetico;
    }

    public void calorias(int gramos) {
        double calorias = (gramos * (grasas * 5.3 + hidratos * 2.1));
        System.out.println("Tiene: "+calorias+" calorias");
    }
}
