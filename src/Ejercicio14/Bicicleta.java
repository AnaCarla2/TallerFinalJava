package Ejercicio14;

public class Bicicleta extends Transporte{
    @Override
    public void arrancar() {
        System.out.println("La bicicleta ha comenzado a pedalear 🚴‍♀️");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta ha terminado de pedalear 🚴‍♀️");
    }
}
