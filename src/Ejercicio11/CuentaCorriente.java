package Ejercicio11;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Cuenta Corriente: Retirando $" + monto);
        super.retirar(monto); // usa la misma lógica de saldo de la clase base
    }
}
