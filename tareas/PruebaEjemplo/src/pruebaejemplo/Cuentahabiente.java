/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Ricardo
 */
public class Cuentahabiente {
    private String idCliente;
    private String nombre;
    private float banlance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, float banlance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.banlance = banlance;
    }

    public float getBanlance() {
        return banlance;
    }

    public void setBanlance(float banlance) {
        this.banlance = banlance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", banlance=" + banlance + '}';
    }
    
    public void retirarDinero( float monto ){
            //código para restarle el monto al balance
            System.out.println("Usted retiro $"+monto);
            banlance -=monto;
            System.out.println("Nuevo saldo $"+ banlance);
}
    
     public String evaluarNivelCliente(){
            /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
             return banlance < 50000 ? this.nombre + " Cliente REGULAR " : this.nombre + "Cliente PREMIUM ";
}
    
    
    
    
}
