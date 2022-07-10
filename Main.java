import java.util.Scanner;
import java.util.ArrayList;
import Servicios.*;
import Hospedajes.*;
import Administracion.*;


class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("+++++++ MENÚ +++++++\n1. Reservar Hospedaje\n2. Reservar transporte\n3. Reservar entretenimiento\n4. Pagar reserva\n5. Consultar reservas\n6. Salir\n");

      System.out.println("Elija una opción: ");
      int opcionMenu = sc.nextInt();

      //Decidir si los casos se quedan estáticos o de instancia asociados a un cliente, dependiendo de cómo se ha definido el objeto cliente
      //Falta el ejercicio de DO WHILE para mostrarle las opciones de nuevo una vez haga la reserva
      switch(opcionMenu){
          case 1:
              Cliente.reservarHospedaje();
              break;
          case 2:
              Cliente.reservarTransporte();
              break;
          case 3:
              //Cliente.reservarEntretenimiento();
              break;
          case 4:
              //Cliente.pagarReserva();
              break;
          case 5:
              //Cliente.consultarReserva();
              break;
          case 6:
              System.out.println("¡Gracias por utilizar el servicio!");
              break;
          
        }

      
    sc.close();
  }
}