/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import Enciclopedia.libros.Libro1;
import Pelicula.funcion.Pelicula;

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
        Libro1 enciclopedia=new Libro1();
        System.out.println(enciclopedia);
        
        Pelicula peli1 =new Pelicula();
        System.out.println(peli1);
    }
    
}
