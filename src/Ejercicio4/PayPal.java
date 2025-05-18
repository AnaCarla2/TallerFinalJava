package Ejercicio4;

public class PayPal implements MetodoPago {
    private String correo;

    public PayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + "con PayPal registrada con correo "+ correo);

    }
}
