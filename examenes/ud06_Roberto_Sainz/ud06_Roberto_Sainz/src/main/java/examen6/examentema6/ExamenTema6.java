/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examen6.examentema6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class ExamenTema6 {

    public static boolean main(String[] args) {
        boolean menu = false;
        boolean menu2 = false;
        Biblioteca bio1 = new Biblioteca();
        MetodosEstaticos.pedirGenero();
        MetodosEstaticos.validarISBN("1234567891011");
        while (!menu) {
            System.out.println("1. Añadir Libro al catalogo");
            System.out.println("2. Registrar un prestamo");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. Salir");
            System.out.println("Introduce una opcion");
            int opciones = new Scanner(System.in).nextInt();

            switch (opciones) {
                case 1 -> {
                    System.out.println("Introduce el titulo");
                    String titulo = new Scanner(System.in).nextLine();
                    System.out.println("Introduce el ISBN");
                    String isbn = new Scanner(System.in).nextLine();
                    MetodosEstaticos.validarISBN("1234567890123");
                    System.out.println("Introduce el tipo de libro");
                    while (!menu2) {
                        System.out.println("Para introducir novela pulse 1");
                        System.out.println("Para introducir ensayo pulse 2");
                        System.out.println("Para volver atras oulse 3");
                        int tipoLibro = new Scanner(System.in).nextInt();
                        switch (tipoLibro) {
                            case 1 -> {
                                MetodosEstaticos.pedirGenero();
                            }
                            case 2 -> {
                                MetodosEstaticos.pedirTema();
                            }
                            case 3 -> {
                                System.out.println("saliendo");
                                menu2=true;
                            }
                            default -> {
                                System.out.println("Opcion incorrecta, ntroduce una de las dos opciones");
                            }

                        }
                        
                    }

                }
                case 2 -> {
                    System.out.println("Introduce los datos del usuario prestado");
                    System.out.println("Nombre:");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Apellidos:");
                    String apellidos = new Scanner(System.in).nextLine();

                    try {
                        System.out.println("introduce una fecha en formato dd-MM-yyyy");
                        String fecha = new Scanner(System.in).nextLine();
                        boolean valido = false;
                        if (fecha.matches("dd-MM-yyyy")) {

                            System.out.println("La fecha es valida");
                            valido = true;
                        } else {
                            System.out.println("La fecha no es valida");
                            valido = false;
                        }

                        return valido;

                    }catch (InputMismatchException e) {
                        System.out.println("Introduce un formato correcto");
                    }
   
                }
                case 7-> {
                    System.out.println("Saliedno");
                    menu=true;
                }

            }

        }
        return false;
        

    }
}
