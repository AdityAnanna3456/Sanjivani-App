/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sanjeevaniapp.pojo.UserProfile;

/**
 *
 * @author Ramkumar
 */
public class ReceptionistOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionistOptionsFrame
     */
    public ReceptionistOptionsFrame() {
        initComponents();
        lblgreet.setText("USER-"+UserProfile.getUserName());
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("src/sanjeevaniapp/icons/Logo4.png");    
        this.setIconImage(icon); 
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lblgreet = new javax.swing.JLabel();
        lblUpdatePatient = new javax.swing.JLabel();
        lblDeletePatient = new javax.swing.JLabel();
        lblAddPatient = new javax.swing.JLabel();
        lblViewPatient = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("     Sanjeevani Application");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 470, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setToolTipText("");
        jLabel3.setMaximumSize(new java.awt.Dimension(1222, 500));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1080, 430));

        jPanel3.setBackground(new java.awt.Color(209, 209, 247));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(51, 102, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        lblgreet.setBackground(new java.awt.Color(0, 0, 0));
        lblgreet.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblgreet.setForeground(new java.awt.Color(255, 255, 255));
        lblgreet.setText("       USER-SACHIN");
        lblgreet.setToolTipText("");
        jPanel1.add(lblgreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 202, 39));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 690, 60));

        lblUpdatePatient.setBackground(new java.awt.Color(0, 204, 204));
        lblUpdatePatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUpdatePatient.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdatePatient.setText("              Update Patient");
        lblUpdatePatient.setOpaque(true);
        lblUpdatePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdatePatientMouseClicked(evt);
            }
        });
        jPanel3.add(lblUpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 116, 233, 70));

        lblDeletePatient.setBackground(new java.awt.Color(0, 204, 204));
        lblDeletePatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDeletePatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDeletePatient.setText("                Delete Patient");
        lblDeletePatient.setOpaque(true);
        lblDeletePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeletePatientMouseClicked(evt);
            }
        });
        jPanel3.add(lblDeletePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 210, 233, 70));

        lblAddPatient.setBackground(new java.awt.Color(0, 204, 204));
        lblAddPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblAddPatient.setText("                 Add Patient");
        lblAddPatient.setOpaque(true);
        lblAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddPatientMouseClicked(evt);
            }
        });
        jPanel3.add(lblAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 116, 233, 70));

        lblViewPatient.setBackground(new java.awt.Color(0, 204, 204));
        lblViewPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblViewPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblViewPatient.setText("                 View Patient");
        lblViewPatient.setOpaque(true);
        lblViewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewPatientMouseClicked(evt);
            }
        });
        jPanel3.add(lblViewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 210, 233, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 241, 177));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Welcome Receptionist,");
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1060, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUpdatePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdatePatientMouseClicked
        UpdatePatientFrame f = new UpdatePatientFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblUpdatePatientMouseClicked

    private void lblDeletePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeletePatientMouseClicked
        RemovePatientFrame f = new RemovePatientFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblDeletePatientMouseClicked

    private void lblAddPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPatientMouseClicked
        AddPatientFrame f= new  AddPatientFrame();
        f.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblAddPatientMouseClicked

    private void lblViewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewPatientMouseClicked
        ViewAllPatientDetailOptionFrame f= new ViewAllPatientDetailOptionFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblViewPatientMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Are You Sure?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (ans==JOptionPane.YES_OPTION){
            LoginFrame f= new LoginFrame();
            f.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddPatient;
    private javax.swing.JLabel lblDeletePatient;
    private javax.swing.JLabel lblUpdatePatient;
    private javax.swing.JLabel lblViewPatient;
    private javax.swing.JLabel lblgreet;
    // End of variables declaration//GEN-END:variables
}