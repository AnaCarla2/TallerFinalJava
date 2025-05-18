package Ejercicio2;

public class Camion extends Vehiculo{
  //Constructor
    public Camion(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
      System.out.println("El camión " + marca + " acelera lentamente.");
    }

    @Override
    public void frenar() {
      System.out.println("El camión " + marca + " frena con freno de aire.");
    }
}
