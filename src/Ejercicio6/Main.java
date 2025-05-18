package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new LibroFisico("Cien Años de Soledad", "Gabriel García Márquez", false));
        libros.add(new LibroDigital("Clean Code", "Robert C. Martin"));
        libros.add(new LibroFisico("1984", "George Orwell", false));
        libros.add(new LibroDigital("Java para principiantes", "Juan Pérez"));

        System.out.println("📚 Bienvenido a la Biblioteca Digital");
        System.out.println("Lista de libros disponibles:");


        for (int i = 0; i < libros.size(); i++) {
            System.out.print((i + 1) + ". ");
            ((Libro) libros.get(i)).mostrarInfo(); // Porque heredan de Libro
        }

        System.out.print("Seleccione el número del libro que desea usar: ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= libros.size()) {
            Libro libroSeleccionado = libros.get(opcion - 1);
            libroSeleccionado.usarLibro();
        } else {
            System.out.println("❗ Opción inválida.");
        }

        scanner.close();
    }
    }

//    . Biblioteca Digital (Herencia, polimorfismo, interfaces)
//Crea un sistema para gestionar libros digitales y físicos.
//Define una interfaz Prestable con el método prestar().
//Crea una clase base Libro y subclases LibroDigital y LibroFisico.
//Permite prestar libros físicos y descargar libros digitales


