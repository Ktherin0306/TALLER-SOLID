public class EmailNotification implements NotificationChannel {

    public void send(Notification notification) {
        System.out.println("Enviando EMAIL a: "
                + notification.getUser().getEmail());
        System.out.println("Mensaje: "
                + notification.getMessage());
    }
}