package Ejercicio3;

public class Ropa implements Vendible{
    //Atributos
    private  String nombre;
    private double precio;

    //constructores


    public Ropa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecioFinal(double precioFinal) {
        // Suponiendo un 10% de IVA
        return precio * 1.10;

    }
    @Override
    public String toString() {
        return "Ropa: " + nombre + " - Precio final: $" + calcularPrecioFinal(precio);
    }


}
