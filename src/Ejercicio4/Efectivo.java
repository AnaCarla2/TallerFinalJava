package Ejercicio4;

public class Efectivo implements MetodoPago {
  String nombre;

    public Efectivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Hola " + nombre + "Gracias por realizar tu pago en efectivo.");

    }
}
