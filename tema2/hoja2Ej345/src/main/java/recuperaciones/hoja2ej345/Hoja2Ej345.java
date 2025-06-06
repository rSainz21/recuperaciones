/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej345;

/**
 *
 * @author thero
 */
public class Hoja2Ej345 {

    public static void main(String[] args) {
        String palabra="Roberto es un humano";
        String modificado=cambiarVocales(palabra);
        String media=mediaCadena(palabra);
        String remplazado=remplazar(palabra);
       
        System.out.println("Original: "+palabra);
        System.out.println("Modificado: "+modificado);
        System.out.println("Mitad: "+media);
        
        System.out.println("remplazado: "+remplazado);
    }
    
    public static String cambiarVocales(String texto) {
        return texto.replaceAll("[aeiou]", "o");   
        
    }
    
    public static String mediaCadena(String texto){
        int mitad=texto.length()/2;
        return texto.substring(0, mitad);
    }
    
    public static String remplazar(String texto){
        return texto.replace("es", "no es");
    }
    
    
    
            
        
    
}
