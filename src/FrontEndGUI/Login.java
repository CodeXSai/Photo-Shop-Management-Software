/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEndGUI;

import BackEndCode.ActiveDB;
import BackEndCode.Bootstrap;
import BackEndCode.CodeSet;
import BackEndCode.MySQLQueries;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;

/**
 *
 * @author Sai
 */
public class Login extends javax.swing.JFrame {

    private static Connection conn = null;

    private PreparedStatement pst = null;

    private ResultSet rs = null;
    
    private MySQLQueries SQuery = null;

    /**
     * Creates new form Login
     */
    public Login() {
        Bootstrap template = new Bootstrap();
        Toolkit windowSize = Toolkit.getDefaultToolkit();
        this.setUndecorated(true);
        this.setResizable(false);
        initComponents();
        this.setSize((int) windowSize.getScreenSize().getWidth(), (int) windowSize.getScreenSize().getHeight());
        conn = ActiveDB.initiate();
        SQuery = new MySQLQueries(conn); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        copyright = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        employeeLogin = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        text = new javax.swing.JLabel();
        Submit1 = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        copyright.setBackground(new java.awt.Color(171, 172, 173));
        copyright.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        copyright.setForeground(new java.awt.Color(171, 172, 173));
        copyright.setText("©  2018  CODEX");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 900, 110, -1));

        jPanel2.setBackground(new java.awt.Color(59, 63, 66));
        jPanel2.setForeground(new java.awt.Color(59, 63, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Untitled.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        username.setText("Username");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 460, 43));

        employeeLogin.setBackground(new java.awt.Color(171, 172, 173));
        employeeLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        employeeLogin.setForeground(new java.awt.Color(171, 172, 173));
        employeeLogin.setText("Employee Login");
        jPanel2.add(employeeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 206, -1));

        pass.setText("jPasswordField1");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 460, 38));

        text.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 181, 20));

        Submit1.setBackground(new java.awt.Color(171, 172, 173));
        Submit1.setForeground(new java.awt.Color(171, 172, 173));
        Submit1.setText("Forgot Password? Click Here.");
        Submit1.setBorderPainted(false);
        Submit1.setContentAreaFilled(false);
        Submit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Submit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });
        jPanel2.add(Submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 210, 42));

        Submit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Submit.setText("Login");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 660, 500));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/d.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/3840x2560-3020841-black-and-white_camera_olympus_technology.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2050, 1260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1919, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1919, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:

            if (SQuery.LoginStaff(username.getText(),pass.getText())) {
                CodeSet cs = SQuery.getCodeset();
                new Dashboard(conn,cs.getStaffDetails()).setVisible(true);
                this.dispose();
            } else {
                text.setText("Invalid username or password");
            }

    }//GEN-LAST:event_SubmitActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        // TODO add your handling code here:
        this.enable(false);
        new ForgotPassword(this).setVisible(true);
        

    }//GEN-LAST:event_Submit1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel employeeLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel text;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
