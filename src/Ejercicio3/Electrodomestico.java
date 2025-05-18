package Ejercicio3;

public class Electrodomestico implements Vendible{
    //Atributos
    private  String nombre;
    private double precio;

    // Constructor


    public Electrodomestico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public double calcularPrecioFinal(double precioFinal) {
        return precio * 0.95 ; // Se aplica 5% de descuento al precio.
    }

    @Override
    public String toString() {
        return "Electrodoméstico: " + nombre + " - Precio final: $" + calcularPrecioFinal(precio);
    }


}
