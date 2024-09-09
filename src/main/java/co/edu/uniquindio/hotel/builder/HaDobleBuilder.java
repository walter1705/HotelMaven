package co.edu.uniquindio.hotel.builder;

import co.edu.uniquindio.hotel.model.HaDoble;


public class HaDobleBuilder extends HabitacionBuilder<HaDobleBuilder>{ 
    protected HaDobleBuilder self() {
        return this;
        }
    
    @Override
    public HaDoble build() {
        return new HaDoble(numero, precio);
        }
    
    
}
