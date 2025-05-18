package Ejercicio13;

public class CursoEnVivo extends Curso{

    public CursoEnVivo(String nombre, int duracion, String profesor) {
        super(nombre, duracion, profesor);

    }



    @Override
    public void iniciarCurso() {

        System.out.println("Iniciando curso EN VIVO con el profesor " + getProfesor() + "...");
        System.out.println("¡Conéctate al enlace de Zoom o Teams!");

    }
}
