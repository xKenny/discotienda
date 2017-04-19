/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Johans Gonzalez
 */
public class Panel2 extends JPanel{
    
    private JLabel LArtista;
    private JComboBox CBArtista;
    private VentanaPrincipal ventana;
    
    public Panel2(VentanaPrincipal ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("Disco"));
         setLayout(null);
         
         LArtista = new JLabel("Artista: ");
         LArtista.setBounds(30, 30, 100, 20);
         add(LArtista);
         
         CBArtista = new JComboBox();
         CBArtista.addItem("SELECCIONE");
         CBArtista.setBounds(140, 30, 150, 20);
         add(CBArtista);
                  
    }
    
    public void actualizarArtista(String nombreArtista) {
        CBArtista.addItem(nombreArtista);
    }
    
}
