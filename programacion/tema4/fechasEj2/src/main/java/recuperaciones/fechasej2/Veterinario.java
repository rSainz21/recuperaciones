/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.fechasej2;

/**
 *
 * @author thero
 */
public class Veterinario {
    private Mascota[] mascotas;
    private int contador;

    public Veterinario() {
        this.mascotas = new Mascota[100];
        this.contador = 0;
    }
    
    public void anadir(Mascota m){
        if (contador<mascotas.length) {
            mascotas[contador]=m;
            contador++;
        }else{
            System.out.println("No caben mas mascotas");
        }
    }
    
    public String mostrar(){
        String lista = "Lista de mascotas\n";
        for (int i = 0; i < contador; i++) {
            lista+=mascotas[i].toString()+"\n";
        }
        return lista;
    }
    
    public String mostrarMayores(){
        String listaM = "Lista de mascotas mayores\n";
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].getEdad()>5) {
                listaM+=mascotas[i].toString()+"\n";
            }
        }
        return listaM;
    }
    
    
}
