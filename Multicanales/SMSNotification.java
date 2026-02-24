public class SMSNotification implements NotificationChannel {

    public void send(Notification notification) {
        System.out.println("Enviando SMS a: "
                + notification.getUser().getPhone());
        System.out.println("Mensaje: "
                + notification.getMessage());
    }
}