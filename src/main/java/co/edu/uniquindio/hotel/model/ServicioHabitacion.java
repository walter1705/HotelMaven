package co.edu.uniquindio.hotel.model;

public class ServicioHabitacion extends Servicio {

    public ServicioHabitacion() {
        super("Servicio de Habitación");
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de habitación consumido.");
    }
}

