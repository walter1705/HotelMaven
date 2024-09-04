package co.edu.uniquindio.hotel.builder;

import co.edu.uniquindio.hotel.model.Cliente;

public class ClienteBuilder {
    private String nombre;
    private String id;

    public ClienteBuilder() {}

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder id(String id) {
        this.id = id;
        return this;
    }

    public Cliente build() {
        return new Cliente(nombre, id);
    }
}
