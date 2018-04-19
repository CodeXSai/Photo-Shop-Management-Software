/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEndGUI;

import BackEndCode.CodeSet;
import BackEndCode.MySQLQueries;
import java.sql.Connection;
import javax.swing.JFrame;

/**
 *
 * @author Sai
 */
public class resetPass extends javax.swing.JFrame {
    
    /**
     * Creates new form delete
     */
    
    int mouseX;
    int mouseY;
    
    private static Connection conn = null;
    
    private static String id;
    
    private static boolean s;
    
    private static UpdateStatus frame;
    
    
    public resetPass(Connection conn, String id, JFrame frame) {
        this.conn = conn;
        this.frame = (UpdateStatus) frame;
        this.id = id;
        this.s = s;
        this.setUndecorated(true);
        this.setResizable(false);
        initComponents();
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
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        address = new javax.swing.JLabel();
        newP = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(59, 63, 66));
        jPanel9.setForeground(new java.awt.Color(59, 63, 66));
        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel9MouseDragged(evt);
            }
        });
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(171, 172, 173));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(171, 172, 173));
        jLabel2.setText("Password Reset");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        exit1.setBackground(new java.awt.Color(255, 0, 0));
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("X");
        exit1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jPanel9.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 47));

        address.setBackground(new java.awt.Color(59, 63, 66));
        address.setFont(address.getFont().deriveFont(address.getFont().getStyle() | java.awt.Font.BOLD, address.getFont().getSize()+2));
        address.setForeground(new java.awt.Color(59, 63, 66));
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Please enter the new password.");
        address.setAutoscrolls(true);
        address.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        address.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 270, -1));
        jPanel1.add(newP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 230, -1));

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        error.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        // TODO add your handling code here:
        frame.enable(true);
        this.dispose();
    }//GEN-LAST:event_exit1ActionPerformed

    private void jPanel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseDragged
        this.setLocation(evt.getXOnScreen() - mouseX, evt.getYOnScreen() - mouseY);
    }//GEN-LAST:event_jPanel9MouseDragged

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel9MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if(newP.getText() == null || newP.getText().isEmpty() || newP.getText().equals(" ")){
            error.setText("Please enter the valid password");
        } else {
            new MySQLQueries(conn).initPassword(id, newP.getText());
            frame.enable();
            frame.updateTable();
             this.dispose();
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resetPass(conn, id, new JFrame()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel error;
    private javax.swing.JButton exit1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField newP;
    // End of variables declaration//GEN-END:variables
}
