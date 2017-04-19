/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class PanelCancion extends JPanel{
    private JLabel Lnombre;
    private JTextField txtNombre;
    private VentanaPrincipal ventana;
    public PanelCancion(VentanaPrincipal ventana){
        this.ventana=ventana;
         setBorder(BorderFactory.createTitledBorder("Cancion"));
         setLayout(null);
         Lnombre = new JLabel("Nombre: ");
         Lnombre.setBounds(30, 30, 100, 20);
         add(Lnombre);
         txtNombre = new JTextField();
         txtNombre.setBounds(140, 30, 100, 20);
         add(txtNombre);
    }
}
