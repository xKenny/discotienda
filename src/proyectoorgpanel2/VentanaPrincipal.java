/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Johans Gonzalez
 */
public class VentanaPrincipal extends JFrame{
    
    private PanelTitulo panelTitulo;
    private Panel1 panel1;
    private Panel2 panel2;
    private PanelCancion panelCancion;
    private Panel3 panel3;
        
    public VentanaPrincipal() {
        setSize(900, 600);
        setTitle("Discotienda");
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        panelTitulo = new PanelTitulo();
        panelTitulo.setBounds(0,0,1000,100);
        add(panelTitulo);
        
        panel1 = new Panel1(this);
        panel1.setBounds(0, 370, 300, 200);
        add(panel1);
        
        panel2 = new Panel2(this);
        panel2.setBounds(305, 370, 300, 200);
        add(panel2);
        
        panelCancion = new PanelCancion(this);
        panelCancion.setBounds(610,370,300,200);
        add(panelCancion);
        
        panel3 = new Panel3(this);
        panel3.setBounds(0, 150, 200, 200);
        add(panel3);
        
        setVisible(true);
    }

    public Panel1 getPanel1() {
        return panel1;
    }

    public Panel2 getPanel2() {
        return panel2;
    }

    public Panel3 getPanel3() {
        return panel3;
    }

    public PanelCancion getPanelCancion() {
        return panelCancion;
    }
    
   

}
