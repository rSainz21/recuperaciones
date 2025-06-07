/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6;

/**
 *
 * @author thero
 */
public class Taller {
    private int ruedas;
    private int litrosAceite;
    private int cambiosParciales;
    private int cambiosTotales;

    public Taller(int ruedas, int bidones) {
        this.ruedas = ruedas;
        this.litrosAceite=bidones*5;
        this.cambiosParciales=0;
        this.cambiosTotales=0;
    }
    
    public void addAceite(int masBidones){
        this.litrosAceite+=(masBidones*5);
    }
    public void addRuedas(int masRuedas){
        this.ruedas+=masRuedas;
    }
    
    public int getCambiosParciales(){
        int cambioRuedasP=ruedas/2;
        int cambioAceiteP=litrosAceite/3;
        return Math.min(cambioRuedasP, cambioAceiteP);
    }
    public int getCambiosTotales(){
        int cambioRuedasT=ruedas/4;
        int cambioAceiteT=litrosAceite/3;
        return Math.min(cambioRuedasT, cambioAceiteT);
    }
    
    public void cambioCompleto(){
        if(getCambiosTotales()>0){
            this.ruedas-=4;
            this.litrosAceite-=3;
            this.cambiosTotales++;
            System.out.println("Se ha hecho un cambio completo");
        }else{
            System.out.println("No se a podido hacer el cambio, no hay suficientes materiales");
        }
    }
    public void cambioParcial(){
        if(getCambiosParciales()>0){
            this.ruedas-=2;
            this.litrosAceite-=3;
            this.cambiosParciales++;
            System.out.println("Se ha hecho un cambio Parcial");
        }else{
            System.out.println("No se a podido hacer el parcial, no hay suficientes materiales");
        }
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    @Override
    public String toString() {
        return "Taller{" + "ruedas=" + ruedas + ", litrosAceite=" + litrosAceite + ", cambiosParciales=" + cambiosParciales + ", cambiosTotales=" + cambiosTotales + '}';
    }
    
    
}
