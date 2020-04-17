/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controladores.controladorLogin;
import javax.swing.ImageIcon;
import Controladores.ControladorDoctor;
/**
 *
 * @author Alvaro
 */
public class Doctor extends javax.swing.JFrame {
private ControladorDoctor con;
   private RegPaciente rp = new RegPaciente(); 
   private HisMedico hm = new HisMedico();
   private CitasAgend ca = new CitasAgend();
    private void inicializarFormularios(){
        RP.setContentPane(rp);
        rp.setSize(500,500);
        RP.setSize(860,710);
        RP.setLocation(0,0);
        
        HM.setContentPane(hm);
        hm.setSize(500,500);
        HM.setSize(860,710);
        HM.setLocation(0,0);
         
        CA.setContentPane(ca);
        ca.setSize(500,500);
        CA.setSize(860,710);
        CA.setLocation(0,0);
        
     }
    public Doctor() {
        initComponents();
         con = new ControladorDoctor(this);
        this.inicializarFormularios();
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpEscritorio = new javax.swing.JDesktopPane();
        RP = new javax.swing.JInternalFrame();
        HM = new javax.swing.JInternalFrame();
        CA = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMrp = new javax.swing.JMenuItem();
        jMhm = new javax.swing.JMenuItem();
        jMca = new javax.swing.JMenuItem();
        jMsair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        RP.setClosable(true);
        RP.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        RP.setVisible(false);

        javax.swing.GroupLayout RPLayout = new javax.swing.GroupLayout(RP.getContentPane());
        RP.getContentPane().setLayout(RPLayout);
        RPLayout.setHorizontalGroup(
            RPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RPLayout.setVerticalGroup(
            RPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dpEscritorio.add(RP);
        RP.setBounds(0, 0, 0, 0);

        HM.setClosable(true);
        HM.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        HM.setVisible(false);

        javax.swing.GroupLayout HMLayout = new javax.swing.GroupLayout(HM.getContentPane());
        HM.getContentPane().setLayout(HMLayout);
        HMLayout.setHorizontalGroup(
            HMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HMLayout.setVerticalGroup(
            HMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dpEscritorio.add(HM);
        HM.setBounds(0, 0, 0, 0);

        CA.setClosable(true);
        CA.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        CA.setVisible(false);

        javax.swing.GroupLayout CALayout = new javax.swing.GroupLayout(CA.getContentPane());
        CA.getContentPane().setLayout(CALayout);
        CALayout.setHorizontalGroup(
            CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CALayout.setVerticalGroup(
            CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dpEscritorio.add(CA);
        CA.setBounds(0, 0, 0, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        dpEscritorio.add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 660);

        getContentPane().add(dpEscritorio);
        dpEscritorio.setBounds(0, 0, 880, 670);

        jMenu1.setText("Menu");

        jMrp.setText("Control medico");
        jMrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMrpActionPerformed(evt);
            }
        });
        jMenu1.add(jMrp);

        jMhm.setText("Historial clinico");
        jMhm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMhmActionPerformed(evt);
            }
        });
        jMenu1.add(jMhm);

        jMca.setText("Citas agendadas");
        jMca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcaActionPerformed(evt);
            }
        });
        jMenu1.add(jMca);

        jMsair.setText("Cerrar sesion");
        jMsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsairActionPerformed(evt);
            }
        });
        jMenu1.add(jMsair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMhmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMhmActionPerformed
        HM.setContentPane(hm);
        HM.setVisible(true);
        
    }//GEN-LAST:event_jMhmActionPerformed

    private void jMcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcaActionPerformed
        CA.setContentPane(ca);
        CA.setVisible(true);
        HM.setContentPane(hm);
        HM.setVisible(false);
    }//GEN-LAST:event_jMcaActionPerformed

    private void jMrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMrpActionPerformed
        RP.setContentPane(rp);
        RP.setVisible(true);
        CA.setContentPane(ca);
        CA.setVisible(false);
         
    }//GEN-LAST:event_jMrpActionPerformed

    private void jMsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsairActionPerformed
                
    }//GEN-LAST:event_jMsairActionPerformed
                

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JInternalFrame CA;
    public javax.swing.JInternalFrame HM;
    public javax.swing.JInternalFrame RP;
    public javax.swing.JDesktopPane dpEscritorio;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JMenuItem jMca;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMhm;
    public javax.swing.JMenuItem jMrp;
    public javax.swing.JMenuItem jMsair;
    // End of variables declaration//GEN-END:variables
}
