package co.edu.uniquindio.hotel.model;

public class Spa extends Servicio {

    public Spa(double precio) {
        super(precio);
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de Spa consumido.");
    }
}
