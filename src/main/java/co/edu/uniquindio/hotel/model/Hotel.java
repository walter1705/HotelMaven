package co.edu.uniquindio.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> listaHabitaciones = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Servicio> listaServicios = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        listaHabitaciones.add(habitacion);
    }
    public void agregarReserva(Reserva reserva) {
        listaReservas.add(reserva);
    }
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    public void agregarServicio(Servicio servicio) {
        listaServicios.add(servicio);
    }

    public List<Servicio> getListaServicios() {
        return listaServicios;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }
}
