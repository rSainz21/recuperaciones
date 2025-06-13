/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio3hoja3tema6;

/**
 *
 * @author DAM109
 */
public class Banco {
    public void insertar(Persona persona) {
        socios.add(persona);
    }

    public void buscar(String DNI) {
        String aux;
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getDNI().equals(DNI)) {
                aux = socios.toString();
            }

        }

    }
}
