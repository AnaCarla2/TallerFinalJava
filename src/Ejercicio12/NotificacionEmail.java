package Ejercicio12;

import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class NotificacionEmail implements Notificacion{

    public NotificacionEmail() {
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println(" ✔✔ Notificación enviada por E-mail 💻" + mensaje);

    }
}
