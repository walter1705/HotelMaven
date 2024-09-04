package co.edu.uniquindio.hotel.model;

import java.util.Date;


public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaEntrada;
    private Date fechaSalida;
    private final CalculadorCostoReserva calculadorCostoReserva = new CalculadorCostoReserva();

    public Reserva(Habitacion habitacion, Cliente cliente, Date fechaEntrada, Date fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public CalculadorCostoReserva getCalculadorCostoReserva() {
        return calculadorCostoReserva;
    }
}

