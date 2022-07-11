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

    public void setIdVehiculo(String id){
        this.idVehiculo = id;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String id){
        this.modelo = id;
    }

    public void setPlaca(String id){
        this.placa = id;
    }

    public void setColor(String id){
        this.color = id;
    }

    public void setAlquilerXdia(int id){
        this.alquilerXdia = id;
    }

    public void setEstado(Disponibilidad id){
        this.estado = id;
    }

    public void setCapacidad(int id){
        this.capacidad = id;
    }

    public void setTipoConduccion(TipoConduccion t){
        this.tipoConduccion = t;
    }
    
    

    public int getCapacidad(){
        return this.capacidad;
    }

    public Disponibilidad getEstado(){
        return this.estado;
    }
    
}
