package Ejercicio12;

public class NotificacionPush implements  Notificacion{


    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("✔✔ Notificación enviada por Push 📢" + mensaje);
    }
}
