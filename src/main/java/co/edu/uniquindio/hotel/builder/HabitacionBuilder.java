package co.edu.uniquindio.hotel.builder;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.hotel.model.Habitacion;
import co.edu.uniquindio.hotel.model.Servicio;

public abstract class HabitacionBuilder <T extends HabitacionBuilder<T>>{
    protected int numero;
    protected double precio;
    protected List<Servicio> servicios = new ArrayList<>();

    public T numero(int numero) {
        this.numero = numero;
        return self();
    }

    public T precio(double precio) {
        this.precio = precio;
        return self();
    }

    public T servicios(List<Servicio> servicios) {
        this.servicios = servicios;
        return self();
    }

    protected abstract T self();

    public abstract Habitacion build();
}
