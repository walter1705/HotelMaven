package co.edu.uniquindio.hotel.services;

import co.edu.uniquindio.hotel.model.TipoHabitacion;

public interface IHabitacionCrud {

    boolean crearHabitacion(int numero, double precio, TipoHabitacion tipoHabitacion);

    boolean eliminarHabitacion(int numero);
    boolean actualizarHabitacion(int numero, int numeroNuevo, double precio, TipoHabitacion tipoHabitacion);

}