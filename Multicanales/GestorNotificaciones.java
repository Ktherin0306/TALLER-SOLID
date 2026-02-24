
public class GestorNotificaciones {

    private List<Notificacion> canales;

    public GestorNotificaciones(List<Notificacion> canales) {
        this.canales = canales;
    }

    public void enviarNotificacion(String mensaje, Usuario usuario) {
        for (Notificacion canal : canales) {
            canal.enviar(mensaje, usuario);
        }
    }
}