package co.edu.uniquindio.hotel.model;


import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numero;
    private String tipo;  // Puede ser "simple", "doble", "suite"
    private double precio;
    private List<Servicio> servicios = new ArrayList<>();

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void agregarServicio(Servicio servicio) {
                servicios.add(servicio);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

