package Hospedajes;

public class Departamento{

  private int numHabitaciones;
  private boolean inWifi;
  private boolean inPiscina;


  // GETTERS Y SETTERS
  public int getNumHabitaciones(){
    return this.numHabitaciones;
  }
  public void setNumHabitaciones(int numHabitaciones){
    this.numHabitaciones = numHabitaciones;
  }

  public boolean getInWifi(){
    return this.inWifi;
  }
  public void setInWifi(boolean inWifi){
    this.inWifi = inWifi;
  }

  public boolean getInPiscina(){
    return this.inPiscina;
  }
  public void setInPiscina(boolean inPiscina){
    this.inPiscina = inPiscina;
  }

  
  
}