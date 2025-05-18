package Ejercicio13;

public class CursoGrabado extends Curso{


    public CursoGrabado(String nombre, int duracion, String profesor) {
        super(nombre, duracion, profesor);
    }

    @Override
    public void iniciarCurso() {

        System.out.println("Iniciando curso GRABADO: " + getNombre());
        System.out.println("¡Puedes verlo cuando quieras!");

    }
}
