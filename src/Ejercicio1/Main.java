package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        GestionUsuarios gestion = new GestionUsuarios(); // Usamos la clase que hiciste

        // Agregamos usuarios de prueba
        gestion.registrarUsuarios("Ana", "ana@gmail.com", "1234");
        gestion.registrarUsuarios("Oliver", "oliver@gmail.com", "5678");

        int opcion;

        do {
            System.out.println("\n📋 MENÚ:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre ✏️: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el email ✉️: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingresa la contraseña 🔒: ");
                    String contrasena = scanner.nextLine();

                    if (nombre.isEmpty() || email.isEmpty() || contrasena.isEmpty()) {
                        System.out.println("🚫 Nombre, email y contraseña no pueden estar vacíos.");
                    } else {
                        gestion.registrarUsuarios(nombre, email, contrasena);
                    }
                    break;

                case 2:
                    System.out.print("Ingresa tu email ✉️: ");
                    String emailL = scanner.nextLine();
                    System.out.print("Ingresa tu contraseña 🔒: ");
                    String contrasenaL = scanner.nextLine();
                    gestion.verificarCredenciales(emailL, contrasenaL);
                    break;

                case 3:
                    System.out.println("👋 ¡Gracias por usar el sistema! Hasta pronto.");
                    break;

                default:
                    System.out.println("❗ Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 3);
    }
}



//Crea un sistema de gestión de usuarios donde se puedan registrar y autenticar usuarios.
//Crea una clase Usuario con atributos nombre, email y contraseña.
//Utiliza ArrayList para almacenar usuarios registrados.
//Implementa un método para verificar credenciales e iniciar sesión.


