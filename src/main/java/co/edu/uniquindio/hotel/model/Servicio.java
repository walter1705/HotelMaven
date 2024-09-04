package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.services.Iconsumible;

public abstract class Servicio implements Iconsumible{

    protected double precio;
    
    public Servicio(double precio) {
        this.precio = precio;
    }

    public abstract void consumir();

    public double getPrecio() {
        return precio;
    }
    
}

