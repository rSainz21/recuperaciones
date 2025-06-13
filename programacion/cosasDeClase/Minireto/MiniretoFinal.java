/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aplicacion.miniretofinal;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class MiniretoFinal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Arrays para almacenar objetos
        Usuario[] usuarios = new Usuario[10];
        Reto[] reto = new Reto[10];
        int contadorUsuarios = 0, contadorRetos = 0;

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Crear usuarios");
            System.out.println("2. Registrar retos");
            System.out.println("3. Realizar retos");
            System.out.println("4. Valorar retos");
            System.out.println("5. Ver un reto con sus waypoints");
            System.out.println("6. Ver los retos de un usuario");
            System.out.println("7. Ver las valoraciones de un reto");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> {//roberto
                    // Crear usuario
                    System.out.print("Introduce el correo: ");
                    String correo = scanner.nextLine();
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce los apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Introduce la fecha de nacimiento(DD-MM-AAA): ");
                    String fechaNacimiento = scanner.nextLine();
                    System.out.print("¿Recibir notificaciones? (true/false): ");
                    boolean recibirNotificaciones = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Introduce tu telefono: ");
                    String telefono = scanner.nextLine();
                    if (telefono.isEmpty()) {
                        telefono = null;
                    }
                    System.out.println("Introduce tu genero: ");
                    String genero = scanner.nextLine();
                    if (genero.isEmpty()) {
                        genero = null;
                    }
                    System.out.println("Introduce tu provincia: ");
                    String provincia = scanner.nextLine();
                    if (provincia.isEmpty()) {
                        provincia = null;
                    }
                    
                    

                    usuarios[contadorUsuarios] = new Usuario(correo, nombre, apellidos, fechaNacimiento, recibirNotificaciones, telefono, genero, provincia);
                    contadorUsuarios++;
                }

                case 2 -> {//roberto
                    // Registrar reto
                    System.out.print("Introduce el nombre del reto: ");
                    String tituloReto = scanner.nextLine();
                    System.out.print("Introduce la descripción del reto: ");
                    String descripcionReto = scanner.nextLine();
                    reto[contadorRetos] = new Reto(tituloReto, descripcionReto);
                    contadorRetos++;
                }

                case 3 -> {//rubén
                    System.out.println("Selecciona el usuario (por correo): ");
                    String correoElectronico = scanner.nextLine();
                    Usuario usuarioEncontrado = null;
                    for (int i = 0; i < contadorUsuarios; i++) {
                        if (usuarios[i].getCorreo().equals(correoElectronico)) {
                            usuarioEncontrado = usuarios[i];
                        }
                        System.out.println("Introduce los datos del usuario:");
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();  // Limpiar el buffer de la entrada después de leer un número

                        // Pedir al usuario los datos del reto (descripción y dificultad)
                        System.out.println("\nIntroduce los datos del reto:");
                        System.out.print("Descripción del reto: ");
                        String descripcionReto = scanner.nextLine();
                        System.out.print("Dificultad del reto (FACIL,NORMAL,DIFICIL,MUYDIFICIL,EXTREMA): ");
                        String dificultadReto = scanner.nextLine();

                        // Pedir los datos de la fecha y hora de inicio y fin del reto
                        System.out.println("\nIntroduce la fecha y hora del reto:");
                        System.out.print("Fecha y hora de inicio (formato: yyyy-MM-dd HH:mm): ");
                        String fechaHoraInicioString = scanner.nextLine();
                        LocalDateTime fechaHoraInicio = LocalDateTime.parse(fechaHoraInicioString.replace(" ", "T"));

                        System.out.print("Fecha y hora de fin (formato: yyyy-MM-dd HH:mm): ");
                        String fechaHoraFinString = scanner.nextLine();
                        LocalDateTime fechaHoraFin = LocalDateTime.parse(fechaHoraFinString.replace(" ", "T"));

                        // Pedir los datos de tiempo en movimiento, velocidad media y comentario
                        System.out.print("\nTiempo en movimiento (en minutos): ");
                        double tiempoEnMovimiento = scanner.nextDouble();

                        System.out.print("Velocidad media (en km/h): ");
                        double velocidadMedia = scanner.nextDouble();
                        scanner.nextLine();  // Limpiar el buffer

                        System.out.print("Comentario: ");
                        String comentario = scanner.nextLine();

                        

                        // Obtener y mostrar todos los retos realizados
                        System.out.println("\nRetos realizados:");
                        RetoRealizado[] retosRealizados = RetoRealizado.obtenerRetosRealizados();
                        for (RetoRealizado r : retosRealizados) {
                            System.out.println("Usuario: " + r.getUsuario().getNombre());

                            System.out.println("Fecha y hora inicio: " + r.getFechaHoraInicio());
                            System.out.println("Fecha y hora fin: " + r.getFechaHoraFin());
                            System.out.println("Tiempo en movimiento: " + r.getTiempoEnMovimiento() + " minutos");
                            System.out.println("Velocidad media: " + r.getVelocidadMedia() + " km/h");
                            System.out.println("Comentario: " + r.getComentario());
                            System.out.println("----");
                        }

                    }
                }

                case 4 -> {//roberto
                    // Valorar reto
                    System.out.println("Selecciona el usuario (por correo): ");
                    String correo = scanner.nextLine();
                    Usuario usuarioEncontrado = null;
                    for (int i = 0; i < contadorUsuarios; i++) {
                        if (usuarios[i].getCorreo().equals(correo)) {
                            usuarioEncontrado = usuarios[i];

                        }
                    }

                    if (usuarioEncontrado == null) {
                        System.out.println("Usuario no encontrado.");

                    }

                    System.out.println("Selecciona el reto para valorar (por nombre): ");
                    String nombreReto = scanner.nextLine();
                    Reto retoEncontrado = null;
                    for (int i = 0; i < contadorRetos; i++) {
                        if (reto[i].getNombre().equals(nombreReto)) {
                            retoEncontrado = reto[i];

                        }
                    }

                    if (retoEncontrado == null) {
                        System.out.println("Reto no encontrado.");

                    }

                    System.out.print("Introduce la puntuación (1-5): ");
                    int puntuacion = Integer.parseInt(scanner.nextLine());
                    System.out.print("Introduce un comentario: ");
                    String comentario = scanner.nextLine();

                    Valoracion valoracion = new Valoracion(puntuacion, comentario);
                    retoEncontrado.agregarValoracion(valoracion);
                    System.out.println("Valoración registrada correctamente.");

                }

                case 5 -> {//maya
                    System.out.println("Introduce el nombre del reto: ");
                    String nomReto = scanner.nextLine();

                    boolean salir = false;
                    for (int i = 0; i < reto.length && salir == false; i++) {
                        if (nomReto == reto[i].getNombre()) {
                            System.out.println(reto.toString());
                            salir = true;
                        } else {
                            System.out.println("No existe el reto");
                        }

                    }

                }

                case 6 -> {//maya
                    System.out.println("Introduce el nombre de usuario: ");

                    String nomUsuario = scanner.nextLine();
                    boolean salir = false;
                    for (int i = 0; i < usuarios.length && salir == false; i++) {
                        if (nomUsuario == usuarios[i].getNombre()) {

                        }

                    }
                }

                case 7 -> {//maya
                    System.out.println("Introduce el nombre del reto");

                }

                case 8 -> {//roberto
                    // Salir
                    System.out.println("¡Hasta luego!");
                    return;
                }

                default ->
                    System.out.println("Opción no válida.");
            }

        }
    }
}
