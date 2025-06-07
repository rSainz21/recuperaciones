/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja8ej2;

/**
 *
 * @author thero
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;

    public Libro(String ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean esEspañol(){
        boolean español = false;
        if(ISBN.length()==13){
            
            if(ISBN.substring(3, 5).equals("84")){
                español=true;
                System.out.println("Es español");
            }else{
                español=false;
                System.out.println("No es español");
            }
        }else{
            español=false;
            System.out.println("El ISBN tiene que tener 13 digitos");
        }
        return español;
    }
    public void mostrar(){
        String tituloM=titulo.toUpperCase();
        String autorM="";
        autorM = autorM.concat(autor.charAt(0) + "");
        autorM=(autorM.toUpperCase()).concat(autor.substring(1).toLowerCase());
        System.out.println("El titulo del libro es: "+tituloM+" y el autor es: "+autorM);
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
    
}
