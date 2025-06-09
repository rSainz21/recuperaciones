/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema6.hoja1progbd;

import java.util.Scanner;

/**
 *
 * @author DAM109
 */
public class Hoja1ProgBD {

    public static void main(String[] args) {
        Repositorio<Usuario> repositorio=new UsuarioDAOImp();
        Scanner scanner = new Scanner(System.in);
        UsuarioDAOImp usuarioDAO = new UsuarioDAOImp();
        int opcion;

        do {
            System.out.println("\nGestión de usuarios");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Agregar");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese ID del usuario a actualizar: ");
                    int id = scanner.nextInt();
                    System.out.print("Nuevo username: ");
                    String username = scanner.nextLine();
                    System.out.print("Nueva password: ");
                    String password = scanner.nextLine();
                    System.out.print("Nuevo email: ");
                    String email = scanner.nextLine();
                    repositorio.actualizar(id);
                    
                }
                case 2 -> {
                    System.out.print("Ingrese ID del usuario a eliminar: ");
                    int id = scanner.nextInt();
                    usuarioDAO.eliminar(id);
                }
                case 3 -> {
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    usuarioDAO.agregar(new Usuario(0, username, password, email));
                }
                case 4 ->
                    usuarioDAO.listar().forEach(System.out::println);
                case 5 ->{
                    if(AccesoBaseDatos.getInstance().cerrar()){
                        System.out.println("Saliendo..."); 
                    }
                    System.out.println("error al salir");
                }
                    
                    
                default ->
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

    }
}
