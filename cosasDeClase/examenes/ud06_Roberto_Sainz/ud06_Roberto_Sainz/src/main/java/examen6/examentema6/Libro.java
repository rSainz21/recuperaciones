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
public class Libro implements Identificable {
    private String isbn;
    private String titulo;
    private int numLibros;

    public Libro(String isbn, String titulo, int numLibros) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numLibros = numLibros;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumLibros() {
        return numLibros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.isbn);
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    
}
