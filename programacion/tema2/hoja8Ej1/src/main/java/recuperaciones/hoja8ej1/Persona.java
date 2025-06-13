/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja8ej1;

/**
 *
 * @author thero
 */
public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public String clave() {
        String clave = "";
        clave = clave.concat(nombre.charAt(0) + "");
        clave = clave.concat(apellido1.substring(0, 3));
        clave = clave.concat(apellido2.charAt(apellido2.length() - 1) + "");
        return clave;
    }

    public boolean dniValido() {
        if (dni.length() != 9) {
            System.out.println("El dni tiene menos de 9 cifras");
            return false;
        } else {
            String num = dni.substring(0, 8);
            char parteLetra = dni.charAt(8);
            int numero = Integer.parseInt(num);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letraCorrecta = letras.charAt(numero % 23);
            boolean valido = (parteLetra != letraCorrecta) ? false : true;
            System.out.println("bien");
            return valido;
        }
        
    }
}
