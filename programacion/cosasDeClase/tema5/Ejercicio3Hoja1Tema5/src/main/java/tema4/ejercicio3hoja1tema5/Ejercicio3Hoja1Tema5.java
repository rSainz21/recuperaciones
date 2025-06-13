/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio3hoja1tema5;

/**
 *
 * @author DAM109
 */
public class Ejercicio3Hoja1Tema5 {

    public static void main(String[] args) {
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);

        // Imprimir el consumo total nada más crear los objetos
        System.out.println("Consumo total inicial: " + AparatoElectrico.consumo() + " watios");

        // Encender la bombilla y la plancha
        bombilla.enciende();
        plancha.enciende();
        System.out.println("Consumo total después de encender la bombilla y la plancha: " + AparatoElectrico.consumo() + " watios");

        // Apagar la bombilla
        bombilla.apaga();
        System.out.println("Consumo total después de apagar la bombilla: " + AparatoElectrico.consumo() + " watios");
    }
}