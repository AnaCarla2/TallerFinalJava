package Ejercicio5;

public class Empleados {
       private String nombre;
        double salarioBase;

    public Empleados() {
    }

    public Empleados(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
            return 0.0;
        }


    }

