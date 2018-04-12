/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEndGUI;

import BackEndCode.CodeSet;
import BackEndCode.MySQLQueries;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.CheckBox;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.ListModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sai
 */
public class DPayment extends javax.swing.JFrame {

    /**
     * Creates new form staffAccount
     */
    private static Connection conn = null;

    private PreparedStatement pst = null;

    private ResultSet rs = null;

    private CodeSet codeset = null;

    private MySQLQueries SQuery = null;

    private String query;

    private static String s;

    private static String type;

    private static float f;

    private static int cid;

    private static JFrame frame;

    private static JFrame frame2;
    private static TableModel t;

    int mouseX;

    int mouseY;

    public DPayment(Connection conn, JFrame frame, JFrame frame2, float f, int cid, TableModel t) {
        this.f = f;
        this.t = t;
        this.cid = cid;
        this.conn = conn;
        this.frame = frame;
        this.frame2 = frame2;
        type = "Cash";
        this.setUndecorated(true);
        initComponents();
        SQuery = new MySQLQueries(conn);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        subtotal.setText(String.valueOf(f));
        vat.setText(String.format("%.02f", new CodeSet().calculateVAT(f) - f) + " (20%)");
        total.setText(String.format("%.02f", new CodeSet().calculateVAT(f)));
        total1.setText(String.format("%.02f", new CodeSet().calculateVAT(f)));
        card.setModel(new MySQLQueries(conn).populateCardList(cid));
        cashR.setSelected(true);
        cdR.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bevelBorder1 = (javax.swing.border.BevelBorder)javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED);
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        fName2 = new javax.swing.JLabel();
        fName4 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        fName6 = new javax.swing.JLabel();
        fName7 = new javax.swing.JLabel();
        vat = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fName9 = new javax.swing.JLabel();
        fName10 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        fName12 = new javax.swing.JLabel();
        cashR = new javax.swing.JRadioButton();
        cdR = new javax.swing.JRadioButton();
        Submit1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        total1 = new javax.swing.JLabel();
        fName5 = new javax.swing.JLabel();
        card = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(171, 172, 173));
        jLabel2.setText("Order Summary");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, -1));

        exit1.setBackground(new java.awt.Color(255, 0, 0));
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("X");
        exit1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jPanel9.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -10, -1, 40));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        fName2.setBackground(new java.awt.Color(59, 63, 66));
        fName2.setFont(fName2.getFont().deriveFont(fName2.getFont().getStyle() | java.awt.Font.BOLD, fName2.getFont().getSize()+2));
        fName2.setForeground(new java.awt.Color(59, 63, 66));
        fName2.setText("Subtotal");

        fName4.setBackground(new java.awt.Color(59, 63, 66));
        fName4.setFont(fName4.getFont().deriveFont(fName4.getFont().getStyle() | java.awt.Font.BOLD, fName4.getFont().getSize()+2));
        fName4.setForeground(new java.awt.Color(59, 63, 66));
        fName4.setText("£");

        subtotal.setBackground(new java.awt.Color(59, 63, 66));
        subtotal.setFont(subtotal.getFont().deriveFont(subtotal.getFont().getStyle() | java.awt.Font.BOLD, subtotal.getFont().getSize()+2));
        subtotal.setForeground(new java.awt.Color(59, 63, 66));
        subtotal.setText("Subtotal");

        fName6.setBackground(new java.awt.Color(59, 63, 66));
        fName6.setFont(fName6.getFont().deriveFont(fName6.getFont().getStyle() | java.awt.Font.BOLD, fName6.getFont().getSize()+2));
        fName6.setForeground(new java.awt.Color(59, 63, 66));
        fName6.setText("VAT");

        fName7.setBackground(new java.awt.Color(59, 63, 66));
        fName7.setFont(fName7.getFont().deriveFont(fName7.getFont().getStyle() | java.awt.Font.BOLD, fName7.getFont().getSize()+2));
        fName7.setForeground(new java.awt.Color(59, 63, 66));
        fName7.setText("£");

        vat.setBackground(new java.awt.Color(59, 63, 66));
        vat.setFont(vat.getFont().deriveFont(vat.getFont().getStyle() | java.awt.Font.BOLD, vat.getFont().getSize()+2));
        vat.setForeground(new java.awt.Color(59, 63, 66));
        vat.setText("VAT");

        fName9.setBackground(new java.awt.Color(59, 63, 66));
        fName9.setFont(fName9.getFont().deriveFont(fName9.getFont().getStyle() | java.awt.Font.BOLD, fName9.getFont().getSize()+2));
        fName9.setForeground(new java.awt.Color(59, 63, 66));
        fName9.setText("Total");

        fName10.setBackground(new java.awt.Color(59, 63, 66));
        fName10.setFont(fName10.getFont().deriveFont(fName10.getFont().getStyle() | java.awt.Font.BOLD, fName10.getFont().getSize()+2));
        fName10.setForeground(new java.awt.Color(59, 63, 66));
        fName10.setText("£");

        total.setBackground(new java.awt.Color(59, 63, 66));
        total.setFont(total.getFont().deriveFont(total.getFont().getStyle() | java.awt.Font.BOLD, total.getFont().getSize()+2));
        total.setForeground(new java.awt.Color(59, 63, 66));
        total.setText("Total");

        fName12.setBackground(new java.awt.Color(59, 63, 66));
        fName12.setFont(fName12.getFont().deriveFont(fName12.getFont().getStyle() | java.awt.Font.BOLD, fName12.getFont().getSize()+2));
        fName12.setForeground(new java.awt.Color(59, 63, 66));
        fName12.setText("Payment Type");

        cashR.setBackground(new java.awt.Color(153, 153, 153));
        cashR.setFont(cashR.getFont().deriveFont(cashR.getFont().getStyle() | java.awt.Font.BOLD));
        cashR.setForeground(new java.awt.Color(59, 63, 66));
        cashR.setText("Cash");
        cashR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRActionPerformed(evt);
            }
        });

        cdR.setBackground(new java.awt.Color(153, 153, 153));
        cdR.setFont(cdR.getFont().deriveFont(cdR.getFont().getStyle() | java.awt.Font.BOLD));
        cdR.setForeground(new java.awt.Color(59, 63, 66));
        cdR.setText("Credit/Debit");
        cdR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRActionPerformed(evt);
            }
        });

        Submit1.setBackground(new java.awt.Color(171, 172, 173));
        Submit1.setFont(Submit1.getFont().deriveFont(Submit1.getFont().getStyle() | java.awt.Font.BOLD, Submit1.getFont().getSize()+2));
        Submit1.setForeground(new java.awt.Color(59, 63, 66));
        Submit1.setText("+ Add Card");
        Submit1.setBorderPainted(false);
        Submit1.setContentAreaFilled(false);
        Submit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Submit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });

        jButton1.setText("Complete Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        total1.setBackground(new java.awt.Color(59, 63, 66));
        total1.setFont(total1.getFont().deriveFont(total1.getFont().getStyle() | java.awt.Font.BOLD, total1.getFont().getSize()+2));
        total1.setForeground(new java.awt.Color(59, 63, 66));
        total1.setText("Total");

        fName5.setBackground(new java.awt.Color(59, 63, 66));
        fName5.setFont(fName5.getFont().deriveFont(fName5.getFont().getStyle() | java.awt.Font.BOLD, fName5.getFont().getSize()+2));
        fName5.setForeground(new java.awt.Color(59, 63, 66));
        fName5.setText("£");

        card.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        card.setSelectedIndex(2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(fName5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(cashR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cdR)
                                    .addComponent(fName12))
                                .addGap(0, 237, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Submit1))
                            .addComponent(card, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(fName6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(fName7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(fName2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(fName4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(fName9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(fName10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName2)
                    .addComponent(fName4)
                    .addComponent(subtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName6)
                    .addComponent(fName7)
                    .addComponent(vat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName9)
                    .addComponent(fName10)
                    .addComponent(total))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fName12)
                .addGap(18, 18, 18)
                .addComponent(cashR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName5)
                    .addComponent(total1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cdR)
                    .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 450, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        frame.enable(true);
        this.dispose();
    }//GEN-LAST:event_exit1ActionPerformed

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseDragged
        this.setLocation(evt.getXOnScreen() - mouseX, evt.getYOnScreen() - mouseY);
    }//GEN-LAST:event_jPanel9MouseDragged

    private void cashRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRActionPerformed
        type = "Cash";
        cdR.setSelected(false);
    }//GEN-LAST:event_cashRActionPerformed

    private void cdRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRActionPerformed
        type = "Card";
        cashR.setSelected(false);
    }//GEN-LAST:event_cdRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MySQLQueries(conn).generateReceipt(type,
                card.getSelectedItem().toString(),
                new MySQLQueries(conn).getPrime(new MySQLQueries(conn).updateTask((DefaultTableModel) t, cid)));
        frame.dispose();
        frame2.enable(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        this.enable(false);
        new AddPayment(conn, cid, this).setVisible(true);
    }//GEN-LAST:event_Submit1ActionPerformed

    public void reInitCardList(String cn, boolean n) {
        if (n) {
            card.setModel(new MySQLQueries(conn).populateCardList(cid));
            card.setSelectedItem(cn);
        } else {
            card.addItem(cn);
            card.setSelectedItem(cn);
        }
    }

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
            java.util.logging.Logger.getLogger(DPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>S

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DPayment(conn, new JFrame(), new JFrame(), f, cid, t).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit1;
    private javax.swing.border.BevelBorder bevelBorder1;
    private javax.swing.JComboBox<String> card;
    private javax.swing.JRadioButton cashR;
    private javax.swing.JRadioButton cdR;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel fName10;
    private javax.swing.JLabel fName12;
    private javax.swing.JLabel fName2;
    private javax.swing.JLabel fName4;
    private javax.swing.JLabel fName5;
    private javax.swing.JLabel fName6;
    private javax.swing.JLabel fName7;
    private javax.swing.JLabel fName9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel vat;
    // End of variables declaration//GEN-END:variables
}