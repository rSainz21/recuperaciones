/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen6.examentema6;

import java.util.Objects;

/**
 *
 * @author DAM1
 */
public class Novela extends Libro implements Identificable {
    private String genero;

    public Novela(String isbn, String titulo, int numLibros, String genero) {
        super(isbn, titulo, numLibros);
        this.genero=genero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.genero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Novela other = (Novela) obj;
        return Objects.equals(this.genero, other.genero);
    }
    
    
}
