package Administracion;
import java.util.ArrayList;

public class Cliente extends Usuario{

  private int tarjetaCredito;
  private TipoCliente tipo;
  private ArrayList<Servicio> serviciosSolicitados;


  // GETTERS Y SETTERS
  public int getTarjetaCredito(){
    return this.tarjetaCredito;
  }
  public void setTarjetaCredito(int tarjetaCredito){
    this.tarjetaCredito = tarjetaCredito;
  }

  public TipoCliente getTipo(){
    return this.tipo;
  }
  public void setTipo(TipoCliente tipo){
    this.tipo = tipo;
  }

  public ArrayList<Servicio> getServiciosSolicitados(){
    return this.serviciosSolicitados;
  }
  public void setServiciosSolicitados(ArrayList<Servicio> serviciosSolicitados){
    this.serviciosSolicitados = serviciosSolicitados;
  }
  

  
}