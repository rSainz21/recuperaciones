/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.fehcasej1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author thero
 */
public class Letra {

    private int numLetra;
    private String titular;
    private int importe;
    private LocalDate fVencimiento;

    public Letra() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero de Letra:");
        this.numLetra = s.nextInt();
        s.nextLine();
        System.out.println("Introduce el titular:");
        this.titular = s.nextLine();
        System.out.println("Introduce el importe:");
        this.importe = s.nextInt();
        System.out.print("Fecha de vencimiento (AAAA-MM-DD): ");
        String fechaStr = s.next();
        this.fVencimiento = LocalDate.parse(fechaStr);
    }
    
    public boolean vencida(){
        return LocalDate.now().isAfter(fVencimiento);
    }
    
    public void demora(int dias) {
        fVencimiento = fVencimiento.plusDays(dias);
    }

    public long diasFaltan() {
        return ChronoUnit.DAYS.between(LocalDate.now(), fVencimiento);
    }

    public void mostrar() {
        System.out.println("Número: " + numLetra
                + ", Titular: " + titular
                + ", Importe: " + importe
                + ", Vencimiento: " + fVencimiento);
    }

    public int devuelveMes() {
        return fVencimiento.getMonthValue();
    }

    public String getTitular() {
        return titular;
    }
    
    
}
