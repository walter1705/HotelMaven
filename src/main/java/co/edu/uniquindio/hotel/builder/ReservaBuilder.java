package co.edu.uniquindio.hotel.builder;

import java.util.Date;

import co.edu.uniquindio.hotel.model.Cliente;
import co.edu.uniquindio.hotel.model.Habitacion;
import co.edu.uniquindio.hotel.model.Reserva;

public class ReservaBuilder {
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaEntrada;
    private Date fechaSalida;

    public ReservaBuilder habitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        return this;
    }
    public ReservaBuilder cliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }
    public ReservaBuilder fechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
        return this;
    }
    public ReservaBuilder fechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }
    
    public Reserva build() {
        return new Reserva(habitacion, cliente, fechaEntrada, fechaSalida);
    } 
}
