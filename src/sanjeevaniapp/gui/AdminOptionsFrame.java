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
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptionsFrame
     */
    public AdminOptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblgreet2.setText("USER-"+UserProfile.getUserName());
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblManageDoc = new javax.swing.JLabel();
        lblViewPati = new javax.swing.JLabel();
        lblManageEmp = new javax.swing.JLabel();
        lblManageRec = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblgreet2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("     Sanjeevani Application");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 470, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setToolTipText("");
        jLabel3.setMaximumSize(new java.awt.Dimension(1222, 500));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 1070, 430));

        jPanel3.setBackground(new java.awt.Color(209, 209, 247));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Admin Panel");

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(51, 102, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 14, -1, -1));

        lblManageDoc.setBackground(new java.awt.Color(196, 179, 179));
        lblManageDoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManageDoc.setText("            MANAGE DOCTORS");
        lblManageDoc.setOpaque(true);
        lblManageDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageDocMouseClicked(evt);
            }
        });
        jPanel3.add(lblManageDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 116, 233, 57));

        lblViewPati.setBackground(new java.awt.Color(196, 179, 179));
        lblViewPati.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblViewPati.setText("               VIEW PATIENTS");
        lblViewPati.setOpaque(true);
        lblViewPati.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewPatiMouseClicked(evt);
            }
        });
        jPanel3.add(lblViewPati, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 223, 233, 57));

        lblManageEmp.setBackground(new java.awt.Color(196, 179, 179));
        lblManageEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManageEmp.setText("         MANAGE EMPLOYEES");
        lblManageEmp.setOpaque(true);
        lblManageEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageEmpMouseClicked(evt);
            }
        });
        jPanel3.add(lblManageEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 116, 233, 57));

        lblManageRec.setBackground(new java.awt.Color(196, 179, 179));
        lblManageRec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManageRec.setText("     MANAGE RECEPTIONISTS");
        lblManageRec.setOpaque(true);
        lblManageRec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageRecMouseClicked(evt);
            }
        });
        jPanel3.add(lblManageRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 223, 233, 57));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 14, 241, 177));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hello,");

        lblgreet2.setBackground(new java.awt.Color(0, 0, 0));
        lblgreet2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblgreet2.setForeground(new java.awt.Color(255, 255, 255));
        lblgreet2.setText("       USER-SACHIN");
        lblgreet2.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblgreet2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblgreet2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 198, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 1060, 310));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -5, 1090, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageEmpMouseClicked
        ManageEMmployeeFrame m= new ManageEMmployeeFrame();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblManageEmpMouseClicked

    private void lblManageDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageDocMouseClicked
        MangaeDoctorFrame f = new MangaeDoctorFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblManageDocMouseClicked

    private void lblManageRecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageRecMouseClicked
        ManageReceptionistFrame f= new ManageReceptionistFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblManageRecMouseClicked

    private void lblViewPatiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewPatiMouseClicked
        ViewAllPatientDetailOptionFrame f = new ViewAllPatientDetailOptionFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblViewPatiMouseClicked

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblManageDoc;
    private javax.swing.JLabel lblManageEmp;
    private javax.swing.JLabel lblManageRec;
    private javax.swing.JLabel lblViewPati;
    private javax.swing.JLabel lblgreet2;
    // End of variables declaration//GEN-END:variables
}