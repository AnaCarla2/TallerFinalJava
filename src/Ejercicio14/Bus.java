package Ejercicio14;

public class Bus extends Transporte{
    @Override
    public void arrancar() {
        System.out.println("El bus ha arrancado su ruta.");

    }

    @Override
    public void detener() {
        System.out.println("El bus ha terminado su ruta.");
    }
}
