package Servicios;
import java.util.ArrayList;

public class Hotel{

  private ArrayList<Habitacion> habitaciones;
  private String idHotel;
  private String nombre;
  private String direccion;
  private boolean inDesayuno;
  private boolean inParqueo; 
  private boolean inCancelFree;


  // GETTERS Y SETTERS
  public ArrayList<Habitacion> getHabitaciones(){
    return this.habitaciones;
  }
  public void setHabitaciones(ArrayList<Habitaciones> habitaciones){
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
  public void setInDesayuno(boolean inParqueo){
    this.inParqueo = inParqueo;
  }

  public boolean getInCancelFree(){
    return this.inCancelFree;
  }
  public void setInDesayuno(boolean inCancelFree){
    this.inCancelFree = inCancelFree;
  }



   
  
  
}