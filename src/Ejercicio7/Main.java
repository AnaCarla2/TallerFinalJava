package Ejercicio7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        // Agregamos diferentes tipos de animales
        animales.add(new Perro());
        animales.add(new Elefante());
        animales.add(new Gato());

        //Recorremos la lista con el for-each
        for (Animal animal : animales) {
            animal.hacerSonido();

        }

    }
}

//7. Simulador de Zoológico (Herencia, polimorfismo, clases abstractas)
//Crea una aplicación para gestionar un zoológico.
//Define una clase abstracta Animal con un método abstracto hacerSonido().
//Crea subclases Perro, Gato y Elefante, cada una con su sonido característico.
//Crea una lista de animales y recorre la lista para mostrar los sonidos de cada uno.