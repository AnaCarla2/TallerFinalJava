package Ejercicio2;

public abstract class Vehiculo {
    // Atributos
 protected  String marca;

 //Constructores

    public Vehiculo() {
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // setter y getter


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract void acelerar();
    public abstract void frenar();
}
