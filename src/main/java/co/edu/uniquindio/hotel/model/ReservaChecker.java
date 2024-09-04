package co.edu.uniquindio.hotel.model;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class ReservaChecker implements IAvisoTresDias{

    public boolean esDentroDeTresDias(Reserva reserva) {
        Date hoy = new Date();
        long diffInMillis = reserva.getFechaEntrada().getTime() - hoy.getTime();
        long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
        return diffInDays <= 3 && diffInDays >= 0;
    }
}
