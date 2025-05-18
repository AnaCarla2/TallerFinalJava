package Ejercicio11;

public class CuentaAhorro extends CuentaBancaria{
    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Cuenta Ahorros: intentando retirar $" + monto);
        super.retirar(monto);
        }
    }
