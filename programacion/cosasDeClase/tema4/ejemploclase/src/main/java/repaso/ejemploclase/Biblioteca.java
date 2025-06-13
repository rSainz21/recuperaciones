/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.ejemploclase;

import java.util.Arrays;

/**
 *
 * @author DAM109
 */
public class Biblioteca extends Libro {
    
    Libro [] libros;
    
    
    public Biblioteca(int numMax){
        
        
 
    }

    public Libro[] getLibros() {
        return libros;
    }
    
    public boolean agregarLibro(Libro libro){
        boolean aux=false ;
        for(int i=0; i<libros.length &&!aux;i++){
            if(libros[i]==null){
                libros[i]=libro;
                aux=true;
            }

        }
        return aux;
    }
    public void ordenarLibros(){
        int numero= -1;
        for(int i=0; i<libros.length && numero==-1;i++){
            if(libros[i]==null){
                numero=i;
            }
        }
        if(numero== -1){
            Arrays.sort(libros);
        }else{
            Arrays.sort(this.libros, 0, numero);
        }
        
    }

}