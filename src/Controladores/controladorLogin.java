
package Controladores;

import Formularios.Doctor;
import Formularios.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class controladorLogin implements ActionListener{

    private final Login op;
    
    
    public final void events(){
    op.btt_Ing.addActionListener(this);
    op.btt_Cont.addActionListener(this);
    }
    
    public controladorLogin(Login vista){
    op=vista;
    events();
    op.setTitle("Salud universal");
    op.setLocationRelativeTo(null);
    op.setLocation(450,250);
    op.setVisible(true);
    op.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
    }
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
        Object ev=e.getSource();
        
       if (ev.equals(op.btt_Ing)) {
       Doctor dc = new Doctor();    
       dc.setVisible(true);
       op.dispose();
        }else if(ev.equals(op.btt_Cont)){
        
        }       
    }
    
}
