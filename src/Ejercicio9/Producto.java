package Ejercicio9;

import java.lang.reflect.Constructor;

public class Producto {
    //Atributos
    public String nombre;
    public double precio;
    public int stock;


   // Constructores

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para modificar el stock (suma o resta)
    public void modificarStock(int cantidad) {
        this.stock += cantidad;
    }

    // Método para calcular el valor del producto en inventario
    public double valorEnInventario() {
        return precio * stock;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio + ", Stock: " + stock;
    }
}
