package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Empleados empleado1 = new EmpleadoFijo("Ana Martinez", 200, 12);
        Empleados empleado2 = new EmpleadoFijo("Juan Perez", 222, 15);
        Empleados empleado3 = new EmpleadoPorHoras("Oliver Galindo",2000,32,200);
        Empleados empleado4 = new EmpleadoPorHoras("Rosa Perez",2600,32,400);

        Empleados [] empleadoPrueba = {empleado1, empleado2, empleado3, empleado4};

        for (Empleados emplea : empleadoPrueba){
            System.out.println("Nombre: " + emplea.getNombre());
            System.out.println("Salario: $" + emplea.calcularSalario());
            System.out.println("------------------------");

        }
    }

}
