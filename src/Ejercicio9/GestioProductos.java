package Ejercicio9;

// Archivo: Inventario.java
import java.util.HashMap;

public class GestioProductos {
    private HashMap<String, Producto> productos;

    public GestioProductos() {
         productos = new HashMap<>();
    }

    // Agregar un producto nuevo al inventario
    public void agregarProducto(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }

    // Modificar stock de un producto existente
    public void modificarStock(String nombreProducto, int cantidad) {
        Producto producto = productos.get(nombreProducto);
        if (producto != null) {
            producto.modificarStock(cantidad);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Calcular el valor total del inventario
    public double calcularValorTotal() {
        double total = 0.0;
        for (Producto producto : productos.values()) {
            total += producto.valorEnInventario();
        }
        return total;
    }

    // Mostrar todos los productos
    public void mostrarInventario() {
        for (Producto producto : productos.values()) {
            System.out.println(producto);
        }
    }
}

