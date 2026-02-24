public class PushNotification implements NotificationChannel {

    public void send(Notification notification) {
        System.out.println("Enviando PUSH a usuario: "
                + notification.getUser().getName());
        System.out.println("Mensaje: "
                + notification.getMessage());
    }
}