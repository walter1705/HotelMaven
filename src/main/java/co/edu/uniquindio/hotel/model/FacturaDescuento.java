package co.edu.uniquindio.hotel.model;

public class FacturaDescuento extends Factura implements IFacturacion{
    double descuento;
    public FacturaDescuento(Cliente cliente, double descuento) {
        super(cliente);
        this.descuento = descuento;
    }
    @Override
    public void generarFactura() {
        System.out.println("Factura para: " + cliente.getNombre());
        for (Reserva reserva : cliente.getReservasActivas()) {
            Habitacion habitacion = reserva.getHabitacion();
            System.out.println("Reserva en Habitación: " + habitacion.getNumero() +
                    " (" + habitacion.getTipo() + ") - Precio por noche: $" + habitacion.getPrecio());
        }
        System.out.println("Total a pagar sin descuento: $" +
                calcularCostoReserva()+(calcularCostoReserva()*(descuento*0.01)));
        System.out.println("Total a pagar con descuento aplicado: $" +
                (calcularCostoReserva()));
    }
    public double calcularCostoReserva() {
        double total = 0;
        for (Reserva reserva : cliente.getReservasActivas()) {
            double costoReserva = reserva.getCalculadorCostoReserva().calcularCosto(reserva);
            total += costoReserva-(costoReserva*(descuento*0.01));
        }
        return total;
    }
}

