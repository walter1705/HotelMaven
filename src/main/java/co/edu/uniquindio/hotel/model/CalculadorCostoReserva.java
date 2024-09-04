package co.edu.uniquindio.hotel.model;

public class CalculadorCostoReserva {

    public double calcularCosto(Reserva reserva) {
        long diffInMillis = reserva.getFechaSalida().getTime() - reserva.getFechaEntrada().getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        return reserva.getHabitacion().getPrecio() * diffInDays;
    }
}