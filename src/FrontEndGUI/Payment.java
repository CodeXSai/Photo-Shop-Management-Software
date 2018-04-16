/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEndGUI;

import BackEndCode.CodeSet;
import BackEndCode.MySQLQueries;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Sai
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form staffAccount
     */
    private static Connection conn = null;

    private PreparedStatement pst = null;

    private ResultSet rs = null;

    private CodeSet codeset;

    private MySQLQueries SQuery = null;

    private String query;

    private static String s;

    private static String type;

    private static float f;

    private float totalf;

    private static int cid;

    private static JFrame frame;

    private static JFrame frame2;

    private ArrayList<String> ls;

    int mouseX;

    int mouseY;

    public Payment(Connection conn, JFrame frame, JFrame frame2, int cid) {
        f = 0f;
        totalf = 0f;
        codeset = new CodeSet();
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
        setPrice(0);
        card.setModel(new MySQLQueries(conn).populateCardList(cid));
        cashR.setSelected(true);
        cdR.setSelected(false);
        table.setModel(new MySQLQueries(conn).paymentTask(codeset, cid, table.getModel()));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
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
        fName4 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        vat = new javax.swing.JLabel();
        fName9 = new javax.swing.JLabel();
        fName10 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        fName12 = new javax.swing.JLabel();
        cashR = new javax.swing.JRadioButton();
        cdR = new javax.swing.JRadioButton();
        Submit1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        total1 = new javax.swing.JLabel();
        fName5 = new javax.swing.JLabel();
        card = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fName8 = new javax.swing.JLabel();
        fName11 = new javax.swing.JLabel();
        fName13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fName3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        sa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2, 280, 60));

        exit1.setBackground(new java.awt.Color(255, 0, 0));
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("X");
        exit1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jPanel9.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, -10, -1, 40));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fName4.setBackground(new java.awt.Color(59, 63, 66));
        fName4.setFont(fName4.getFont().deriveFont(fName4.getFont().getStyle() | java.awt.Font.BOLD, fName4.getFont().getSize()+2));
        fName4.setForeground(new java.awt.Color(59, 63, 66));
        fName4.setText(" £");
        jPanel4.add(fName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        subtotal.setBackground(new java.awt.Color(59, 63, 66));
        subtotal.setFont(subtotal.getFont().deriveFont(subtotal.getFont().getStyle() | java.awt.Font.BOLD, subtotal.getFont().getSize()+2));
        subtotal.setForeground(new java.awt.Color(59, 63, 66));
        subtotal.setText("Subtotal");
        jPanel4.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 30, 150, -1));

        vat.setBackground(new java.awt.Color(59, 63, 66));
        vat.setFont(vat.getFont().deriveFont(vat.getFont().getStyle() | java.awt.Font.BOLD, vat.getFont().getSize()+2));
        vat.setForeground(new java.awt.Color(59, 63, 66));
        vat.setText("VAT");
        jPanel4.add(vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 150, -1));

        fName9.setBackground(new java.awt.Color(59, 63, 66));
        fName9.setFont(fName9.getFont().deriveFont(fName9.getFont().getStyle() | java.awt.Font.BOLD, fName9.getFont().getSize()+2));
        fName9.setForeground(new java.awt.Color(59, 63, 66));
        fName9.setText("Total");
        jPanel4.add(fName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 74, 40));

        fName10.setBackground(new java.awt.Color(59, 63, 66));
        fName10.setFont(fName10.getFont().deriveFont(fName10.getFont().getStyle() | java.awt.Font.BOLD, fName10.getFont().getSize()+2));
        fName10.setForeground(new java.awt.Color(59, 63, 66));
        fName10.setText(" £");
        jPanel4.add(fName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 40));

        total.setBackground(new java.awt.Color(59, 63, 66));
        total.setFont(total.getFont().deriveFont(total.getFont().getStyle() | java.awt.Font.BOLD, total.getFont().getSize()+2));
        total.setForeground(new java.awt.Color(59, 63, 66));
        total.setText("Total");
        jPanel4.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 157, 40));

        fName12.setBackground(new java.awt.Color(59, 63, 66));
        fName12.setFont(fName12.getFont().deriveFont(fName12.getFont().getStyle() | java.awt.Font.BOLD, fName12.getFont().getSize()+2));
        fName12.setForeground(new java.awt.Color(59, 63, 66));
        fName12.setText("Payment Type");
        jPanel4.add(fName12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cashR.setBackground(new java.awt.Color(153, 153, 153));
        cashR.setFont(cashR.getFont().deriveFont(cashR.getFont().getStyle() | java.awt.Font.BOLD));
        cashR.setForeground(new java.awt.Color(59, 63, 66));
        cashR.setText("Cash");
        cashR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRActionPerformed(evt);
            }
        });
        jPanel4.add(cashR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 335, -1));

        cdR.setBackground(new java.awt.Color(153, 153, 153));
        cdR.setFont(cdR.getFont().deriveFont(cdR.getFont().getStyle() | java.awt.Font.BOLD));
        cdR.setForeground(new java.awt.Color(59, 63, 66));
        cdR.setText("Credit/Debit");
        cdR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRActionPerformed(evt);
            }
        });
        jPanel4.add(cdR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

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
        jPanel4.add(Submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 28));

        jButton1.setText("Complete Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 335, 42));

        total1.setBackground(new java.awt.Color(59, 63, 66));
        total1.setFont(total1.getFont().deriveFont(total1.getFont().getStyle() | java.awt.Font.BOLD, total1.getFont().getSize()+2));
        total1.setForeground(new java.awt.Color(59, 63, 66));
        total1.setText("Total");
        jPanel4.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 277, -1));

        fName5.setBackground(new java.awt.Color(59, 63, 66));
        fName5.setFont(fName5.getFont().deriveFont(fName5.getFont().getStyle() | java.awt.Font.BOLD, fName5.getFont().getSize()+2));
        fName5.setForeground(new java.awt.Color(59, 63, 66));
        fName5.setText("£");
        jPanel4.add(fName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        card.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        card.setSelectedIndex(2);
        jPanel4.add(card, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 335, 33));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+2));
        jLabel3.setForeground(new java.awt.Color(59, 63, 66));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("__________________________________________");
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 343, -1));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD, jLabel4.getFont().getSize()+2));
        jLabel4.setForeground(new java.awt.Color(59, 63, 66));
        jLabel4.setText("__________________________________________");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 343, -1));

        fName8.setBackground(new java.awt.Color(59, 63, 66));
        fName8.setFont(fName8.getFont().deriveFont(fName8.getFont().getStyle() | java.awt.Font.BOLD, fName8.getFont().getSize()+2));
        fName8.setForeground(new java.awt.Color(59, 63, 66));
        fName8.setText("Subtotal");
        jPanel4.add(fName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 30, 80, -1));

        fName11.setBackground(new java.awt.Color(59, 63, 66));
        fName11.setFont(fName11.getFont().deriveFont(fName11.getFont().getStyle() | java.awt.Font.BOLD, fName11.getFont().getSize()+2));
        fName11.setForeground(new java.awt.Color(59, 63, 66));
        fName11.setText("VAT");
        jPanel4.add(fName11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 74, -1));

        fName13.setBackground(new java.awt.Color(59, 63, 66));
        fName13.setFont(fName13.getFont().deriveFont(fName13.getFont().getStyle() | java.awt.Font.BOLD, fName13.getFont().getSize()+2));
        fName13.setForeground(new java.awt.Color(59, 63, 66));
        fName13.setText(" £");
        jPanel4.add(fName13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fName3.setBackground(new java.awt.Color(59, 63, 66));
        fName3.setFont(fName3.getFont().deriveFont(fName3.getFont().getStyle() | java.awt.Font.BOLD, fName3.getFont().getSize()+2));
        fName3.setForeground(new java.awt.Color(59, 63, 66));
        fName3.setText("Task");
        jPanel3.add(fName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 143, 20));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Task", "Price", "Discount "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 670, 350));

        sa.setText("Select All");
        sa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saActionPerformed(evt);
            }
        });
        jPanel3.add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jButton2.setText("Deselect All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/152203094779373020.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1250, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        frame2.enable(true);
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
        ls = new ArrayList<String>();
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, 0).toString().equals("true")) {
                ls.add(codeset.getPrime().get(i));
            }
        }
        if (type.equals("Cash")) {
            new MySQLQueries(conn).generateReceipt(type,
                    " ", ls);
        } else {
            new MySQLQueries(conn).generateReceipt(type,
                    card.getSelectedItem().toString(), ls);
        }

        frame.dispose();
        new PrintReceipt(conn, ls, frame2, cid).show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        this.enable(false);
        new VAddPayment(conn, cid, this).setVisible(true);
    }//GEN-LAST:event_Submit1ActionPerformed

    private void saActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saActionPerformed
        f = 0f;
        for (int i = 0; i < table.getRowCount(); i++) {
            table.setValueAt(true, i, 0);
            f += Float.parseFloat(table.getValueAt(i, 2).toString());
        }
        setPrice(f);
    }//GEN-LAST:event_saActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < table.getRowCount(); i++) {
            table.setValueAt(false, i, 0);
        }
        f = 0f;
        setPrice(f);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        if (table.getValueAt(table.getSelectedRow(), 0).toString().equals("true")) {
            f -= Float.parseFloat(table.getValueAt(table.getSelectedRow(), 2).toString());
            setPrice(f);
        } else {
            f += Float.parseFloat(table.getValueAt(table.getSelectedRow(), 2).toString());
            setPrice(f);
        }

        if (table.getValueAt(table.getSelectedRow(), 0).toString().equals("true")) {
            table.setValueAt(false, table.getSelectedRow(), 0);
        } else {
            table.setValueAt(true, table.getSelectedRow(), 0);
        }
    }//GEN-LAST:event_tableMouseClicked

    public void reInitCardList(String cn, boolean n) {
        if (n) {
            card.setModel(new MySQLQueries(conn).populateCardList(cid));
            card.setSelectedItem(cn);
        } else {
            card.addItem(cn);
            card.setSelectedItem(cn);
        }
    }

    public void setPrice(float f) {
        subtotal.setText(String.valueOf(f));
        vat.setText(String.format("%.02f", new CodeSet().calculateVAT(f) - f) + " (20%)");
        total.setText(String.format("%.02f", new CodeSet().calculateVAT(f)));
        total1.setText(String.format("%.02f", new CodeSet().calculateVAT(f)));
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Payment(conn, new JFrame(), new JFrame(), cid).setVisible(true);
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
    private javax.swing.JLabel fName11;
    private javax.swing.JLabel fName12;
    private javax.swing.JLabel fName13;
    private javax.swing.JLabel fName3;
    private javax.swing.JLabel fName4;
    private javax.swing.JLabel fName5;
    private javax.swing.JLabel fName8;
    private javax.swing.JLabel fName9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sa;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable table;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel vat;
    // End of variables declaration//GEN-END:variables
}
