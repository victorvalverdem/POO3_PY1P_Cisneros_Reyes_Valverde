package Administracion;
import java.util.ArrayList;
import Hospedajes.*;
import Servicios.*;
import manejoArchivos.ManejoArchivos;

public class Cliente extends Usuario{

  private int tarjetaCredito;
  private TipoCliente tipo;
  private ArrayList<Servicio> serviciosSolicitados;


  // GETTERS Y SETTERS
  public int getTarjetaCredito(){
    return this.tarjetaCredito;
  }
  public void setTarjetaCredito(int tarjetaCredito){
    this.tarjetaCredito = tarjetaCredito;
  }

  public TipoCliente getTipo(){
    return this.tipo;
  }
  public void setTipo(TipoCliente tipo){
    this.tipo = tipo;
  }

  public ArrayList<Servicio> getServiciosSolicitados(){
    return this.serviciosSolicitados;
  }
  public void setServiciosSolicitados(ArrayList<Servicio> serviciosSolicitados){
    this.serviciosSolicitados = serviciosSolicitados;
  }
  
    public static void reservarHospedaje(){
        //A continuacion lo que hace cliente.ReservarHospedaje(), analogo para los demas
      System.out.println("Ingrese fecha de entrada: ");
      String fechaE = sc.nextLine();
      System.out.println("Ingrese fecha de salida: ");
      String fechaS= sc.nextLine();

      System.out.println("\n¿Qué tipo de hospedaje busca?\n1. Hotel\n2. Departamento\n");

      int opcionTipoHospedaje = sc.nextInt();

      //PASARLO POR EL SWITCH A opcionTipoHospedaje, CASO 1: RESERVA DE HOTEL A CONTINUACION
      //ANÁLOGO PARA DEPARTAMENTO

        if(opcionTipoHospedaje == 1){
            ArrayList<Hotel> hoteles =Hospedaje.generarHoteles();

      
      System.out.println("Ingrese el nombre de la ciudad donde se alojará");
      String ciudad = sc.nextLine();

      ArrayList<Hotel> hotelesDeCiudad = new ArrayList<Hotel>();

      for(Hotel hotel: hoteles){
          if(hotel.getDireccion().contains(ciudad)){
              hotelesDeCiudad.add(hotel);
          }
      }

      System.out.println("Hoteles disponibles en "+ciudad+": ");
      for(int i=1;i<=hotelesDeCiudad.size();i++){
          System.out.println( i + ". "+ hotelesDeCiudad.get(i-1).getNombre() );
      }

      System.out.println("Seleccione una opción: ");
      int opcion = sc.nextInt();
      Hotel hotelElegido = hotelesDeCiudad.get(opcion-1);

      System.out.println("Mostrando datos del hotel "+hotelElegido.getNombre());
      System.out.println(hotelElegido);

      //metodoDeHabitaciones mostrando disponibilidad de lo mismo

      //VERIFICACION DE RESERVA, SOLO INFORMACION QUE SALE EN LA CAPTURA

      System.out.println("¿Desea reservar? (si/no): ");
      String opReserva = sc.nextLine();

      //si RESPONDE AFIRMATIVAMENTE
      //Se crea el objeto de reserva con los datos del hotel y el cliente que pidio eso y GUARDAMOS EN ARCHIVOS LOS DATOS DE RESERVA
      Reserva r = new Reserva();
      r.setIdReserva(/*VALOR ALEATORIO DE 4 DIGITOS*/);
      r.setFechaReserva(/*DATE ACTUAL*/);
      r.setFechaInicio(fechaE);
      r.setFechaFin(fechaS);
      r.setValorAPagar(/*CALCULEMOS*/);
        Cliente clienteReservador;
        Servicio servicioReservado;
        int valorPagar;
      //Si RESPONDE negativamente
      //SE DEVUELVE AL MENU INICIAL
            
        }
            else {   
        }
    }

    public static void reservarTransporte(){
        System.out.println("¿Desde qué fecha reservará el vehículo?: ");
        String fechaI = sc.nextLine();
        System.out.println("¿Hasta qué fecha reservará el vehículo?: ");
        String fechaF= sc.nextLine();
        /*
        códigoVehículo,marca,modelo,placa,color,capacidad,estado,costo por día,tipo transmision
9273,Hyundai,Creta,GJH-372,PLATA,5,DISPONIBLE,150.00,MANUAL
        */

        System.out.println("Digite el número de personas que viajarán en el vehículo (incluyéndose a usted): ");
        int capacidad = sc.nextInt();

        ArrayList<Vehiculo> listaDeVehiculos = Servicio.generarVehiculos();
        ArrayList<Vehiculo> vehiculosDisponibles = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo: listaDeVehiculos){
            if(vehiculo.getCapacidad() == capacidad && vehiculo.getEstado()== DISPONIBLE ){
                vehiculosDisponibles.add(vehiculo);
            }
        }

        System.out.println("Vehiculos disponibles en para su reserva: ");

        int i = 1;
        for(Vehiculo vehiculo:vehiculosDisponibles){
           System.out.println("OPCION #"+i); 
           System.out.println(vehiculo);
        }

        System.out.println("Seleccione una opción: ");
        int opcionVehiculo = sc.nextInt();
        Vehiculo vehiculoElegido = vehiculosDisponibles.get(opcionVehiculo-1);

        System.out.println("Usted ha elegido al siguiente vehículo:\n"+vehiculoElegido);

        //PROTOCOLO DE RESERVA

        
    }

    public static void reservarEntretenimiento(){
        ArrayList<Entretenimiento> paquetes = Servicio.generarPaquetes();
        System.out.println("Ingrese el nombre de la ciudad donde se alojará");
        String ciudad = sc.nextLine();

        ArrayList<Entretenimiento> paquetesDisponibles;

        for(Entretenimiento paquete:paquetes){
            if(paquete.getCiudad().equals(ciudad)){
                paquetesDisponibles.add(paquete);
            }
        }

        System.out.println("Paquetes disponibles de acuerdo a su ciudad: ");

        int i = 1;
        for(Entretenimiento paquete:paquetesDisponibles){
           System.out.println("OPCION #"+i); 
           System.out.println(paquete.getNombrePaquete());
            i++;
        }

        System.out.println("Seleccione una opción: ");
        int opcionPaquete = sc.nextInt();
        Entretenimiento paqueteElegido = paquetesDisponibles.get(opcionPaquete-1);

        System.out.println("Usted ha elegido al siguiente paquete:\n"+paqueteElegido);

        //PROTOCOLO DE RESERVA
        
    }




  private ArrayList<Usuario> generarUsuario(){
    
    ArrayList<String> lineasUsuarios = ManejoArchivos.LeeFichero("usuarios.txt"); 

    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    for(String lineaUsuario: lineasUsuarios){
            String[] elementos = lineaHotel.split(",");
            
            String codigoHotel = elementos[0];
            String nombre = elementos[1];
            int rating = Integer.parseInt(elementos[2]);
            String direccion = elementos[3];
            Boolean desayuno = Boolean.parseBoolean(elementos[4]);
            Boolean parqueo = Boolean.parseBoolean(elementos[5]);
            Boolean cancelacion = Boolean.parseBoolean(elementos[6]);


      
  }



  
  public boolean validarDatos(){

  }
  







  
}