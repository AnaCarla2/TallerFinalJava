package Ejercicio13;

public abstract class Curso {
    //Atributos

    private String nombre;
    private  int duracion;
    private String profesor;

    //Constructor

    public Curso() {
    }

    public Curso(String nombre, int duracion, String profesor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.profesor = profesor;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void mostrarInfo(){
        System.out.println("_______Bienvenido________");
        System.out.println("Curso: " + nombre);
        System.out.println("Duración: " + duracion + " horas");
        System.out.println("Profesor: " + profesor);
    }

    public abstract void iniciarCurso();


}
