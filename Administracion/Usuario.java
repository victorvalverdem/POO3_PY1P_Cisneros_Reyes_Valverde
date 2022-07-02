package Administracion;

public class Usuario{
  
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


  //public abstract void consultarReservas();
  
  
}