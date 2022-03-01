/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import java.awt.Color;


/**
 *
 * @author Ricardo
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro Java=new Libro();
        Java.setTitulo("Java 2 Curso de programacion");
        Java.setEdicion(4);
        Java.setColor(Color.BLACK);
        Java.setEditorial("Alfaomega");
        Java.setNumPag(837);
        System.out.println("Titulo: "+ Java.getTitulo());
        System.out.println("Edicion: "+ Java.getEdicion());
        System.out.println("Editorial: "+Java.getEditorial());
        System.out.println("Numero de Paginas: "+ Java.getNumPag());
        System.out.println("Color: "+ Java.getColor());
        Java.abrir();
        Java.cerrar();
    }
    
}
