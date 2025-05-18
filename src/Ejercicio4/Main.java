package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido al sistema de pago.");
            System.out.print("Ingrese el monto a pagar: ");
            double monto = scanner.nextDouble();

            System.out.println("Seleccione un método de pago:");
            System.out.println("1. Tarjeta de Crédito");
            System.out.println("2. PayPal");
            System.out.println("3. Efectivo");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


            MetodoPago metodoPago;

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese el número de tarjeta: ");
                    String tarjeta = scanner.nextLine();
                    System.out.println("Ingresa el saldo de tu tarjeta");
                    double saldo = scanner.nextDouble();
                    metodoPago = new TarjetaCredito(tarjeta,saldo);
                    break;
                case 2:
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Ingrese su correo de PayPal: ");
                    String correo = scanner.nextLine();
                    metodoPago = new PayPal(correo);
                    break;
                case 3:
                    System.out.println("Ingresa tu nombre por favor");
                    String nombre = scanner.nextLine();
                    metodoPago = new Efectivo(nombre);
                    break;
                default:
                    System.out.println("Opción inválida. Se canceló la compra.");
                    return;
            }
            metodoPago.pagar(monto);

        } while (opcion != 3);



        scanner.close();

    }

}
