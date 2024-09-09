package co.edu.uniquindio.hotel.services;

public interface IHabitacionSimpleCrud {

    boolean crearHabitacionSimple(int numero, double precio);

    boolean eliminarHabitacionSimple(int numero);

    boolean actualizarHabitacionSimple(int numero, int numeroNuevo, double precio);

}