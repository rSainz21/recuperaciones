/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.ejercicio1hoja10tema5;

/**
 *
 * @author DAM109
 */
public abstract class Guerrero {
    private String nombre;
    private int edad;
    private int fuerza;
    private boolean herido;
    private boolean muerto;

    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        if (comprobarEdad(edad)) {
            this.edad = edad;
        } else {
            this.edad = 25;
        }
        if (comprobarFuerza(fuerza)) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = 5;
        }
        this.herido = false;
        this.muerto = false;
    } 

    public Guerrero() {
        this("guerreroX", 15, 1);
    }

    public Guerrero((Guerrero guerreroX, String nombre) {
        this(nuevoNombre, otroGuerrero.edad, guerrero.fuerza);
        this.herido = .herido;
        this.muerto = .muerto;
    }
    
    
    public String getNombre() {
        return nombre;
    }
 
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }
    static boolean comprobarEdad(int e){
        boolean rangoe = false;
        if(e<=60 && e>=15){
            rangoe=true;
        }else{
            rangoe=false;
        }
        return rangoe;    
    }
    static boolean comprobarFuerza(int f){
        boolean rangof = false;
        if(f<=10 && f>=1){
            rangof=true;
        }else{
            rangof=false;
        }
        return rangof;
        
    }

    
    
    
}