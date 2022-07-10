package Servicios;
public class Vehiculo{
    private String idVehiculo;
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private int capacidad;
    private Disponibilidad estado;
    private double alquilerXdia;
    private TipoConduccion tipo;
    public static int transportesReservados;

    public void mostrarDatos(){
        //Next
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    public Disponibilidad getEstado(){
        return this.estado;
    }
    
}
