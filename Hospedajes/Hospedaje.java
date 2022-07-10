package Hospedajes;
import java.util.Date;
import java.util.ArrayList;
import Hospedajes.Hotel;

public class Hospedaje extends Servicio {
    protected Date fechaEntrada;
    protected Date fechaSalida;
    public static int hospedajesReservados;

    public static ArrayList<Hotel> generarHoteles(){
        //1. LEEMOS EL ARCHIVO HOTEL y lo guardamos en ArrayList que almacena String
        ArrayList<String> lineasHoteles = new ArrayList<String>(); //= LO QUE RETORNA EL ARCHIVO DE LECTURA
        //Revisar si clases de lectura contienen como quitar el encabezado
        lineasHoteles.add("Ecuador");

        ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
        
        for(String lineaHotel: lineasHoteles){
            String[] elementos = lineaHotel.split(",");
            
            String codigoHotel = elementos[0];
            String nombre = elementos[1];
            int rating = Integer.parseInt(elementos[2]);
            String direccion = elementos[3];
            Boolean desayuno = Boolean.parseBoolean(elementos[4]);
            Boolean parqueo = Boolean.parseBoolean(elementos[5]);
            Boolean cancelacion = Boolean.parseBoolean(elementos[6]);

            Hotel hotel = new Hotel();
            hotel.setIdHotel(codigoHotel);
            hotel.setNombre(nombre);
            hotel.setPuntuacion(rating);
            hotel.setDireccion(direccion);
            hotel.setInDesayuno(desayuno);
            hotel.setInParqueo(parqueo);
            hotel.setInCancelFree(cancelacion);

            hoteles.add(hotel);
        }


        //GENERAR AHORA LAS HABITACIONES, PARA LLENAR LOS OBJETOS HOTELES Y GENERAR LOS HOTELES LLENOS
        ArrayList<String> lineasHabitaciones = new ArrayList<String>(); //= LO QUE RETORNA EL ARCHIVO DE LECTURA DE HABITACIONES
        lineasHabitaciones.add("Ecuador"); //Cambiar una vez implementado clase lectora
        
        for(String lineaHabitacion: lineasHabitaciones){
            String[] elementos = lineaHabitacion.split(",");
            
            String codigo = elementos[0];
            String tipo = elementos[1];
            double precio = Double.parseDouble(elementos[2]);
            int capacidad = Integer.parseInt(elementos[3]);
            int numero = Integer.parseInt(elementos[4]);
            Boolean estado = Boolean.parseBoolean(elementos[5]);

            Habitacion h = new Habitacion();
            h.setCodigo(codigo);
            h.setTipo(tipo); //Arreglar tipo de dato correcto
            h.setPrecio(precio);
            h.setCapacidad(capacidad);
            h.setNumHabitacion(numero);
            h.setEstado(estado);

            boolean seguirBuscando=true;

            
            int i = 0;
            while(i<hoteles.size() && seguirBuscando){
                if(hoteles.get(i).getIdHotel().equals(h.getCodigo())){
                    hoteles.get(i).getHabitaciones().add(h);
                    seguirBuscando = false;                   
                }
                i++;
            }
        }      
        return hoteles;          
        
    }

    public static ArrayList<Departamento> generarDepartamentos(){
        
    }
}