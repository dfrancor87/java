package model;
// Generated 25-abr-2018 16:42:23 by Hibernate Tools 4.3.1



/**
 * Direcion generated by hbm2java
 */
public class Direcion  implements java.io.Serializable {


     private int idProfesor;
     private String calle;
     private int numero;
     private String poblacion;
     private String provincia;

    public Direcion() {
    }

    public Direcion(int idProfesor, String calle, int numero, String poblacion, String provincia) {
       this.idProfesor = idProfesor;
       this.calle = calle;
       this.numero = numero;
       this.poblacion = poblacion;
       this.provincia = provincia;
    }
   
    public int getIdProfesor() {
        return this.idProfesor;
    }
    
    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }




}


