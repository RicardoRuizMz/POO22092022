/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author Ricardo
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista{
   private String carrera;
   private String numeroCuenta;
   private String disiplinaDeportiva;
   private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, String disiplinaDeportiva, String generoArtistico) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.disiplinaDeportiva = disiplinaDeportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDisiplinaDeportiva() {
        return disiplinaDeportiva;
    }

    public void setDisiplinaDeportiva(String disiplinaDeportiva) {
        this.disiplinaDeportiva = disiplinaDeportiva;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "carrera=" + carrera + ", numeroCuenta=" + numeroCuenta + ", disiplinaDeportiva=" + disiplinaDeportiva + ", generoArtistico=" + generoArtistico + '}';
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre + "Esta entrenando " + this.disiplinaDeportiva);
    }

    @Override
    public void juagar() {
        System.out.println(this.nombre + "esta jugamdo "+ this.disiplinaDeportiva);
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre+ "Esta ensayando/ practicando"+ this.generoArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre+"Esta presentando su obra de "+ this.generoArtistico);
    }
   
   
    
}
