package co.edu.uniquindio.hotel.model;

public class FacturaJuridica extends Factura implements  IFacturacion {
    double impuestoAdicional;
    public FacturaJuridica(Cliente cliente, double impuestoAdicional) {
        super(cliente);
        this.impuestoAdicional = impuestoAdicional;
    }

    @Override
    public void generarFactura() {
        System.out.println("Factura para: " + cliente.getNombre());
        for (Reserva reserva : cliente.getReservasActivas()) {
            Habitacion habitacion = reserva.getHabitacion();
            System.out.println("Reserva en Habitación: " + habitacion.getNumero() +
                    " (" + habitacion.getTipo() + ") - Precio por noche: $" + habitacion.getPrecio());
        }
        System.out.println("Total a pagar sin impuesto: $" + (calcularCostoReserva()-(calcularCostoReserva()*(impuestoAdicional*0.01))));
        System.out.println("Total a pagar con impuesto aplicado: $" + calcularCostoReserva());
    }
    public double calcularCostoReserva() {
        double total = 0;
        for (Reserva reserva : cliente.getReservasActivas()) {
            double impuesto = impuestoAdicional*0.01;
            double precioReserva = reserva.getCalculadorCostoReserva().calcularCosto(reserva);
            total += precioReserva+(impuesto*precioReserva);
        }
        return total;
    }
}
