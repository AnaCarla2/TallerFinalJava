package Ejercicio14;

public class Taxi extends Transporte{
    public Taxi() {
    }

    @Override
    public void arrancar() {
        System.out.println("El taxi comenzó su trayecto 🚖");

    }

    @Override
    public void detener() {
        System.out.println("El taxi terminó su trayecto 🚖");

    }
}
