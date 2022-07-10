package Administracion;

public abstract class Usuario{
  
  protected String cedula;
  protected String nombre;
  protected String apellido;
  protected String user;
  protected String contrasenia;
  protected String celular;
  protected int edad;

  public Usuario(String cedula,String nombre,String apellido,String user,String contrasenia,String celular,int edad){

    this.cedula = cedula;
    this.nombre = nombre;
    this.apellido = apellido;
    this.user = user;
    this.contrasenia = contrasenia;
    this.celular  = celular;
    this.edad = edad;
  }

  // GETTERS Y SETTERS
  public String getCedula(){
    return this.cedula;
  }
  public void setCedula(String cedula){
    this.cedula = cedula;
  }

  public String getNombre(){
    return this.nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getApellido(){
    return this.apellido;
  }
  public void setApellido(String apellido){
    this.apellido = apellido;
  }

  public String getUser(){
    return this.user;
  }
  public void setUser(String user){
    this.user = user;
  }

  public String getcontrasenia(){
    return this.contrasenia;
  }
  public void setContrasenia(String contrasenia){
    this.contrasenia = contrasenia;
  }

  public String getCelular(){
    return this.celular;
  }
  public void setCelular(String celular){
    this.celular = celular;
  }

  public int getEdad(){
    return this.edad;
  }
  public void setEdad(int edad){
    this.edad = edad;
  }


  public abstract void consultarReservas();

  
}