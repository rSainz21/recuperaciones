/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja10ej1;

/**
 *
 * @author thero
 */
public abstract class Guerrero {

    protected String nombre;
    protected int edad;
    protected int fuerza;
    protected boolean herido = false;
    protected boolean muerto = false;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    protected static boolean comprobarEdad(int e) {
        return e >= 15 && e <= 60;
    }

    protected static boolean comprobarFuerza(int f) {
        return f >= 1 && f <= 10;
    }

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
        boolean herido = false;
        boolean muerto = false;
    }

    public Guerrero() {
        this("guerreroX",15,1);
    }

    public Guerrero(Guerrero otro,String nuevoNombre) {
        this.nombre = nuevoNombre;
        this.edad = otro.edad;
        this.fuerza = otro.fuerza;
        this.herido = otro.herido;
        this.muerto = otro.muerto;
    }
    
    public abstract boolean retirarse();

}
