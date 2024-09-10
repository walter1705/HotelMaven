package co.edu.uniquindio.hotel;

import co.edu.uniquindio.hotel.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.builder.HabitacionBuilder;
import co.edu.uniquindio.hotel.factory.ModelFactory;
import co.edu.uniquindio.hotel.model.Cliente;
import co.edu.uniquindio.hotel.model.Habitacion;
import co.edu.uniquindio.hotel.model.TipoHabitacion;

import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        reservaIntervalosFechas(modelFactory);
        reservasCliente(modelFactory);
        ingresosActuales(modelFactory);
        //crudCliente(modelFactory);
        //crudHabitacion(modelFactory);
        crudReserva(modelFactory);
    }

    private static void crudReserva(ModelFactory modelFactory) {
        crearReserva(modelFactory);
        eliminarReserva(modelFactory);
        actualizarReserva(modelFactory);
    }

    private static void actualizarReserva(ModelFactory modelFactory) {
        Calendar calendarInstance = Calendar.getInstance();
        calendarInstance.set(2024, Calendar.AUGUST, 10);
        Date fechaInicial = calendarInstance.getTime();
        calendarInstance.set(2024, Calendar.AUGUST, 12);
        Date fechaFinal = calendarInstance.getTime();
        Cliente cliente = new ClienteBuilder()
                .nombre("Josie")
                .id("").
                build();
        Habitacion habitacion = new HabitacionBuilder()
                .numero(5)
                .build();
        Habitacion habitacionNueva = new HabitacionBuilder()
                .numero(10)
                .precio(100000)
                .tipoHabitacion(TipoHabitacion.SIMPLE)
                .build();
        boolean result = modelFactory.actualizarReserva(habitacion, habitacionNueva, cliente,
                fechaInicial, fechaFinal);
        if (result) System.out.println("Reserva actualizada. ");
        else System.out.println("Reserva no existente.  ");
    }

    private static void eliminarReserva(ModelFactory modelFactory) {
        Habitacion habitacion = new HabitacionBuilder().numero(5).build();
        boolean result = modelFactory.eliminarReserva(habitacion);
        if (result) System.out.println("Reserva eliminada. ");
        else System.out.println("Reserva no existe.  ");
    }

    private static void crearReserva(ModelFactory modelFactory) {
        Calendar calendarInstance = Calendar.getInstance();
        calendarInstance.set(2024, Calendar.AUGUST, 6);
        Date fechaInicial = calendarInstance.getTime();
        calendarInstance.set(2024, Calendar.AUGUST, 8);
        Date fechaFinal = calendarInstance.getTime();
        Cliente cliente = new ClienteBuilder()
                .nombre("Jos")
                .id("3443").
                build();
        Habitacion habitacion = new HabitacionBuilder()
                .numero(5)
                .precio(55000)
                .tipoHabitacion(TipoHabitacion.SIMPLE)
                .build();

        boolean result = modelFactory.crearReserva(habitacion, cliente, fechaInicial, fechaFinal);
        if (result) System.out.println("Reserva creada. ");
        else System.out.println("Reserva existente.  ");

    }

    private static void crudHabitacion(ModelFactory modelFactory) {
        crearHabitacion(modelFactory);
        actualizarHabitacion(modelFactory);
        eliminarHabitacion(modelFactory);
    }

    private static void eliminarHabitacion(ModelFactory modelFactory) {
        int numero = 10;
        boolean result =   modelFactory.eliminarHabitacion(numero);
        if (result) System.out.println("Habitacion eliminada. ");
        else System.out.println("Habitacion no existente.  ");
    }

    private static void crearHabitacion(ModelFactory modelFactory) {
        int numero = 10;
        double precio = 78000;

        boolean result = modelFactory.crearHabitacion(numero, precio, TipoHabitacion.SIMPLE);
        if (result) System.out.println("Habitacion creada. ");
        else System.out.println("Habitacion existente.  ");
    }

    private static void actualizarHabitacion(ModelFactory modelFactory) {
        int numero = 5;
        int numeroNuevo = 17;
        double precio = 170000.0;

        boolean result = modelFactory.actualizarHabitacion(numero, numeroNuevo, precio, TipoHabitacion.DOBLE);
        if (result) System.out.println("Habitacion actualizada");
        else System.out.println("Habitacion no existente ");

    }

    private static void crudCliente(ModelFactory modelFactory) {
        crearCliente(modelFactory);
        eliminarCliente(modelFactory);
        actualizarCliente(modelFactory);
     }


    private static void actualizarCliente(ModelFactory modelFactory) {
        String nombre = "Josue";
        String id = "1234";
        String idNuevo = "234";
        boolean result = modelFactory.actualizarCliente(nombre, id, idNuevo);
        if (result) System.out.println("Cliente ha sido modificado exitosamente. ");
        else System.out.println("Cliente no existe. ");
    }

    private static void eliminarCliente(ModelFactory modelFactory) {
        String id = "124";
        boolean result = modelFactory.eliminarCliente(id);
        if (result) System.out.println("Cliente ha sido eliminado exitosamente. ");
        else System.out.println("Cliente no existe. ");
    }

    private static void crearCliente(ModelFactory modelFactory) {
        String nombre = "Jose";
        String id = "1234";
        boolean result = modelFactory.crearCliente(nombre, id);
        if (result) System.out.println("Cliente creado exitosamente. ");
        else System.out.println("Cliente no ha sido creado. ");
    }

    private static void ingresosActuales(ModelFactory modelFactory) {
        modelFactory.ingresosActuales();
    }

    public static void reservaIntervalosFechas(ModelFactory modelFactory) {
        Calendar calendarInstance = Calendar.getInstance();
        calendarInstance.set(2024, Calendar.AUGUST, 4);
        Date fechaInicial = calendarInstance.getTime();
        calendarInstance.set(2024, Calendar.AUGUST, 11);
        Date fechaFinal = calendarInstance.getTime();
        modelFactory.reservaIntervalosFechas(fechaInicial, fechaFinal);
    } 
    public static void reservasCliente(ModelFactory modelFactory) {
        String id = "1004";
        modelFactory.reservasCliente(id);
    }
}