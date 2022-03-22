/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enciclopedia.libros;

import libro.componentes.Autor;
import libro.componentes.Editorial;

/**
 *
 * @author Ricardo
 */
public class Libro1 {
    private String titulo;
    private int noPaginas;
    private Autor autor;
    private Editorial editorial;

    public Libro1() {
    }

    public Libro1(String titulo, int noPaginas, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.noPaginas = noPaginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(int noPaginas) {
        this.noPaginas = noPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro1{" + "titulo=" + titulo + ", noPaginas=" + noPaginas + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
}
