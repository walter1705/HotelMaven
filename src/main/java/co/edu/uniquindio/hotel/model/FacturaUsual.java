package co.edu.uniquindio.hotel.model;

public class FacturaUsual extends Factura implements IFacturacion{

    public FacturaUsual(Cliente cliente) {
        super(cliente);
    }

    public void generarFactura() {
        System.out.println("Factura para: " + cliente.getNombre());
        for (Reserva reserva : cliente.getReservasActivas()) {
            Habitacion habitacion = reserva.getHabitacion();
            System.out.println("Reserva en Habitación: " + habitacion.getNumero() +
                    " (" + habitacion.getTipo() + ") - Precio por noche: $" + habitacion.getPrecio());System.out.println("");
        }
        System.out.println("Total a pagar: $" + calcularCostoReserva() );
    }

    public double calcularCostoReserva() {
        double total = 0;
        for (Reserva reserva : cliente.getReservasActivas()) {
            total += reserva.getCalculadorCostoReserva().calcularCosto(reserva);
        }
        return total;
    }
}
