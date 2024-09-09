package co.edu.uniquindio.hotel;

import co.edu.uniquindio.hotel.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.builder.HaDobleBuilder;
import co.edu.uniquindio.hotel.builder.HaSimpleBuilder;
import co.edu.uniquindio.hotel.factory.ModelFactory;
import co.edu.uniquindio.hotel.model.*;

import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        reservaIntervalosFechas(modelFactory);
        reservasCliente(modelFactory);
        ingresosActuales(modelFactory);
        crudCliente(modelFactory);
        crudHabitacionSimple(modelFactory);
        crudReserva(modelFactory);
    }

    private static void crudReserva(ModelFactory modelFactory) {
        crearReserva(modelFactory);
        eliminarReserva(modelFactory);
        actualizarReserva(modelFactory);
    }

    private static void actualizarReserva(ModelFactory modelFactory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarReserva'");
    }

    private static void eliminarReserva(ModelFactory modelFactory) {
        //uuuuuuuuuuuuuuu
    }

    private static void crearReserva(ModelFactory modelFactory) {
        Calendar calendarInstance = Calendar.getInstance();
        calendarInstance.set(2024, Calendar.AUGUST, 6);
        Date fechaInicial = calendarInstance.getTime();
        calendarInstance.set(2024, Calendar.AUGUST, 8);
        Date fechaFinal = calendarInstance.getTime();
        Cliente cliente = new ClienteBuilder().nombre("Jos").id("3443").build();
        HaDoble habitacionDoble = new HaDobleBuilder().numero(11).precio(55000).build();
        modelFactory.crearReserva(habitacionDoble, cliente, fechaInicial, fechaFinal);
    }

    private static void crudHabitacionSimple(ModelFactory modelFactory) {
        crearHabitacionSimple(modelFactory);
        actualizarHabitacionSimple(modelFactory);
        eliminarHabitacionSimple(modelFactory);
    }

    private static void eliminarHabitacionSimple(ModelFactory modelFactory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarHabitacion'");
    }

    private static void crearHabitacionSimple(ModelFactory modelFactory) {
        int numero = 15;
        double precio = 78000;
        modelFactory.crearHabitacionSimple(numero, precio);
    }

    private static void actualizarHabitacionSimple(ModelFactory modelFactory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarHabitacion'");
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