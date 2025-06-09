/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2hoja4tema5;

/**
 *
 * @author DAM109
 */
public class Plantilla {
    private Empleado[] empleados;
    private int contador;
    
    
    // Constructor que crea el array y establece el contador a 0
    public Plantilla(int capacidad) {
        empleados = new Empleado[capacidad];
        contador = 0;
    }

    // Método insertar que recibe un empleado y lo añade al array
    public void insertarEmpleado(Empleado empleado) {
        if (contador < empleados.length) {
            empleados[contador++] = empleado;
        } else {
            System.out.println("La plantilla está llena.");
        }
    }

    // Método que nos devuelve una cadena con información de todos los empleados
    public String informacionEmpleados() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            empleados[i].imprimirDatos();
            info.append("\n");
        }
        return info.toString();
    }

    // Método que nos devuelve el programador que más líneas de código escribe por hora
    public Programador mejorProgramador() {
        Programador mejor = null;
        for (int i = 0; i < contador; i++) {
            if (empleados[i] instanceof Programador) {
                Programador prog = (Programador) empleados[i];
                if (mejor == null || prog.getLineasDeCodigoPorHora() > mejor.getLineasDeCodigoPorHora()) {
                    mejor = prog;
                }
            }
        }
        return mejor;
    }

    // Método que devuelve una cadena con información de todos los empleados “Senior”
    public String informacionSeniors() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            if (empleados[i].clasificacionPorEdad().equals("Senior")) {
                empleados[i].imprimirDatos();
                info.append("\n");
            }
        }
        return info.toString();
    }

    // Método que aumente el sueldo un 20% a todos los programadores “Intermedios” cuyo lenguaje dominante sea “Java”
    public void aumentarSueldoProgramadoresIntermediosJava() {
        for (int i = 0; i < contador; i++) {
            if (empleados[i] instanceof Programador) {
                Programador prog = (Programador) empleados[i];
                if (prog.clasificacionPorEdad().equals("Intermedio") && prog.getLenguajeDominante().equalsIgnoreCase("Java")) {
                    prog.aumentarSalario(20);
                }
            }
        }
    }
}
