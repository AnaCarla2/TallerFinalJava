package Ejercicio6;

public class LibroFisico extends Libro {
    private boolean prestado;

    public LibroFisico(String titulo, String autor, boolean prestado) {
        super(titulo, autor);
        this.prestado = prestado;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("📕 Libro físico: " + titulo + " - Autor: " + autor +
                " - Estado: " + (prestado ? "Prestado" : "Disponible"));
    }

    @Override
    public void usarLibro() {
        if (!prestado) {
            prestado = true;
            System.out.println("✅ Has prestado el libro físico: " + titulo);
        } else {
            System.out.println("❌ Este libro ya está prestado.");
        }
    }
}

