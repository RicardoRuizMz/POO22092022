/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author Ricardo
 */
public class Procesador {
    private String marca;
    private float frecueciaEnGhz;

    public Procesador() {
    }

    public Procesador(String marca, float frecueciaEnGhz) {
        this.marca = marca;
        this.frecueciaEnGhz = frecueciaEnGhz;
    }

    public float getFrecueciaEnGhz() {
        return frecueciaEnGhz;
    }

    public void setFrecueciaEnGhz(float frecueciaEnGhz) {
        this.frecueciaEnGhz = frecueciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecueciaEnGhz=" + frecueciaEnGhz + '}';
    }
    
}
