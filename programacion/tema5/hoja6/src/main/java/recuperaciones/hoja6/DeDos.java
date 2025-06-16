/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6;

/**
 *
 * @author thero
 */
public class DeDos implements Series {
    private int valor;
    private int anterior;

    public DeDos() {
        this.valor = inicio;
        this.anterior = valor-2;
    }
    
    

    @Override
    public int getSiguiente() {
        anterior=valor;
        valor+=2;
        return valor;
    }

    @Override
    public void reiniciar() {
        valor=inicio;
        anterior=valor-2;
    }

    @Override
    public void setComenzar(int x) {
        valor=x;
        anterior=valor-2;
    }
    
    public int getAnterior(){
        return anterior;
    }
    
}
