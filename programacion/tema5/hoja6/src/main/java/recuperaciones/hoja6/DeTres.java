/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6;

/**
 *
 * @author thero
 */
public class DeTres implements Series {

    private int valor;

    public DeTres() {
        this.valor = inicio;
    }

    @Override
    public int getSiguiente() {
        valor+=3;
        return valor;
        
    }

    @Override
    public void reiniciar() {
        valor=inicio;
    }

    @Override
    public void setComenzar(int x) {
        valor=x;
    }

    @Override
    public void mostrarInicio() {
        System.out.println("inicio: "+inicio);
    }

}
