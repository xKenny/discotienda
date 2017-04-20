/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class PanelCancion extends JPanel implements ActionListener{
   
    private JLabel Lartista, Lnombre, Ldisco, Lduracion;
    private JTextField txtNombre, Tduracion;
    private VentanaPrincipal ventana;
    private JComboBox CBArtista, CBDisco;
    private JButton BGuardar;
    private List<Cancion> listaCancion;
    private Cancion cancion;
    
    public PanelCancion(VentanaPrincipal ventana){
        this.ventana=ventana;
         setBackground(Color.red);
         setBorder(BorderFactory.createTitledBorder("Cancion"));
         setLayout(null);
         listaCancion = new ArrayList<Cancion>();
         
         
         Lartista = new JLabel("Artista:");
         Lartista.setBounds(30, 30, 80, 20);
         add(Lartista);
         
         CBArtista = new JComboBox();
         CBArtista.addItem("SELECCIONE");
         CBArtista.setBounds(120, 30, 150, 20);
         add(CBArtista);
         
          Ldisco = new JLabel("Disco:");
         Ldisco.setBounds(30, 60, 80, 20);
         add(Ldisco);
         
         CBDisco = new JComboBox();
         CBDisco.addItem("SELECCIONE");
         CBDisco.setBounds(120, 60, 150, 20);
         add(CBDisco);
         
         Lnombre = new JLabel("Nombre cancion:");
         Lnombre.setBounds(30, 90, 100, 20);
         add(Lnombre);
         
         txtNombre = new JTextField();
         txtNombre.setBounds(130,90,140,20);
         add(txtNombre);
         
         Lduracion = new JLabel("Duracion:");
         Lduracion.setBounds(30, 120, 80, 20);
         add(Lduracion);
         
         Tduracion = new JTextField();
         Tduracion.setBounds(120,120,150,20);
         add(Tduracion);
         
         BGuardar = new JButton("Crear Cancion");
         BGuardar.setBounds(80, 170, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);
    }
     public void actualizarArti(String nombreArtista) {
        CBArtista.addItem(nombreArtista);
    }
     public void actualizarDisco(String nombreDisco) {
        CBDisco.addItem(nombreDisco);
    }
     public void actionPerformed(ActionEvent e) {
         if(validarDatosArtista()){
             cancion = new Cancion(txtNombre.getText(), Float.parseFloat(Tduracion.getText()));
             listaCancion.add(cancion);
             JOptionPane.showMessageDialog(this, "Cancion creada.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
             vaciarDatos();
         }
     }
     private void vaciarDatos(){
         
         CBArtista.setSelectedIndex(0);
         CBDisco.setSelectedIndex(0);
         txtNombre.setText("");
         Tduracion.setText("");
    }
     private boolean validarDatosArtista() {
         if(CBArtista.getSelectedItem() == "SELECCIONE"){
             JOptionPane.showMessageDialog(this, "Debe seleccionar un ARTISTA.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false; 
         }else if(CBDisco.getSelectedItem() == "SELECCIONE"){
             JOptionPane.showMessageDialog(this, "Debe seleccionar un Disco.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false; 
         }else if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;
         }else if(Tduracion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar la duracion.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;
         }
         return true;
     }
}
