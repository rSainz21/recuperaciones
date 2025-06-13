/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio2hoja1tema5;

/**
 *
 * @author DAM109
 */
public class Bombilla {

    private static Estado interruptorGeneral = Estado.OFF;
    private Estado interruptor;

    public Bombilla() {
        this.interruptor = Estado.OFF;
    }

    public void cambiarEstadoBombilla() {
        if (this.interruptor == Estado.ON) {
            this.interruptor = Estado.OFF;
        } else {
            this.interruptor = Estado.ON;
        }
    }

    public static void cambiarEstadoInterruptorGeneral() {
        if (interruptorGeneral == Estado.ON) {
            interruptorGeneral = Estado.OFF;
        } else {
            interruptorGeneral = Estado.ON;
        }
    }

    public boolean estaLuciendo() {
        return interruptorGeneral == Estado.ON && this.interruptor == Estado.ON;
    }

}
