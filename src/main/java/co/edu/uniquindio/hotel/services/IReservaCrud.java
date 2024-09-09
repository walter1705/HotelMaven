package co.edu.uniquindio.hotel.services;

import co.edu.uniquindio.hotel.model.*;
import java.util.Date;

public interface IReservaCrud {
    boolean crearReserva(Habitacion habitacion, Cliente cliente, Date fechaEntrada, Date fechaSalida);
    boolean eliminarReserva(Habitacion habitacion);
    boolean actualizarReserva(Habitacion habitacion, Cliente cliente, Date fechaEntrada, Date fechaSalida, Habitacion habitacionNueva);
}
