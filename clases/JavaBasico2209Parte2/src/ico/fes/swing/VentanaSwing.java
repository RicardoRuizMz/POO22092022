/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.herencia.Personas;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ricardo
 */
public class VentanaSwing extends JFrame{

    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<Personas> lista;
    private ModeloPersonaCombo modelo;
    private JTextArea texto;
    
    
    public VentanaSwing() throws HeadlessException {
        
        setTitle("Conversion de °C a °F");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+ "\\src\\ico\\fes\\swing\\carro.png");
        
        boton= new JButton(icono);
        boton.setBackground(Color.GREEN);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para convertir en F");
        resultado= new JLabel("°F");
        
        lista = new JComboBox();
        texto=new JTextArea(5, 20);
        /*
        lista.addItem("Ingenieria");
        lista.addItem("Derecho");
        lista.addItem("Periodismo");
        lista.addItem("Arquitectura");
        */
        modelo=new ModeloPersonaCombo();
        modelo.consultarBaseDatos();
        lista.setModel(modelo);
        
        this.getContentPane().add(lista);
        
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(texto);
        
        this.validate();
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("evento ..."+e.getItem());
                texto.setText(e.getItem()+"\n");
            }
            
        });
        
        //F = (c x 9/5) +32
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenhit = 8.0f;
                float Celcius = 0.0f;
                try {
                    Celcius=Float.parseFloat(cuadro.getText());
                    gradosFarenhit = (Celcius*(9.0f/5.0f))+32.0f;
                    resultado.setText(gradosFarenhit +"F");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Introduce un valor numerico", "Error de captura", JOptionPane.ERROR_MESSAGE);
                } finally {
                }
            }
        
        });
        
    }
    
    
}
