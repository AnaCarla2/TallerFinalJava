package Ejercicio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de medios de mensaje
        ArrayList<Mensaje> medio = new ArrayList<>();

        // Agregar diferentes medios
        medio.add(new Email());
        medio.add(new WhatsApp());
        medio.add(new SMS());

        // Enviar un mensaje por cada medio
        for (Mensaje medios : medio ){
            medios.enviar("¡Hola te saludo desde el sistema de mensajería!");
        }



    }
}
