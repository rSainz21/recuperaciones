/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Comunidad {

    private String nombre;
    private String[] provincias;

    public Comunidad(String nombre, int numero) {
        this.nombre = nombre;
        provincias=new String[numero];
        Scanner s=new Scanner(System.in);
        System.out.println("Ingresa el numero de provincias de la comunidad:");
        for (int i = 0; i < provincias.length; i++) {
            System.out.println("Ingresa la provincia numero "+(i+1)+":");
            provincias[i]=s.nextLine();
        }
    }
    
    public String mostrar() {
        String resultado = nombre.toUpperCase() + ": ";

        for (int i = provincias.length - 1; i >= 0; i--) {
            String provincia = provincias[i];
            if (provincia.length() >= 4) {
                resultado += provincia.substring(0, 4) + " ";
            } else {
                resultado += provincia.length() + " ";
            }
        }

        return resultado;
    }
    
    public String sorteo() {
        Random rand = new Random();
        int index = rand.nextInt(provincias.length);
        return provincias[index];
    }
    
     public int buscar(String nombreProvincia) {
        for (int i = 0; i < provincias.length; i++) {
            if (provincias[i].equalsIgnoreCase(nombreProvincia)) {
                return i;
            }
        }
        return -1;
    }
}