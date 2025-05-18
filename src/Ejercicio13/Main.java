package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new CursoEnVivo("Java", 4, "Pedro Martinez");
        Curso curso2 = new CursoGrabado("Datos",5,"Pedro Perez");

        System.out.println("=== Inscripción a los cursos 🎶 ===\n");

        curso1.mostrarInfo();
        curso1.iniciarCurso();

        System.out.println("____________________" );

        curso2.mostrarInfo();
        curso2.iniciarCurso();

    }
}


//Plataforma de Cursos (Herencia, interfaces, polimorfismo)
//Modela una plataforma de cursos en línea.
//Crea una clase Curso con atributos nombre, duracion y profesor.
//Implementa CursoEnVivo y CursoGrabado, cada uno con una implementación diferente de
//iniciarCurso().
//Simula la inscripción y ejecución de cursos.