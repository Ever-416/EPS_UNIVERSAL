/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Formularios.Doctor;
import Formularios.Login;
import Formularios.ContMedico;
import Formularios.HisMedico;
import Formularios.CitasAgend;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.event.AncestorListener;
import javax.swing.event.InternalFrameListener;

public class ControladorDoctor implements ActionListener {
    
    private final Doctor op;
   
    
    
    public final void events(){
    op.jMsair.addActionListener(this);
    
}
   public ControladorDoctor(Doctor vista){
    op=vista;
    events();
    op.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
    this.op.setLocation(200,200);
    this.op.setSize(800,720);
    op.setResizable(true);
    op.setTitle("Salud universal");
    op.setLocationRelativeTo(null);

    }

   @Override
    public void actionPerformed(ActionEvent e) {
        Object ev=e.getSource();
        
       if (ev.equals(op.jMsair)) {
       Login dc = new Login();    
       dc.setVisible(true);
       op.dispose();
       
            }       
    }
    
}
