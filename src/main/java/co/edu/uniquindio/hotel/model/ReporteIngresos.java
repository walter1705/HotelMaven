package co.edu.uniquindio.hotel.model;

import java.util.Calendar;
import java.util.List;

public class ReporteIngresos {
    private CalculadorCostoReserva calculadorCostoReserva;

    public ReporteIngresos() {
        this.calculadorCostoReserva = new CalculadorCostoReserva();
    }

    public double calcularIngresosMensuales(List<Reserva> reservas, int mes, int anio) {
        double totalIngresos = 0;
        Calendar cal = Calendar.getInstance();

        for (Reserva reserva : reservas) {
            cal.setTime(reserva.getFechaEntrada());
            int mesReserva = cal.get(Calendar.MONTH);
            int anioReserva = cal.get(Calendar.YEAR);

            if (mesReserva == mes && anioReserva == anio) {
                totalIngresos += calculadorCostoReserva.calcularCosto(reserva);
            }
        }

        return totalIngresos;
    }

    public void mostrarReporteIngresos(List<Reserva> reservas, int mes, int anio) {
        System.out.println("MOSTRANDO EL REPORTE DE INGRESOS");
        double ingresosMensuales = calcularIngresosMensuales(reservas, mes, anio);
        System.out.println("Ingresos generados en el mes " + (mes + 1) + "/" + anio + ": $" + ingresosMensuales);
    }
}

