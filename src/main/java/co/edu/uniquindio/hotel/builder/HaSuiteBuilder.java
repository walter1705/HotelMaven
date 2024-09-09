package co.edu.uniquindio.hotel.builder;

import co.edu.uniquindio.hotel.model.HaSuite;

public class HaSuiteBuilder extends HabitacionBuilder<HaSuiteBuilder>{
    protected HaSuiteBuilder self() {
        return this;
        }
    
    @Override
    public HaSuite build() {
        return new HaSuite(numero, precio);
        }
}
