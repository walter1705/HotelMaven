package co.edu.uniquindio.hotel.model;

import java.util.ArrayList;
import java.util.List;



public class Cliente {
    private String nombre;
    private String id;
    private List<Reserva>  reservasActivas  = new ArrayList<>();
    
    public void agregarReserva(Reserva reserva) {
        reservasActivas.add(reserva);
    }

    public FacturaUsual generarFacturaUsual() {
        FacturaUsual facturaUsual = new FacturaUsual(this);
        facturaUsual.generarFactura();
        return facturaUsual;
    }

    public FacturaDescuento generarFacturaDescuento(double descuento) {
        FacturaDescuento facturaDescuento = new FacturaDescuento(this, descuento );
        facturaDescuento.generarFactura();
        return facturaDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Reserva> getReservasActivas() {
        return reservasActivas;
    }

    public void setReservasActivas(List<Reserva> reservasActivas) {
        this.reservasActivas = reservasActivas;
    }
}

