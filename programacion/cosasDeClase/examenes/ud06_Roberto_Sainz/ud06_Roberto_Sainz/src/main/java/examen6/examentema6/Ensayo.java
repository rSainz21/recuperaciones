/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen6.examentema6;

/**
 *
 * @author DAM1
 */
public class Ensayo extends Libro implements Identificable {
    private String tema;

    public Ensayo(String isbn, String titulo, int numLibros, String tema) {
        super(isbn, titulo, numLibros);
        this.tema=tema;
    }
    
}
