/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;


import ico.fes.herencia.Persona;
import ico.fes.herencia.Personas;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ricardo
 */
public class ModeloPersonaCombo implements ComboBoxModel<Personas> {
    private ArrayList<Personas> datos;
    private Personas selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Personas selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

//    @Override
//    public String toString() {
//        return "ModeloPersonaCombo{" + "datos=" + datos + ", selected=" + selected + '}';
//    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected=(Personas)o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        //regresara el nuemro de elementos a mostrar
        return datos.size();
    }

    @Override
    public Personas getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }

   public void consultarBaseDatos(){
   //Simnular una consulta a una BD
   datos=new ArrayList<Personas>();
   //conexion a BD
   //Consulta SQL
   datos.add(new Personas("Jose", 19));
   datos.add(new Personas("Maria", 21));
   datos.add(new Personas("Jesus", 33));
   datos.add(new Personas("Diana", 22));
   }
    
    
}
