package co.edu.uniquindio.hotel.services;

public interface IClienteCrud {
    boolean crearCliente(String nombre, String id);
    boolean eliminarCliente(String id);
    boolean actualizarCliente(String nombre, String id);

}
