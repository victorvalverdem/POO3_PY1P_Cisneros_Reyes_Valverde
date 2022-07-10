package Servicios;
public class Entretenimiento{
    private String idEntretenimiento;
    private String nombrePaquete;
    private String ciudad;
    private String descripcionPaquete;
    private String diasRecorrido;
    public static int entretenimientosReservados;

    //Getters y setters respectivos
    public String getIdEntretenimiento(){
        return this.idEntretenimiento;
    }

    public String getNombrePaquete(){
        return this.nombrePaquete;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public String getDescripcionPaquete(){
        return this.descripcionPaquete;
    }

    public String getDiasRecorrido(){
        return this.diasRecorrido;
    }
    
}