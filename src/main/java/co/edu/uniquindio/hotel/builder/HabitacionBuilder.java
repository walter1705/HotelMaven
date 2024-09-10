package co.edu.uniquindio.hotel.builder;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;

import co.edu.uniquindio.hotel.model.Habitacion;
import co.edu.uniquindio.hotel.model.Servicio;
import co.edu.uniquindio.hotel.model.TipoHabitacion;

public class HabitacionBuilder{
    protected int numero;
    protected double precio;
    protected List<Servicio> servicios = new ArrayList<>();
    protected TipoHabitacion tipoHabitacion;

    public HabitacionBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public HabitacionBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public HabitacionBuilder servicios(List<Servicio> servicios) {
        this.servicios = servicios;
        return this;
    }

    public HabitacionBuilder tipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        return this;
    }


    public  Habitacion build() {
        return new Habitacion(numero, precio, tipoHabitacion);
    }
}
