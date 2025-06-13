/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM109
 */
public class MetodoAux {
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion < 0 || posicion >= cadena.length()) {
            throw new Exception("Posición fuera de rango: " + posicion);
        }
        return cadena.charAt(posicion);
    }
}
