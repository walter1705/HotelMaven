package co.edu.uniquindio.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Factura {
    protected Cliente cliente;

    public abstract void generarFactura();



}


