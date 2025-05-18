package Ejercicio2;

public  class Moto extends Vehiculo{

    //Constructor


    public Moto(String marca) {
        super(marca);
    }



    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " acelera rápidamente.");
    }

    @Override
    public void frenar() {
        System.out.println("La moto " + marca + " frena con freno de disco.");

    }
}
