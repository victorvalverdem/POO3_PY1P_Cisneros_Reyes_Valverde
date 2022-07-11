package Servicios;
import java.util.ArrayList;
public class Servicio {
    //private Cliente cliente;
    protected String ciudad;
    protected double valorPagar;
    protected double puntuacion;
    protected String idServicio;

    public void mostrarReserva(){
        //next
    }

    public void mostrarReserva(Hospedaje h){
        //next
    }

    public void mostrarReserva(Transporte t){
        //next
    }

    public void mostrarReserva(Entretenimiento e){
        //next
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }

    public ArrayList<Vehiculo> generarVehiculos(){
        
    }
    
    public ArrayList<Entretenimiento> generarPaquetes(){
        //1. ArrayList de String que recibe lo leido por la funcion lectora de archivos
        ArrayList<String> lineasPaquetes //= lo que recibe de la funcion lectora
        //2. Creacion de ArrayList que recibe los objetos de las clases pertinentes
        ArrayList<Entretenimiento> paquetes = new ArrayList<Entretenimiento>();
        //3. Por cada elemento String del arrayList de String
        for(String lineaPaquete:lineasPaquetes){
            String[] elementos = lineaPaquete.split("-");
            // idEntretenimiento-nombrePaquete-ciudad-descripcionPaquete-diasRecorrido
            String id = elementos[0];
            String nombre = elementos[1];
            String ciudad = elementos[2];
            String descripcion = elementos[3];
            String dias = elementos[4];
            //3.1 String[] y Split 3.2 Parseo y clasifico cada division de la linea[] 3.3 Creacion del objeto ENTRETENIMIENTO y seteo con lo clasificado
            Entretenimiento e = new Entretenimiento();
            e.setIdEntretenimiento(id);
            e.setNombrePaquete(nombre);
            e.setCiudad(ciudad);
            e.setDescripcion(descripcion);
            e.setDiasRecorrido(dias);

            paquetes.add(e);            
        }

        return paquetes;

        //3.4 Agregado el objeto creado o nutrido a la lista 2
        //5 Retorno de la lista llenada
    }
    
    
}
