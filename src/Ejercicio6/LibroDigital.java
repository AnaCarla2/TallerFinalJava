package Ejercicio6;

public class LibroDigital extends Libro {

    public LibroDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    public void descargar(){
        System.out.println("Descargando el libro" + titulo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("📓 Libro digital: " + titulo + " - Autor: " + autor);
    }

    @Override
    public void usarLibro() {
        System.out.println("💾 Descargando libro digital: " + titulo);
    }
}
