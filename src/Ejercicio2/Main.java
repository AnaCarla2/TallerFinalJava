package Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota"));
        vehiculos.add(new Moto("Yamaha"));
        vehiculos.add(new Camion("Volvo"));

        for (Vehiculo v : vehiculos) {
            v.acelerar();
            v.frenar();
            System.out.println(); // Línea en blanco para separar
        }



    }
}


//Desarrolla un sistema para gestionar diferentes tipos de vehículos.
//Crea una clase abstracta Vehiculo con métodos acelerar() y frenar().
//Crea subclases Auto, Moto y Camion, cada una con una implementación diferente de
//acelerar() y frenar().
//Crea una lista de vehículos y realiza pruebas de aceleración.
