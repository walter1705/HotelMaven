package co.edu.uniquindio.hotel.model;


import java.util.ArrayList;
import java.util.List;

public abstract class Habitacion { // Puede ser "simple", "doble", "suite"
    private int numero;
    private double precio;
    private List<Servicio> servicios = new ArrayList<>();

    public Habitacion(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public void agregarServicio(Servicio servicio) {
                servicios.add(servicio);
                precio+=servicio.getPrecio();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}

