/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class PanelTitulo extends JPanel{
    private JLabel titulo;
    private JLabel imagen;
    public PanelTitulo(){
        setBackground(Color.cyan);
        setLayout(null);
        ImageIcon icon = new ImageIcon("imagenes/images.PNG");
        imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setBounds(1, 1, 200, 100);
        add(imagen);
        titulo = new JLabel("DISCOTIENDA                   Duvan Poveda-David Jimenez");
        titulo.setFont(new Font("Tahoma",1,18));
        titulo.setBounds(400, 0, 500, 100);
        add(titulo);
    }
}
