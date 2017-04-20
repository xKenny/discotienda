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
 * @author Johans Gonzalez
 */
public class Panel2 extends JPanel implements ActionListener{
    
    private JLabel LArtista, LNombre, Ldescrip, Lprecio;
    private JComboBox CBArtista;
    private JTextField Tnombre, Tdescrip, Tprecio;
    private VentanaPrincipal ventana;
    private JButton BGuardar;
    private List<Disco> listaDisco;
    private Disco disco;
    
    public Panel2(VentanaPrincipal ventana) {
         this.ventana = ventana;
         setBackground(new Color(75,96,112));
         setBorder(BorderFactory.createTitledBorder("Disco"));
         setLayout(null);
         listaDisco = new ArrayList<Disco>();
         
         LArtista = new JLabel("Artista: ");
         LArtista.setBounds(30, 30, 100, 20);
         add(LArtista);
         
         CBArtista = new JComboBox();
         CBArtista.addItem("SELECCIONE");
         CBArtista.setBounds(140, 30, 150, 20);
         add(CBArtista);
         
         LNombre = new JLabel("Nombre del disco");
         LNombre.setBounds(30, 60, 100, 20);
         add(LNombre);
         
         Tnombre = new JTextField();
         Tnombre.setBounds(140, 60, 150, 20);
         add(Tnombre);
         
         Ldescrip = new JLabel("Descripcion");
         Ldescrip.setBounds(30, 90, 100, 40);
         add(Ldescrip);
         
         Tdescrip = new JTextField();
         Tdescrip.setBounds(140, 90, 150, 40);
         add(Tdescrip);
         
         Lprecio = new JLabel("Precio");
         Lprecio.setBounds(30, 140, 100, 20);
         add(Lprecio);
         
         Tprecio = new JTextField();
         Tprecio.setBounds(140, 140, 150, 20);
         add(Tprecio);
         
         BGuardar = new JButton("Crear Disco");
         BGuardar.setBounds(80, 170, 150, 20);
         BGuardar.addActionListener(this);
         add(BGuardar);
         
         
                  
    }
    
    public void actualizarArtista(String nombreArtista) {
        CBArtista.addItem(nombreArtista);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(validarDatosArtista()){
            disco = new Disco(Tnombre.getText(),Tdescrip.getText(), Integer.parseInt(Tprecio.getText()));
            listaDisco.add(disco);
            JOptionPane.showMessageDialog(this, "Disco creado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
            this.ventana.getPanelCancion().actualizarDisco(disco.getNombre());
        }
    }
    private void vaciarDatos() {
        Tnombre.setText("");
        Tdescrip.setText("");
        Tprecio.setText("");
        CBArtista.setSelectedIndex(0);
    }
    private boolean validarDatosArtista() {
        if(CBArtista.getSelectedItem() == "SELECCIONE"){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un ARTISTA.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false; 
        }else if(Tnombre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(Tdescrip.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar la descripcion.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(Tprecio.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el precio.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
