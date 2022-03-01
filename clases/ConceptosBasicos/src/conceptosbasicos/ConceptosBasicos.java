/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Automovil;
import ico.fes.silla;
import java.awt.Color;

/**
 *
 * @author Ricardo
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        silla s1=new silla();
        System.out.println(s1);
        System.out.println(s1.toString());
        
        Automovil bocho=new Automovil();
        bocho.setMarca("VM");
        bocho.setSubMarca("Sedan");
        bocho.setModelo(1970);
        bocho.setColor(Color.blue);
        System.out.println(bocho);
        
        Automovil Mustang=new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(Mustang);
        
        Automovil Akura=new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(Akura);
    }
    
}
