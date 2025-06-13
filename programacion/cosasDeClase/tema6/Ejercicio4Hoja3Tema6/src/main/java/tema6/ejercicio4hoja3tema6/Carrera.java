/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio4hoja3tema6;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 *
 * @author DAM109
 */
public class Carrera {
    private LinkedHashSet<Atleta> atletas;

    public Carrera() {
        atletas=new LinkedHashSet<>();
    }
    
    public void annadir(Atleta atleta){
        if (atletas.add(atleta)){
            System.out.println("atleta añadido");
        }else{
            System.out.println("No se pudo añadir atleta");
        }
    }
    public double calculartiempoMedio(){
        double aux =0;
        for(Atleta atleta: atletas){
            aux+= atleta.getTiempo();
        }
        return aux/atletas.size();
    }
    
    public void darLaVuelta(){
        LinkedList<Atleta> pila=new LinkedList<>();
        pila.addAll(atletas);
        atletas.clear();
        while(!pila.isEmpty()){
            atletas.add(pila.pollLast());
        }
    }
    public String mostrar(){
        String cadena="";
        for(Atleta atleta:atletas){
            cadena+=atleta.toString()+"\n";
        }
        return cadena;
    }
}
