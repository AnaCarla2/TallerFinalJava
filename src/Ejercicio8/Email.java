package Ejercicio8;

public class Email implements Mensaje{

    public Email() {
    }

    @Override
    public void enviar(String contenido) {
        System.out.println("Mensaje enviado por e-mail" + contenido);
    }
}
