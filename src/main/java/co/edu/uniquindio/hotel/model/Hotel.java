package co.edu.uniquindio.hotel.model;

import co.edu.uniquindio.hotel.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.builder.HaSimpleBuilder;
import co.edu.uniquindio.hotel.builder.ReservaBuilder;
import co.edu.uniquindio.hotel.services.IClienteCrud;

import co.edu.uniquindio.hotel.services.IHabitacionSimpleCrud;
import co.edu.uniquindio.hotel.services.IReservaCrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class Hotel implements IClienteCrud, IReservaCrud, IHabitacionSimpleCrud {
    private List<Habitacion> listaHabitaciones = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        listaHabitaciones.add(habitacion);
    }
    public void agregarReserva(Reserva reserva) {
        listaReservas.add(reserva);
    }
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public List<Reserva> reservasIntervaloFechas(Date fechaInicial, Date fechaFinal) {
        List<Reserva> reservas = new ArrayList<>();
        for (Reserva reserva : listaReservas) {
            if (reserva.getFechaEntrada().after(fechaInicial) && reserva.getFechaSalida().before(fechaFinal))
                reservas.add(reserva);
        }
        //for para imprimir por consola que el metodo funciona
        System.out.println("Las reservas que se hicieron entre las fechas ingresadas fueron "+reservas.size()+":" );
        for (Reserva reserva : reservas) {
            System.out.println(reserva.toString());
        }

        return reservas;
    }
    public List<Reserva> reservasCliente(String id) {
        List<Reserva> reservas = new ArrayList<>();
        int tamanioListaReservas = listaReservas.size();
        for(int i = 0;i<tamanioListaReservas;i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getId().equals(id)) reservas.addAll(cliente.getReservasActivas());
        }
         //for para imprimir por consola que el metodo funciona
         System.out.println("Las reservas del cliente con id "+id+", fueron: "+reservas.size());
         for (Reserva reserva : reservas) {
             System.out.println(reserva.toString());
         }

        return reservas;
    }
    public double ingresosActuales() {
        double ingresos = 0;
        for (Reserva reserva : listaReservas) {
            ingresos += reserva.getHabitacion().getPrecio();
        }
        //System.out.println("Los ingresos totales del hotel son: "+ingresos+"$");
        return ingresos;
    }

    @Override
    public boolean crearCliente(String nombre, String id) {
        Cliente clienteExiste = obtenerCliente(id);
        if (clienteExiste == null) {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder.nombre(nombre).id(id).build();
            listaClientes.add(cliente);
            return true;
        }

        return false;
    }
    private Cliente obtenerCliente(String id) {
        Cliente cliente1 = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                cliente1 = cliente;
                break;
            }
        }

        return cliente1;
    }

    @Override
    public boolean eliminarCliente(String id) {
        Cliente clienteExiste = obtenerCliente(id);
        if(clienteExiste!=null){
            listaClientes.remove(clienteExiste);
            return true;
        }

        return false;
    }
    @Override
    public boolean actualizarCliente(String nombre, String id, String idNuevo) {
        Cliente clienteExiste = obtenerCliente(id);
        if (clienteExiste!=null) {
            for (Cliente cliente : listaClientes) {
                if (cliente.getId().equals(id)) {
                    ClienteBuilder clienteBuilder = new ClienteBuilder();
                    cliente = clienteBuilder.nombre(nombre).id(idNuevo).build();
                    return true;
                }
            }
        }

        return false;
    }

    private Reserva obtenerReserva(Habitacion habitacion) {
        Reserva reservaNew = new Reserva(null, null, null, null);
        for (Reserva reserva : listaReservas) {
            if (reserva.getHabitacion().equals(habitacion)) {
                reservaNew = reserva;
            }
        }

        return reservaNew;
    }
    @Override
    public boolean crearReserva(Habitacion habitacion, Cliente cliente, Date fechaEntrada, Date fechaSalida) {
        Reserva reservaNew = obtenerReserva(habitacion);
        if (reservaNew==null) return false;
        else listaReservas.add(new Reserva(habitacion, cliente, fechaEntrada, fechaSalida));

        return true;
    }
    @Override
    public boolean eliminarReserva(Habitacion habitacion) {
        Reserva reservaNew = obtenerReserva(habitacion);
        if (reservaNew==null) return false;
        else listaReservas.remove(reservaNew); 
        
        return true;
    }
    @Override
    public boolean actualizarReserva(Habitacion habitacion, Cliente cliente, Date fechaEntrada, Date fechaSalida,
            Habitacion habitacionNueva) {
        Reserva reservaNew = obtenerReserva(habitacion);
        if (reservaNew!=null) {
            for (Reserva reserva : listaReservas) {
                if (reservaNew.getHabitacion().equals(reserva.getHabitacion()) 
                && reservaNew.getFechaSalida().equals(reserva.getFechaSalida()) 
                && reservaNew.getFechaEntrada().equals(reserva.getFechaEntrada())) {
                    ReservaBuilder reservaBuilder = new ReservaBuilder();
                    reserva = reservaBuilder.habitacion(habitacionNueva)
                    .cliente(cliente)
                    .fechaEntrada(fechaEntrada)
                    .fechaSalida(fechaSalida)
                    .build();
                    return true;
                }
            }
        }
        return false;
    }

    public Habitacion obtenerHabitacion(int id) {
        Habitacion habitacion = null;
        for (Habitacion h : listaHabitaciones) {
            if (h.getNumero()==id) habitacion=h; 
        }

        return habitacion;
    }
    @Override
    public boolean crearHabitacionSimple(int numero, double precio) {
        Habitacion hExiste = obtenerHabitacion(numero);
        if (hExiste==null) return false;
        listaHabitaciones.add(new HaSimple(numero, precio)); 
        
        return true;
    }
    
    @Override
    public boolean eliminarHabitacionSimple(int numero) {
        Habitacion hExiste= obtenerHabitacion(numero);
        if (hExiste==null) return false;
        listaHabitaciones.remove(hExiste);

        return true;

    }
    @Override
    public boolean actualizarHabitacionSimple(int numero, int numeroNuevo, double precio) {
        Habitacion hExiste= obtenerHabitacion(numero);
        if (hExiste!=null) {
            for (Habitacion habitacion : listaHabitaciones) {
                if (habitacion.getNumero()==numero) {
                    habitacion = new HaSimpleBuilder().numero(numeroNuevo).precio(precio).build();
                    return true;
                }
            }
        }

        return false;
    }

    
}
