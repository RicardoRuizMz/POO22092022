/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import Enciclopedia.libros.Libro1;
import Pelicula.componentes.Actor;
import Pelicula.componentes.Director;
import Pelicula.componentes.Productora;
import Pelicula.funcion.Pelicula;
import java.awt.Color;
import libro.componentes.Autor;
import libro.componentes.Editorial;

/**
 *
 * @author Ricardo
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro1 enciclopedia=new Libro1("El principito", 180,
                new Autor("Antonie", "de Saint"),
                new Editorial("Emece", Color.yellow));
        System.out.println(enciclopedia);
        
        Pelicula peli1 =new Pelicula("Spiderman", 128,
                new Director("Javier", "Martinez"),
                new Actor("Tom","Holland"),
                new Productora("Marvel", Color.yellow));
        System.out.println(peli1);
    }
    
}
