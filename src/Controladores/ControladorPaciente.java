/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Formularios.AgenCita;
import Formularios.EditInfo;
import Formularios.Paciente;
import Formularios.Login;
//import Formularios.ContMedico;
//import Formularios.HisMedico;
//import Formularios.CitasAgend;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.event.AncestorListener;
import javax.swing.event.InternalFrameListener;

public class ControladorPaciente implements ActionListener {
    
    private final Paciente op;
   
    
    
    public final void events(){
    op.jMcita.addActionListener(this);
    op.jMinfo.addActionListener(this);
    op.jMsair.addActionListener(this);
        
}
   public ControladorPaciente(Paciente vista){
    op=vista;
    events();
    op.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
    this.op.setLocation(200,200);
    this.op.setSize(800,720);
    op.setResizable(true);
    op.setTitle("Salud universal");
    op.setLocationRelativeTo(null);

    }
 JInternalFrame HM =new JInternalFrame("Editar Información", false, true);
 JInternalFrame Dk =new JInternalFrame("Agendar cita", false, true);
   @Override
    public void actionPerformed(ActionEvent e) {
        Object ev=e.getSource();
        
       if(ev.equals(op.jMcita)){
       if (!Dk.isVisible()) {
       AgenCita re = new AgenCita();  
       Dk.setSize(630, 549);
       Dk.setLocation(75,20);    
       Dk.setContentPane(re);
       op.Escritorio.add(Dk);
       Dk.setVisible(true);
           }
       
       }else if(ev.equals(op.jMinfo)){
           if (!HM.isVisible()) {
       EditInfo re = new EditInfo();  
       HM.setSize(368, 444);
       HM.setLocation(50,50);    
       HM.setContentPane(re);
       op.Escritorio.add(HM);
       HM.setVisible(true);
           }
       
       }else if(ev.equals(op.jMsair)) {
       Login dc = new Login();    
       dc.setVisible(true);
       op.dispose();
       
            }       
    }
    
}
