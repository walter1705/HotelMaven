package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.builder.ClienteBuilder;

import java.util.ArrayList;
import java.util.List;



public class Cliente {
    private String nombre;
    private String id;
    private List<Reserva>  reservasActivas  = new ArrayList<>();

   public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void agregarReserva(Reserva reserva) {
        reservasActivas.add(reserva);
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Reserva> getReservasActivas() {
        return reservasActivas;
    }

}

