package Ejercicio10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Reservable> reservas = new ArrayList<>();

        reservas.add(new Hotel("Hilton"));
        reservas.add(new Vuelo("Latam", "Cancun"));
        reservas.add(new Hotel("Americas"));
        reservas.add(new Vuelo("Avianca", "Cartagena"));

        // Reservamos todos los elementos

        System.out.println("📅 Realizando reservas:");
        for (Reservable item : reservas) {
            item.reservar();
        }
    }
}

//
//Sistema de Reservas (Interfaces, herencia, polimorfismo)
//Crea un sistema de reservas de hotel y vuelos.
//Crea una interfaz Reservable con un método reservar().
//Implementa la interfaz en clases Hotel y Vuelo.
//Simula reservas y muestra la disponibilidad.
