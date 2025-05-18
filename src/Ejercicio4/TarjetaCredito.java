package Ejercicio4;

public class TarjetaCredito implements MetodoPago {
    private String numeroTarjeta;
    private double saldo;

    public TarjetaCredito(String numeroTarjeta, double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
    }

    @Override
    public void pagar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("El saldo es suficiente, pago exitoso con tarjeta número: " + numeroTarjeta);
        } else {
            System.out.println("No hay saldo disponible. ERROR, por favor verifica el saldo de tu tarjeta " + numeroTarjeta);
        }
    }
}
