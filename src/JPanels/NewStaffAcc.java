/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels;

import codex.Bootstrap;
import codex.CodeSet;
import codex.MySQLQueries;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Sai
 */
public class NewStaffAcc extends javax.swing.JFrame {

    /**
     * Creates new form NewCAcc
     */
    
    private MySQLQueries SQuery = null;
    
    private CodeSet codeset = null;
    
    private static Connection conn = null;
    
    public NewStaffAcc(Connection conn) {
        this.conn = conn;
        Bootstrap template = new Bootstrap();
        this.setUndecorated(true);
        initComponents();
        //this.setLocationRelativeTo(null);
        this.setFocusable(true);
        exit.setBackground(Color.red);
        exit.setForeground(Color.WHITE);
        jPanel2.setBackground(java.awt.Color.decode(template.getBackgroundSlide()));
        jPanel1.setBackground(java.awt.Color.decode(template.getTextColour()));
        jLabel1.setForeground(java.awt.Color.decode(template.getTextColour()));
        SQuery = new MySQLQueries(conn);
        populateCountryList();
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
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        county = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        country = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -10, -1, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Create New Staff Account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jPanel1.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 280, -1));

        phone.setText("Contact Number");
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 280, -1));

        city.setText("Town/City");
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, -1));

        ad1.setText("Address 1");
        jPanel1.add(ad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, -1));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Role", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 280, -1));

        email.setText("Email Address");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, -1));

        county.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "County (Optional)", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(county, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 160, -1));

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
        jPanel1.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad2ActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed
    
    public void populateCountryList(){
        codeset = new CodeSet();
        DefaultComboBoxModel dm = new DefaultComboBoxModel(codeset.getAllCountries());
        country.setModel(dm);
        country.setSelectedIndex(77);
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
            java.util.logging.Logger.getLogger(NewStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStaffAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStaffAcc(conn).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad1;
    private javax.swing.JTextField ad2;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JComboBox<String> county;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField postcode;
    private javax.swing.JComboBox<String> role;
    // End of variables declaration//GEN-END:variables
}
