package Ejercicio10;

public class Hotel implements Reservable{
    private String nombre;

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reservar() {
        System.out.println("Hotel '" + nombre + "' reservado con éxito.");
    }
}
