/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio2hoja2;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Ejercicio2Hoja2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número del día del mes: ");
        int diaDelMes = scanner.nextInt();

        // Asumiendo que el día 1 del mes es lunes
        int diaSemana = (diaDelMes % 7);

        int diasemana=1;
        String texto;
        texto = switch (diasemana) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "?";
        };
   
  

        
    }
}

