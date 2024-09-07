package co.edu.uniquindio.hotel;

import co.edu.uniquindio.hotel.factory.ModelFactory;

import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        reservaIntervalosFechas(modelFactory);
        reservasCliente(modelFactory);
        ingresosActuales(modelFactory);
        crudCliente(modelFactory);
    }

    private static void crudCliente(ModelFactory modelFactory) {
        crearCliente(modelFactory);
        eliminarCliente(modelFactory);
        actualizarCliente(modelFactory);
    }

    private static void actualizarCliente(ModelFactory modelFactory) {
        String nombre = "Josue";
        String id = "1234";
        boolean result = modelFactory.actualizarCliente(nombre, id);
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