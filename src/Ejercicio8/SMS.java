package Ejercicio8;

public class SMS implements Mensaje{

    public SMS() {
    }

    @Override
    public void enviar(String contenido) {
        System.out.println("Mensaje enviado por SMS" + contenido);
    }
}
