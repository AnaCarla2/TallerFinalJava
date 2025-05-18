package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        // Creamos una cuenta de ahorros con $500 iniciales
        CuentaBancaria cuentaAhorros = new CuentaAhorro(500.0);

        // Creamos una cuenta corriente con $300 iniciales
        CuentaBancaria cuentaCorriente = new CuentaCorriente(300.0);

        // Operaciones con cuenta de ahorros
        System.out.println("----- Operaciones con Cuenta Ahorros -----");
        try {
            cuentaAhorros.depositar(100);     // Saldo = 600
            cuentaAhorros.retirar(200);       // Saldo = 400
            cuentaAhorros.retirar(500);       // Error: saldo insuficiente
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error en cuenta de ahorros: " + e.getMessage());
        }

        // Operaciones con cuenta corriente
        System.out.println("\n----- Operaciones con Cuenta Corriente -----");
        try {
            cuentaCorriente.depositar(50);    // Saldo = 350
            cuentaCorriente.retirar(100);     // Saldo = 250
            cuentaCorriente.retirar(300);     // Error: saldo insuficiente
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error en cuenta corriente ❌: " + e.getMessage());
        }

        // Mostrar saldos finales
        System.out.println("\n----- Saldos Finales -----");
        System.out.println("Saldo cuenta de ahorros: 💲" + cuentaAhorros.getSaldo());
        System.out.println("Saldo cuenta corriente: 💲" + cuentaCorriente.getSaldo());
    }
}


//Cajero Automático (Encapsulamiento, polimorfismo, excepciones)
//Modela un sistema de cajero automático.
//Crea una clase CuentaBancaria con atributos saldo y métodos depositar(), retirar().
//Lanza una excepción personalizada si el saldo es insuficiente.
//Simula operaciones bancarias con diferentes cuentas.