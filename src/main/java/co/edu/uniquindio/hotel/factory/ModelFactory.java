package co.edu.uniquindio.hotel.factory;

import co.edu.uniquindio.hotel.model.*;

import java.util.Calendar;
import java.util.Date;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private Hotel hotel;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory==null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    public void inicializarDatos() {
        hotel = new Hotel();
        // cliente 1
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Yeral");
        cliente1.setId("1004");
        hotel.agregarCliente(cliente1);
        // cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Maria");
        cliente2.setId("1005");
        hotel.agregarCliente(cliente2);
    // cliente 3
        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Pedro");
        cliente3.setId("1006");
        hotel.agregarCliente(cliente2);
        // Crear habitaciones
        Habitacion habitacion1 = new HaSimple(101, 150.0);
        Habitacion habitacion2 = new HaDoble(102,  250.0);
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        // Crear fechas
        Calendar cal = Calendar.getInstance();
        cal.set(2024, Calendar.AUGUST, 5);
        Date fechaEntrada = cal.getTime();
        cal.set(2024, Calendar.AUGUST, 10);
        Date fechaSalida = cal.getTime();
        // Crear reserva
        Reserva reserva = new Reserva(habitacion1, cliente1, fechaEntrada, fechaSalida);
        cliente1.agregarReserva(reserva);
        hotel.agregarReserva(reserva);
     //Añadir servicios a la habitación
        Servicio servicioHabitacion = new ServicioHabitacion(75000);
        habitacion1.agregarServicio(servicioHabitacion);
        servicioHabitacion.consumir();
        Servicio spa = new Spa(50000);
        habitacion1.agregarServicio(spa);
        spa.consumir();
               // Crear reservas

        cal.set(2024, Calendar.AUGUST, 1); // 1 de agosto de 2024
        Date fechaEntrada1 = cal.getTime();
        cal.set(2024, Calendar.AUGUST, 5); // 5 de agosto de 2024
        Date fechaSalida1 = cal.getTime();
        cal.set(2024, Calendar.AUGUST, 10); // 10 de agosto de 2024
        Date fechaEntrada2 = cal.getTime();
        cal.set(2024, Calendar.AUGUST, 15); // 15 de agosto de 2024
        Date fechaSalida2 = cal.getTime();
        Reserva reserva1 = new Reserva(habitacion1, cliente1, fechaEntrada1, fechaSalida1);
        Reserva reserva2 = new Reserva(habitacion2, cliente2, fechaEntrada2, fechaSalida2);
        hotel.agregarReserva(reserva1);
        hotel.agregarReserva(reserva2);
           }

    public void reservaIntervalosFechas(Date fechaInicial, Date fechaFinal) {
        hotel.reservasIntervaloFechas(fechaInicial, fechaFinal);
    }
}
