package Ejercicio12;

public class NotificacionSMS implements Notificacion{
    public NotificacionSMS() {
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("✔✔ Notificación enviada por SMS 📪" + mensaje);

    }
}
