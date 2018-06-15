package modelo;
// Generated 29-abr-2018 1:28:17 by Hibernate Tools 4.3.1

/**
 * Pelicula generated by hbm2java
 */
public class Pelicula implements java.io.Serializable {

    private Integer id;
    private String nombrePelicula;
    private Personaje personaje;

    public Pelicula() {
    }

    public Pelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Pelicula(String nombrePelicula, Personaje personaje) {
        this.nombrePelicula = nombrePelicula;
        this.personaje = personaje;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePelicula() {
        return this.nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

}
