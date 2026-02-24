import java.util.ArrayList;

public class NotificationHistory {

    private ArrayList<Notification> history;

    public NotificationHistory() {
        history = new ArrayList<>();
    }

    public void save(Notification notification) {
        history.add(notification);
        System.out.println("Notificación guardada en historial.");
    }
}