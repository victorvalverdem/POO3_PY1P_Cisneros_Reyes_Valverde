package Hospedajes;
import java.util.ArrayList;

public class Hotel extends Hospedaje{

  private ArrayList<Habitacion> habitaciones;
  private String idHotel;
  private String nombre;
  private String direccion;
  private boolean inDesayuno;
  private boolean inParqueo; 
  private boolean inCancelFree;

    public Hotel(){
        //this.habitaciones = new ArrayList<Habitacion>();
    }
  // GETTERS Y SETTERS
  public ArrayList<Habitacion> getHabitaciones(){
    return this.habitaciones;
  }
  public void setHabitaciones(ArrayList<Habitacion> habitaciones){
    this.habitaciones = habitaciones;
  }

  public String getIdHotel(){
    return idHotel;
  }
  public void setIdHotel(String idHotel){
    this.idHotel = idHotel;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  public void setNombre(String nombre){
    this.nombre = idHotel;
  }

  public String getDireccion(){
    return this.nombre;
  }
  public void setDireccion(String direccion){
    this.direccion = direccion;
  }

  public boolean getInDesayuno(){
    return this.inDesayuno;
  }
  public void setInDesayuno(boolean inDesayuno){
    this.inDesayuno = inDesayuno;
  }

  public boolean getInParqueo(){
    return this.inParqueo;
  }
  public void setInParqueo(boolean inParqueo){
    this.inParqueo = inParqueo;
  }

  public boolean getInCancelFree(){
    return this.inCancelFree;
  }
  public void setInCancelFree(boolean inCancelFree){
    this.inCancelFree = inCancelFree;
  }

    public String toString(){
        String desayuno, parqueo, cancelar;
        if(this.inDesayuno){desayuno = "Si";}else{desayuno = "No";}
        if(this.inParqueo){parqueo="Si";}else{parqueo="No";}
        if(this.inCancelFree){cancelar="Si";}else{cancelar="No";}
        
        return "Dirección: " + this.direccion + "\nCosto por noche: "+ /*Costo por noche*/""+"\nEstrellas: "+this.puntuacion+"\nIncluye desayuno: " + desayuno + "\nIncluye parqueo: "+parqueo+"\nPermite cancelacion gratis: "+ cancelar;
    }

    

}