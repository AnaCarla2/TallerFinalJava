package Ejercicio11;

public class CuentaBancaria {
    //Atributos
    private double saldo;

    //Constructores

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    // getter y setter

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(){


    }

    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar $" + monto);
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        }
    }
}
