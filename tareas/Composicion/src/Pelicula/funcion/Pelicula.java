/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula.funcion;

import Pelicula.componentes.Director;
import Pelicula.componentes.Productora;
import libro.componentes.Autor;

/**
 *
 * @author Ricardo
 */
public class Pelicula {
    private String titulo;
    private int duracion;
    private Director director;
    private Autor autor;
    private Productora productora;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, Director director, Autor autor, Productora productora) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.autor = autor;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", director=" + director + ", autor=" + autor + ", productora=" + productora + '}';
    }
    
    
    
}
