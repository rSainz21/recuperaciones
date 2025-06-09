/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio2hoja1tema5;

/**
 *
 * @author DAM109
 */
public class Ejercicio2Hoja1Tema5 {

    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        Bombilla.cambiarEstadoInterruptorGeneral();
        bombilla1.cambiarEstadoBombilla();
        if (bombilla1.estaLuciendo() == true) {
            System.out.println("La bombilla esta encendida");
        } else {
            System.out.println("La bombilla no esta luciendo");
        }
        Bombilla.cambiarEstadoInterruptorGeneral();
        if (bombilla1.estaLuciendo() == true) {
            System.out.println("La bombilla esta encendida");
        } else {
            System.out.println("La bombilla no esta luciendo");
        }
        Bombilla.cambiarEstadoInterruptorGeneral();
        bombilla1.cambiarEstadoBombilla();
        if (bombilla1.estaLuciendo() == true) {
            System.out.println("La bombilla esta encendida");
        } else {
            System.out.println("La bombilla no esta luciendo");
        }
    }
}
