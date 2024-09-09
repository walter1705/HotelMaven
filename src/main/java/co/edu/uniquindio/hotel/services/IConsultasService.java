package co.edu.uniquindio.hotel.services;
import java.util.List;

import co.edu.uniquindio.hotel.model.Reserva;

import java.util.Date;

public interface IConsultasService {
    List<Reserva> reservasIntervaloFechas(Date fechaInicial, Date fechaFinal);
    List<Reserva> reservasCliente(String id);
    double ingresosActuales();
}
