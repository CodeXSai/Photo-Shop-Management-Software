/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEndGUI;

import FrontEndGUI.*;
import BackEndCode.Bootstrap;
import BackEndCode.CodeSet;
import BackEndCode.MySQLQueries;
import java.awt.Color;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Sai
 */
public class EditStaffAcc extends javax.swing.JFrame {

    /**
     * Creates new form NewCAcc
     */
    private MySQLQueries SQuery = null;

    private CodeSet codeset = null;

    private static Connection conn = null;

    private static JFrame frame;

    private static ArrayList<String> ls, lp;

    private static String staff;

    int mouseX;
    int mouseY;

    public EditStaffAcc(Connection conn, JFrame frame, ArrayList<String> ls, String staff) {
        this.conn = conn;
        this.frame = frame;
        this.ls = ls;
        this.staff = staff;
        this.setUndecorated(true);
        initComponents();
        this.setFocusable(true);
        SQuery = new MySQLQueries(conn);
        area.setVisible(false);
        populateCountryList();
        initiateData();
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
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lName = new javax.swing.JTextField();
        postcode = new javax.swing.JTextField();
        ad2 = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        ad1 = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        country = new javax.swing.JComboBox<>();
        county = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        area = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(59, 63, 66));
        jPanel2.setForeground(new java.awt.Color(59, 63, 66));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(171, 172, 173));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(171, 172, 173));
        jLabel1.setText("Edit Staff Account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, -1));

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, -10, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lName.setText("Last Name");
        jPanel1.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 280, -1));

        postcode.setText("Postcode");
        jPanel1.add(postcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 180, -1));

        ad2.setText("Address 2 (optional)");
        ad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad2ActionPerformed(evt);
            }
        });
        jPanel1.add(ad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 280, -1));

        fName.setText("First Name");
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        jPanel1.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 280, -1));

        phone.setText("Contact Number");
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 280, -1));

        city.setText("Town/City");
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, -1));

        ad1.setText("Address 1");
        jPanel1.add(ad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, -1));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Receptionist", "Technician", "Shift Manager", "Office Manager" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 170, -1));

        email.setText("Email Address");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 360, 120, -1));

        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country", "Item 2", "Item 3", "Item 4" }));
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });
        jPanel1.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 180, -1));

        county.setText("County (Optional)");
        jPanel1.add(county, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, -1));

        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 590, -1));

        area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Development Area", "Copy Room", "Packing Room", "Finishing Room" }));
        jPanel1.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 180, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 670, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        error.setText("");
        if ((fName.getText().equals("First Name") || lName.getText().equals("Lastname") || ad1.getText().equals("Address 1") || city.getText().equals("Town/City") || postcode.getText().equals("Postcode") || email.getText().equals("Email Address") || phone.getText().equals("Contact Number"))
                || (fName.getText().equals("") || lName.getText().equals("") || ad1.getText().equals("") || city.getText().equals("") || postcode.getText().equals("") || email.getText().equals("") || phone.getText().equals(""))) {
            error.setText("Please fill all the section");
        } else if (!(phone.getText().matches("\\d+")) || (fName.getText().matches(".*\\d+.*")) || (lName.getText().matches(".*\\d+.*")) || !(codeset.isValidEmailAddress(email.getText()))) {
            error.setText("Please enter valid input");
        } else {
            if (ad2.getText().equals("Address 2 (optional)")) {
                ad2.setText(null);
            }
            if (county.getText().equals("County (Optional)")) {
                county.setText(null);
            }
            if (SQuery.editStaff(finaliseData())) {
                new StaffAccount(conn, lp.get(11), frame, staff).show();
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad2ActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(evt.getXOnScreen() - mouseX, evt.getYOnScreen() - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        if (role.getSelectedIndex() == 1) {
            area.setVisible(true);
        } else {
            area.setVisible(false);
        }
    }//GEN-LAST:event_roleActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new StaffAccount(conn, ls.get(11), frame, staff).show();
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        initiateData();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populateCountryList() {
        codeset = new CodeSet();
        DefaultComboBoxModel dm = new DefaultComboBoxModel(codeset.getAllCountries());
        country.setModel(dm);
        country.setSelectedIndex(77);
    }

    private void initiateData() {
        fName.setText(ls.get(1));
        lName.setText(ls.get(2));
        ad1.setText(ls.get(3));
        ad2.setText(ls.get(4));
        city.setText(ls.get(5));
        county.setText(ls.get(6));
        postcode.setText(ls.get(7));
        country.setSelectedItem(ls.get(8));
        role.setSelectedItem(ls.get(9));
        area.setSelectedItem(ls.get(10));
        email.setText(ls.get(11));
        phone.setText(ls.get(12));
    }

    private ArrayList<String> finaliseData() {
        lp = new ArrayList<>();
        if (role.getSelectedIndex() != 1) {
            area.addItem("");
            area.setSelectedIndex(4);
        }
        lp.add(ls.get(0));
        lp.add(fName.getText());
        lp.add(lName.getText());
        lp.add(ad1.getText());
        lp.add(ad2.getText());
        lp.add(city.getText());
        lp.add(county.getText());
        lp.add(postcode.getText());
        lp.add(country.getSelectedItem().toString());
        lp.add(role.getSelectedItem().toString());
        lp.add(area.getSelectedItem().toString());
        lp.add(email.getText());
        lp.add(phone.getText());
        return lp;
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
            java.util.logging.Logger.getLogger(EditStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStaffAcc(conn, new JFrame(), new ArrayList<>(), new String()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad1;
    private javax.swing.JTextField ad2;
    private javax.swing.JComboBox<String> area;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JTextField county;
    private javax.swing.JTextField email;
    private javax.swing.JLabel error;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField postcode;
    private javax.swing.JComboBox<String> role;
    // End of variables declaration//GEN-END:variables
}