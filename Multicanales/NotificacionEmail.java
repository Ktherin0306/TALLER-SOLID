public class NotificacionEmail implements Notificacion {

    private ServicioEmail servicioEmail;

    public NotificacionEmail(ServicioEmail servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    @Override
    public void enviar(String mensaje, Usuario usuario) {
        servicioEmail.enviarEmail(usuario.getEmail(), mensaje);
    }
}