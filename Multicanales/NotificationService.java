public class NotificationService {

    private NotificationChannel channel;
    private NotificationHistory history;
    private Logger logger;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
        this.history = new NotificationHistory();
        this.logger = new Logger();
    }

    public void send(Notification notification) {

        logger.log("Enviando notificación...");

        channel.send(notification);

        history.save(notification);

        logger.log("Proceso terminado.");
    }
}