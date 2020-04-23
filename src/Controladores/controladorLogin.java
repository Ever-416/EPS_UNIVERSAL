
package Controladores;

import Formularios.Doctor;
import Formularios.EditInfo;
import Formularios.Login;
import Formularios.Paciente;
import Formularios.RegPaciente;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
    op.setVisible(true);
    op.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
    }
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
        Object ev=e.getSource();
        
       if (ev.equals(op.btt_Ing)) {
       Paciente Pc = new Paciente();    
       Pc.setVisible(true);
       op.dispose();
        }else if(ev.equals(op.btt_Cont)){
        
           if (op.RadSoli.isSelected()) {
           RegPaciente re = new RegPaciente();
           re.setLocationRelativeTo(null);
           re.setVisible(true);
          // op.setEnabled(false);
           
           }else if (op.RadMinfo.isSelected()) {
           EditInfo re = new EditInfo();
           JFrame op = new JFrame("Editar Información");
           op.setResizable(false);
           op.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           op.setSize(372, 448);
           op.add(re);
           op.setLocationRelativeTo(null);
           op.setVisible(true);
           }
           
        }      
    }
    
}
