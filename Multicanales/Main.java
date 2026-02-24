public class Main {

    public static void main(String[] args) {

        User user = new User(
                "Angie",
                "angie@email.com",
                "3001234567"
        );

        Notification notification =
                new Notification("Hola Angie, tienes una alerta.", user);

        NotificationFactory factory = new NotificationFactory();

        NotificationChannel channel =
                factory.createChannel("email");

        NotificationService service =
                new NotificationService(channel);

        service.send(notification);
    }
}