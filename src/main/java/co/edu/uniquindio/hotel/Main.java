package co.edu.uniquindio.hotel;

import co.edu.uniquindio.hotel.factory.ModelFactory;
import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        reservaIntervalosFechas(modelFactory);
    }

    public static void reservaIntervalosFechas(ModelFactory modelFactory) {
        Calendar calendarInstance = Calendar.getInstance();
        calendarInstance.set(2024, Calendar.AUGUST, 4);
        Date fechaInicial = calendarInstance.getTime();
        calendarInstance.set(2024, Calendar.AUGUST, 11);
        Date fechaFinal = calendarInstance.getTime();
        modelFactory.reservaIntervalosFechas(fechaInicial, fechaFinal);
    } 
}