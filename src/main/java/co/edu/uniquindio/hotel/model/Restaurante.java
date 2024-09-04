package co.edu.uniquindio.hotel.model;

public class Restaurante extends Servicio {

    public Restaurante() {
        super("Restaurante");
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de Restaurante consumido.");
    }
}

