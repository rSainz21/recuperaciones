/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja3ej3;

/**
 *
 * @author thero
 */
public class Satelite {

    private int meridiano;
    private int paralelo;
    private int distancia;

    public Satelite() {
        this.meridiano = 0;
        this.paralelo = 0;
        this.distancia = 0;
    }

    public Satelite(int meridiano, int paralelo, int distancia) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia = distancia;
    }
    
    public void printPosicion(){
        System.out.println("El satelite se encuentra en meridiano: "+meridiano+
                ", paralelo: "+paralelo+", distancia a la Tierra: "+distancia);
    }
    
    public void variarAltura(int valor){
        this.distancia+=valor;
    }
    
    public void variarPosicion(int variacionMeridiano, int variacionParalelo){
        this.meridiano+=variacionMeridiano;
        this.paralelo+=variacionParalelo;
    }
    
    public boolean enOrbita(){
        boolean orbita;
        orbita=this.distancia>16000? true:false;
        return orbita;
        
    }

}
