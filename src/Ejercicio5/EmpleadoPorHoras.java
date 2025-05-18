package Ejercicio5;

public class EmpleadoPorHoras extends Empleados {
    private int horasTrabajadas;
    private double pagoHoras;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double pagoHoras) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHoras = pagoHoras;
    }

    public EmpleadoPorHoras(int horasTrabajadas, double pagoHoras) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHoras = pagoHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHoras() {
        return pagoHoras;
    }

    public void setPagoHoras(double pagoHoras) {
        this.pagoHoras = pagoHoras;
    }

    @Override
    public double calcularSalario(){
        return horasTrabajadas * pagoHoras;
    }
}
