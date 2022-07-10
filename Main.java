import java.util.Scanner;
import java.util.ArrayList;
import Servicios.*;


class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //Mostrando el menu para clientes
      //Clientes.menu();

      System.out.println("+++++++ MENÚ +++++++\n1. Reservar Hospedaje\n2. Reservar transporte\n3. Reservar entretenimiento\n4. Pagar reserva\n5. Consultar reservas\n6. Salir\n");

      System.out.println("Elija una opción: ");
      int opcionMenu = sc.nextInt();

      switch(opcionMenu){
          case 1:
              System.out.println();
              //Cliente.reservarHospedaje()
              break;
          case 2:
              System.out.println();
              break;
          case 3:
              System.out.println();
              break;
          case 4:
              System.out.println();
              break;
          case 5:
              System.out.println();
              break;
          case 6:
              System.out.println();
              break;
          
      }

      //A continuacion lo que hace cliente.ReservarHospedaje(), analogo para los demas
      System.out.println("Ingrese fecha de entrada: ");
      String fechaE = sc.nextLine();
      System.out.println("Ingrese fecha de salida: ");
      String fechaS= sc.nextLine();

      System.out.println("\n¿Qué tipo de hospedaje busca?\n1. Hotel\n2. Departamento\n");

      int opcionTipoHospedaje = sc.nextInt();

      //PASARLO POR EL SWITCH A opcionTipoHospedaje, CASO 1: RESERVA DE HOTEL A CONTINUACION
      //ANÁLOGO PARA DEPARTAMENTO
      
      ArrayList<Hotel> hoteles =Hospedaje.generarHoteles();

      
      System.out.println("Ingrese el nombre de la ciudad donde se alojará");
      String ciudad = sc.nextLine();

      ArrayList<Hotel> hotelesDeCiudad = new ArrayList<Hotel>();

      for(Hotel hotel: hoteles){
          if(hotel.getDireccion() == ciudad){
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
      //Se crea el objeto de reserva con los datos del hotel y el cliente que pidio eso
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
}