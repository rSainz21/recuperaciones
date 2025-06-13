/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja9ej1;

/**
 *
 * @author thero
 */
public class Alarma {

    enum EstadoTimbre {
        ENCENDIDO, APAGADO
    }
    private EstadoTimbre timbre;
    private double temperatura;

    public Alarma(double temperatura) {
        this.timbre = EstadoTimbre.APAGADO;
        this.temperatura = temperatura;
    }

    public void comprueba() {
        if (temperatura < 10 || temperatura > 35) {
            this.timbre = EstadoTimbre.ENCENDIDO;
            System.out.println("se a encendido el timbre por la temperatura");
        } else {
            this.timbre = EstadoTimbre.APAGADO;
            System.out.println("el timbre permanece apagado");
        }
    }

    public void normaliza() {
        this.temperatura = 25;
        this.timbre = EstadoTimbre.APAGADO;
        System.out.println("situacion controlada");
    }

    public EstadoTimbre getTimbre() {
        return timbre;
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Temperatura actual: " + temperatura + "º");
        System.out.println("Estado del timbre: " + timbre);
    }

}
