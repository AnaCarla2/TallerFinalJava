package Ejercicio8;

public class WhatsApp implements Mensaje{

    public WhatsApp() {
    }

    @Override
    public void enviar(String contenido) {
        System.out.println("Mensaje enviado por WhatsApp" + contenido);
    }
}
