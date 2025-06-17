/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.hoja6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author thero
 */
public class UtilidadesCuenta {
    
    // Método para validar un código de cuenta cliente (CCC)
    // Devuelve true si el CCC tiene los dígitos de control correctos
    public static boolean validarCuenta(String ccc) {
        try {
            // Extraemos las partes del CCC
            String entidad = ccc.substring(0, 4);
            String oficina = ccc.substring(5, 9);
            String dc = ccc.substring(10, 12);
            String cuenta = ccc.substring(13);
            // Comparamos con el cálculo real de los dígitos de control
            return calcularDigitosControl(entidad, oficina, cuenta).equals(dc);
        } catch (Exception e) {
            // Si hay algún error en la extracción o el cálculo, devolvemos false
            return false;
        }
    }
    
    public static String calcularDigitosControl(String entidad, String oficina, String cuenta) {
        String pesos = "12864359710"; // Pesos por posición según normativa bancaria
        String base1 = "00" + entidad + oficina; // Añadimos dos ceros por delante para la primera parte
        String base2 = cuenta; // La cuenta se usa directamente

        int suma1 = 0, suma2 = 0;
        // Recorremos los dígitos y aplicamos los pesos
        for (int i = 0; i < 10; i++) {
            suma1 += Character.getNumericValue(base1.charAt(i)) * Character.getNumericValue(pesos.charAt(i));
            suma2 += Character.getNumericValue(base2.charAt(i)) * Character.getNumericValue(pesos.charAt(i));
        }

        // Aplicamos el cálculo estándar del dígito de control
        int dc1 = 11 - (suma1 % 11);
        int dc2 = 11 - (suma2 % 11);

        // Ajustamos resultados especiales: si es 10 se pone 1, si es 11 se pone 0
        dc1 = (dc1 == 10) ? 1 : (dc1 == 11) ? 0 : dc1;
        dc2 = (dc2 == 10) ? 1 : (dc2 == 11) ? 0 : dc2;

        return "" + dc1 + dc2;
    }

    // Pide al usuario un tipo de interés entre 0.5 y 8.5 y lo valida
    public static double pedirTipoInteres(Scanner sc) {
        System.out.print("Introduce tipo de interés (0.5 - 8.5): ");
        double interes = sc.nextDouble();
        if (interes < 0.5 || interes > 8.5) throw new IllegalArgumentException("Interés fuera de rango.");
        return interes;
    }

    // Pide al usuario una comisión de mantenimiento entre 0 y 30
    public static double pedirComisionMantenimiento(Scanner sc) {
        System.out.print("Introduce comisión de mantenimiento (0 - 30): ");
        double comision = sc.nextDouble();
        if (comision < 0 || comision > 30) throw new IllegalArgumentException("Comisión fuera de rango.");
        return comision;
    }

    // Pide al usuario un máximo descubierto entre 0 y 50000
    public static double pedirMaximoDescubierto(Scanner sc) {
        System.out.print("Introduce máximo descubierto (0 - 50000): ");
        double descubierto = sc.nextDouble();
        if (descubierto < 0 || descubierto > 50000) throw new IllegalArgumentException("Descubierto fuera de rango.");
        return descubierto;
    }

    // Pide al usuario una fecha con formato "dd-MM-yyyy" y la valida
    public static LocalDate pedirFecha(Scanner sc) {
        System.out.print("Introduce la fecha de nacimiento (dd-MM-yyyy): ");
        String fechaTexto = sc.next();
        try {
            // Convertimos el texto en una fecha usando el formato especificado
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(fechaTexto, formato);
        } catch (DateTimeParseException e) {
            // Si el formato no es válido, lanzamos una excepción
            throw new IllegalArgumentException("Formato de fecha inválido");
        }
    }
}


