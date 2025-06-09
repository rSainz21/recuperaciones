/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hoja6tema6;

/**
 *
 * @author DAM109
 */
class CuentaCorrientePersonal extends CuentaCorriente {
    private double comisionMantenimiento;
    public static final double MIN_COMISION_MANTENIMIENTO = 0;
    public static final double MAX_COMISION_MANTENIMIENTO = 30;
    
    public CuentaCorrientePersonal(Persona titular, String ccc, double comisionMantenimiento) {
        super(titular, ccc);
        this.comisionMantenimiento = comisionMantenimiento;
    }
}