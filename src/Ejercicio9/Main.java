package Ejercicio9;


public class Main {
    public static void main(String[] args) {
        GestioProductos inventario = new GestioProductos();

        // Agregamos productos
        inventario.agregarProducto(new Producto("Laptop", 2500.00, 5));
        inventario.agregarProducto(new Producto("Mouse", 25.50, 20));
        inventario.agregarProducto(new Producto("Teclado", 45.00, 10));

        // Mostrar productos
        System.out.println("📦 Inventario inicial:");
        inventario.mostrarInventario();

        // Modificamos stock
        inventario.modificarStock("Laptop", -1); // Vendimos una laptop
        inventario.modificarStock("Mouse", 10);  // Llegaron más mouses

        // Mostrar productos después del cambio
        System.out.println("\n🔄 Inventario actualizado:");
        inventario.mostrarInventario();

        // Calcular valor total del inventario
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("\n💰 Valor total del inventario: $" + valorTotal);
    }
}

