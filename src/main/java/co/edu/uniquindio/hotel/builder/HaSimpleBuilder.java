package co.edu.uniquindio.hotel.builder;

import co.edu.uniquindio.hotel.model.HaSimple;

public class HaSimpleBuilder extends HabitacionBuilder<HaSimpleBuilder>{
    protected HaSimpleBuilder self() {
        return this;
        }
    
    @Override
    public HaSimple build() {
        return new HaSimple(numero, precio);
        }
    
}
