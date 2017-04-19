/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Johans Gonzalez
 */
public class Panel3 extends JPanel implements ActionListener{
  
    JButton BVista;
    
    private DialogoVista dialog;
    private VentanaPrincipal ventana;
    
    public Panel3(VentanaPrincipal ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("General"));
         setLayout(null);
         
         BVista = new JButton("Ver Artistas");
         BVista.setFont(new Font("Serif", Font.BOLD, 18));
         BVista.addActionListener(this);
         BVista.setBounds(30, 30, 150, 20);
         add(BVista);
         
         dialog = new DialogoVista(this.ventana);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.actualizarTabla();
        dialog.setVisible(true);
    }
    
}
