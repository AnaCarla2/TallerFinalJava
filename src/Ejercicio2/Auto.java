package Ejercicio2;

public class Auto extends Vehiculo{
//constructor


    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("El auto " + marca + " acelera suavemente.");

    }

    @Override
    public void frenar() {
        System.out.println("El auto " + marca + " frena con sistema ABS.");

    }
}
