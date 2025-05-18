package Ejercicio3;

public class Alimento implements Vendible{
    //Atributos
    private  String nombre;
    private double precio;

     //Constructor


    public Alimento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecioFinal(double precioFinal) {
        return precio* 1.10;// 10% de iva
    }

    @Override
    public String toString() {
        return "Alimento: " + nombre + " - Precio final: $" + calcularPrecioFinal(precio);
    }

}
