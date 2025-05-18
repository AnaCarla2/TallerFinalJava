package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vendible> productos = new ArrayList<>();

        productos.add(new Ropa("Camiseta", 20000));
        productos.add(new Electrodomestico("Licuadora", 150000));
        productos.add(new Alimento("Manzanas", 8000));

        for (Vendible producto : productos) {
            System.out.println(producto);
        }
    }
}



//Simula un sistema de ventas en línea con diferentes tipos de productos.
//Define una interfaz Vendible con el método calcularPrecioFinal().
//Implementa esta interfaz en clases Ropa, Electrodomestico y Alimento, aplicando diferentes
//cálculos de impuestos o descuentos.
//Crea una lista de productos y muestra su precio final.