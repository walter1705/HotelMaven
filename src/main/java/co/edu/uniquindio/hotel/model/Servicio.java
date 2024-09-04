package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.services.Iconsumible;

public abstract class Servicio implements Iconsumible{

    private String nombre;

    

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public abstract void consumir();



    public String getNombre() {
        return nombre;
    }
}

