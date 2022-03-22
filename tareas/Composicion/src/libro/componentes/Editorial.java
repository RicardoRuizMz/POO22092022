/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes;

import java.awt.Color;

/**
 *
 * @author Ricardo
 */
public class Editorial {
    private String nombre;
    private Color color;

    public Editorial() {
    }

    public Editorial(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void imprimir(){
        System.out.println("Imprimiendo Editorial "+ this.nombre);
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", color=" + color + '}';
    }
    
    
}
