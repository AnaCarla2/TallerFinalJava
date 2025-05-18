package Ejercicio5;

public class EmpleadoFijo extends  Empleados{

    private int mesesTrabajados;



    public EmpleadoFijo(String nombre, double salarioBase, int mesesTrabajados) {
        super(nombre, salarioBase);
        this.mesesTrabajados = mesesTrabajados;

    }

    public int getMesesTrabajados() {
        return mesesTrabajados;
    }

    public void setMesesTrabajados(int mesesTrabajados) {
        this.mesesTrabajados = mesesTrabajados;
    }


    @Override
    public double calcularSalario(){

        return salarioBase * mesesTrabajados;
    }
}
