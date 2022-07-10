package Hospedajes;

public class Habitacion{


  private String codigo;
  private TipoHabitacion tipo;
  private double precio;
  private int capacidad;
  private int numHabitacion;
  private boolean estado;


  // GETTERS Y SETTERS
  public TipoHabitacion getTipo(){
    return this.tipo;
  }
  public void setTipo(TipoHabitacion tipo){
    this.tipo = tipo;
  }

  public double getPrecio(){
    return this.precio;
  }
  public void setPrecio(double precio){
    this.precio = precio;
  }

  public int getCapacidad(){
    return this.capacidad;
  }
  public void setCapacidad(int capacidad){
    this.capacidad = capacidad;
  }

  public int getNumHabitacion(){
    return this.numHabitacion;
  }
  public void setNumHabitacion(int numHabitacion){
    this.numHabitacion = numHabitacion;
  }

  public boolean getEstado(){
    return this.estado;
  }
  public void setEstado(boolean estado){
    this.estado = estado;
  }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }
  
  
  
}