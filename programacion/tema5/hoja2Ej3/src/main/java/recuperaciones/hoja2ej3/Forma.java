/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja2ej3;

/**
 *
 * @author thero
 */
public abstract class Forma {
    private String id;

    public Forma(String id) {
        this.id = id;
    }

    public void identidad() {
        System.out.println("Identificador: " + id);
    }

    public abstract String toString();
}
