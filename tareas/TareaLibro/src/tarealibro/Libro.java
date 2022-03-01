/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author Ricardo
 */
public class Libro {

    private String Titulo;
    private String Editorial;
    private Color color;
    private int Edicion;
    private int NumPag;

    public Libro() {
    }

    public Libro(String Titulo, String Editorial, Color color, int Edicion, int NumPag) {
        this.Titulo = Titulo;
        this.Editorial = Editorial;
        this.color = color;
        this.Edicion = Edicion;
        this.NumPag = NumPag;
    }

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }
    public void cerrar(){
        System.out.println("Cerrando libro " + this.Titulo);
    }
    public void abrir(){
        System.out.println("Abriendo libro "+ this.Titulo);
    }
}
