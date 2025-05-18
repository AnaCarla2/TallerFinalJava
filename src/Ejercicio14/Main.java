package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        Transporte bus = new Bus();
        Transporte taxi = new Taxi();
        Transporte bicicleta = new Bicicleta();

        System.out.println("_______Bienvenido a nuestro sistema de transporte_______");
        System.out.println("Viaje en bus");
        bus.arrancar();
        bus.detener();

        System.out.println("________________________");
        System.out.println("Viaje en Taxi");
        taxi.arrancar();
        taxi.detener();

        System.out.println("___________________________");
        System.out.println("Viaje en Bicicleta");
        bicicleta.arrancar();
        bicicleta.detener();
    }


}


//Simulación de Transporte (Herencia, polimorfismo, clases abstractas)
//Desarrolla un sistema para gestionar diferentes tipos de transporte.
//Crea una clase abstracta Transporte con métodos arrancar() y detener().
//        Implementa Bus, Taxi y Bicicleta, cada uno con su comportamiento.
//Simula el inicio y finalización de viajes.
