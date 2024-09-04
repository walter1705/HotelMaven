package co.edu.uniquindio.hotel.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Servicio implements Iconsumible{

    private String nombre;



    public abstract void consumir();
}

