/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=20;
        System.out.println("Edad ="+edad);
        Integer edad2=new Integer(22);
        System.out.println(edad2);
        double x=edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("_________________________________________");
        //convertir string a entero.
        String cadena="99";
        int altura= Integer.parseInt(cadena);//metodo miembro o metodo clase
        Color c1=Color.BLUE; // atributo miembro o atributo clase
        altura+=1;
        System.out.println("Altura = "+altura);
        
        float y=Float.parseFloat(cadena);
        y=y+0.5f;
        System.out.println("Altura = "+ y);
        
        System.out.println("---------------------------------------------------------------");
        Arbol tree1=new Arbol(2.4f, 15);
        Arbol tree2=new Arbol(2.4f, 15);
        Arbol tree3=new Arbol(2.4f, 15);
        Arbol tree4=new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol ="+Arbol.tronco);
        System.out.println("Troncos de un arbol ="+tree1.tronco);
        System.out.println("Troncos de un arbol ="+tree2.tronco);
        System.out.println("Troncos de un arbol ="+tree3.tronco);
        
        Arbol.generaroxigeno();
        
        // JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE );
        
        //codigo sin operador ternario
        int edad3=15;
        //validar si es mayor de edad
        String resultado="";
        if (edad3<18)
        {
            resultado="Menor de edad";
            
        }else{
            resultado="Mayor de edad,ten un tequila para la garganta";
        }
        System.out.println(resultado);
        

        //codigo con operador ternario
        //<cond>?<True>: <False>;
        
        
        int edad4=24;
        String res="";
        res= edad4<18? "Menor de edad, edad 4" :"Mayor de edad, tequila";
        System.out.println(res);
        
        //mejor usar el ternario
        
        //version minima
        int edad5=19;
        System.out.println(edad5 <18? "Menor de edad 5" :"Ya! el tequila");
        
        //siguiente
        int val1=1;
        int val2=2;
        //haremos una comparacion a nivel de bits es decir
        /*
        val1= 0000...0001;
        val2= 0000...0010;
        Estan deacuerdo que las dos lineas de arriba es la 
        representacion a nivel bits??
        Pregunta 1 or 0?? cuanto es?
        Entonces vean como funciona or a nivel de bits
        */
        System.out.println(val1|val2);
        /*
        Que esta pasando? esto:
        val1= 0000...0001;
        or
        val2= 0000...0010;
        ---------------------
              0000...0011  => 3
        
        
        */
        int val3=1;
        int val4=0;
        val4=val3 <<1;// el segundo valor es el 
        //numero de desplazamientos a la izq. a nivel bits
        System.out.println(val4);//tiene que dar 2
        
        System.out.println("============= ARREGLOS ==========");
        
        int[] edades;//primero se declara que sera un arreglo
        //en este punto aun no se reserva la memoria
        // hasra el segundo paso es reservarlo de un tamaño en especifico
        
        edades= new int [5];
        System.out.println(edades);
        edades[0]=10;
        System.out.println("La primer edad es: "+edades[0]);
        
        //declarar e inicializar en una sola linea
        int[] estaturas =new int[5];
        int[] pesos ={86,99,56,76,77}; //en kilos
        //imprimieremos el contenido
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        System.out.println("Con for_________________");
        for(int i = 0; i< pesos.length; i++){
            System.out.println(pesos[i]);
        }
        
        
        System.out.println("Arreglo de alumnos-----------");
        Alumno[] lista=new Alumno[5]; //5 lumnos
        lista[0] = new Alumno("99999", 2, 9.0f);
        lista[1] = new Alumno("77777", 2, 7.0f);
        lista[2] = new Alumno("55555", 2, 7.0f);
        lista[3] = new Alumno("88888", 2, 8.0f);
        lista[4] = new Alumno("66666", 2, 6.0f);
        
        for(int i = 0;i < lista.length;i++){
            Alumno alumno=lista[i];
            System.out.println(alumno.evaluarDesempeño() );
        }
        System.out.println("Con each--------------");
        
        for (Alumno alumno : lista){
            System.out.println(alumno.evaluarDesempeño() );
        }
        
        ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
        grupo2209.add(new Alumno("99999", 2, 9.0f));
        grupo2209.add(new Alumno("88888", 2, 8.0f));
        grupo2209.add(new Alumno("77777", 2, 7.0f));
        grupo2209.add(new Alumno("66666", 2, 6.0f));
        grupo2209.add(new Alumno("55555", 2, 5.0f));
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
            
        }
        System.out.println("ADD indide--------");
        grupo2209.add(2,new Alumno("81111", 3, 9.9f));
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
            
        }
        Alumno tmp = grupo2209.get(3);
        System.out.println("Alumno en index = 1:"+tmp);
        
        System.out.println("Eliminar el index 3");
        Alumno tmp2=grupo2209.remove( 3);
        System.out.println("Elemento sacado = "+tmp2);
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        System.out.println("Remplasar el i-esimo elemento______________");
        Alumno tmp3=grupo2209.set(0, new Alumno("44444", 4, 4.0f));
        System.out.println("El sacado es ="+tmp3);
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        System.out.println("Excepciones--------------------------");
        //Exepciones
        //trycatch + TAB
        try {
            System.out.println(grupo2209.get(20));
        } catch (Exception e) {
            System.out.println("Error... revisa los indices");
        }
        System.out.println("Fin del programa");
        
    }
    
}
