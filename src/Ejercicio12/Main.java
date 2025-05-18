package Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido al sistema de notificaciones.");
        System.out.println("Escribe el mensaje que deseas enviar:");
        String mensaje = scanner.nextLine();

        System.out.println("Selecciona cómo deseas recibir la notificación:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push");
        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Notificacion notificacion = null;  // Creamos una variable que puede guardar cualquier tipo de notificación (email, SMS o push), pero por ahora la dejamos vacía (null).

        switch (opcion) {
            case 1:
                notificacion = new NotificacionEmail();
                break;
            case 2:
                notificacion = new NotificacionSMS();
                break;
            case 3:
                notificacion = new NotificacionPush();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
          //si el usuario eligió una opción válida, enviamos la notificación.
        if (notificacion != null) {
            notificacion.enviarNotificacion(mensaje);
        }

        scanner.close();
    }
}
