/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.ejemploclase;

/**
 *
 * @author DAM109
 */
public class Libro implements Comparable<Libro>{
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
  
    @Override
    public int compareTo(Libro libro){
        
        if(this.titulo.equalsIgnoreCase(libro.titulo)){
            return autor.compareTo(libro.autor);
        }else{
            return this.titulo.compareTo(libro.titulo);
            
        }
        
    }

    
    
}
