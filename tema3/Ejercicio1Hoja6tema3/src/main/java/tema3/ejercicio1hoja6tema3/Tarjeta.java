/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1hoja6tema3;
import java.util.Random;
/**
 *
 * @author dam1
 */
public class Tarjeta {
    private String nombreTitular;
    private String numeroCuenta;
    private String pin;
    private boolean estado;
    private double saldo;
    
    public Tarjeta(String nombreTitular, String numeroCuenta, double saldo){
        this.nombreTitular=nombreTitular;
        this.numeroCuenta=numeroCuenta;
        this.pin=generarPinAleatorio();
        this.estado=false;// la tarjetra empieza estando desactivada.
        
    }
    
    public String getNombreTitular(){
        return nombreTitular;
    }
    
    public void setNombreTitular(String nombreTitular){
        this.nombreTitular=nombreTitular;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    
    public String getPin(){
        return pin;
    }
    
    public void setPin(){
        this.pin=pin;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public void desbloquear(String pinUsuario){
        if(this.pin.equals(pinUsuario)){
            this.estado=true;
            System.out.println("Tarjeta desbloqueada");
        }else{
            System.out.println("Numero pin incorrecto");
        }
        
    }
    
    public boolean pagar(double importe, String pinUsuario, String descripcion, boolean propinaOno){
        if(this.estado=false){
            System.out.println("Error la tarjeta esta bloqueada");
        }
        
        if(!this.pin.equals(pinUsuario)){
            System.out.println("Pin incorrecto");
        }
        
        
        if(propinaOno=true){
            importe+= importe*0.05;
        }
        if(this.saldo<importe){
            System.out.println("Saldo insuficiente");
        }
        this.saldo-=importe;
        imprimirTicket(descripcion, importe, propinaOno? importe*0.05:0, importe);
        return true;
        
    }
    
    private void imprimirTicket(String descripcion, double importe, double cargos, double total){
        String numeroCuentaTicket=numeroCuenta.substring(0, 4)+"************";
        String descripcionTicket=descripcion.length()>8? descripcion.substring(0, 8):descripcion;
        
        System.out.println("Ticket de compra:");
        System.out.println("Titular: "+nombreTitular);
        System.out.println("Cuenta: "+numeroCuentaTicket);
        System.out.println("Descripcion: "+descripcionTicket);
        System.out.println("Importe: "+importe);
        System.out.println("Propina "+cargos);
        System.out.println("Total "+total);
    }
    
    private String generarPinAleatorio(){
        Random random = new Random();
        int pinAleatorio = random.nextInt(9999);
        return String.format("%04d",pinAleatorio);
    }
    
    
}
