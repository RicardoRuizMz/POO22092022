/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Ricardo
 */
public interface Figura {
    // interface
    public static final float PI=3.1416F;
    public static final int Cuadrado=1;
    public static final int Circulo=2;
    public static final int Triangulo =3;
    public static final int Rectangulo=4;
    
    public abstract float calcularArea();
}
