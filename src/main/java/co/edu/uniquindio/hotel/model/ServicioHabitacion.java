package co.edu.uniquindio.hotel.model;

public class ServicioHabitacion extends Servicio {

    public ServicioHabitacion(double precio) {
        super(precio);
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de habitación consumido.");
    }
}

