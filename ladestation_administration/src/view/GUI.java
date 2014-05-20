/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ChargingDerbyDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;




/**
 *
 * @author Sth0r
 */
public class GUI extends javax.swing.JFrame {

    LadestationTableModel ltm = new LadestationTableModel();
    ChargingDerbyDAO DAO = new ChargingDerbyDAO();
    ResultSetTableModel rstm = new ResultSetTableModel();
    /**
     * Creates new form GUI
     */
    public GUI() throws SQLException {
        initComponents();
        jTable1.setModel(ltm);
        ltm.addColumn("ID");
        ltm.addColumn("First name");
        ltm.addColumn("Last name");
        ltm.addColumn("Balance");
        ltm.addColumn("Credit limit");
        ltm.addColumn("Email");
        ltm.addColumn("Phone");
        
    }
    
    //LadestationTableModel thismodel;
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addDialog = new javax.swing.JDialog();
        addDialogIDLabel1 = new javax.swing.JLabel();
        addDialogIDField1 = new javax.swing.JTextField();
        addDialogFirstnameField1 = new javax.swing.JTextField();
        addDialogNameLabel1 = new javax.swing.JLabel();
        addDialogLastnameLabel1 = new javax.swing.JLabel();
        addDialogLastnameField1 = new javax.swing.JTextField();
        addDialogBalance = new javax.swing.JLabel();
        addDialogBalanceField1 = new javax.swing.JTextField();
        addDialogCreditLimitField1 = new javax.swing.JTextField();
        addDialogCreditLimit = new javax.swing.JLabel();
        addDialogEmailLabel = new javax.swing.JLabel();
        addDialogEmailField1 = new javax.swing.JTextField();
        addDialogPhoneField1 = new javax.swing.JTextField();
        addDialogObsLabel = new javax.swing.JLabel();
        addDialogPhoneLabel = new javax.swing.JLabel();
        addDialogDiscartButton = new javax.swing.JButton();
        addDialogAcceptButton = new javax.swing.JButton();
        askDialog = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        Customer_info_tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        CItab_add_button = new javax.swing.JButton();
        CItab_edit_button = new javax.swing.JButton();
        CItab_delete_button = new javax.swing.JButton();
        CItab_Push_button = new javax.swing.JButton();
        CItab_fetch_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        addDialogIDLabel1.setText("ID:");

        addDialogIDField1.setNextFocusableComponent(addDialogFirstnameField1);
        addDialogIDField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDialogIDField1ActionPerformed(evt);
            }
        });

        addDialogFirstnameField1.setNextFocusableComponent(addDialogLastnameField1);
        addDialogFirstnameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDialogFirstnameField1ActionPerformed(evt);
            }
        });

        addDialogNameLabel1.setText("First name:");

        addDialogLastnameLabel1.setText("Last name:");

        addDialogLastnameField1.setNextFocusableComponent(addDialogEmailField1);

        addDialogBalance.setText("Balance:");

        addDialogBalanceField1.setNextFocusableComponent(addDialogPhoneField1);

        addDialogCreditLimitField1.setNextFocusableComponent(addDialogBalanceField1);
        addDialogCreditLimitField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDialogCreditLimitField1ActionPerformed(evt);
            }
        });

        addDialogCreditLimit.setText("Credit limit:");

        addDialogEmailLabel.setText("Email:");

        addDialogEmailField1.setNextFocusableComponent(addDialogCreditLimitField1);
        addDialogEmailField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDialogEmailField1ActionPerformed(evt);
            }
        });

        addDialogPhoneField1.setNextFocusableComponent(addDialogIDField1);

        addDialogObsLabel.setText("OBS eg \"-200\"");

        addDialogPhoneLabel.setText("Phone:");

        addDialogDiscartButton.setText("Discart");
        addDialogDiscartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDialogDiscartButtonActionPerformed(evt);
            }
        });

        addDialogAcceptButton.setText("Accept");
        addDialogAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDialogAcceptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addDialogNameLabel1)
                    .addComponent(addDialogIDLabel1)
                    .addComponent(addDialogLastnameLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDialogLayout.createSequentialGroup()
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addDialogLastnameField1)
                            .addComponent(addDialogIDField1)
                            .addComponent(addDialogFirstnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addDialogCreditLimit)
                            .addComponent(addDialogBalance)
                            .addComponent(addDialogEmailLabel)))
                    .addComponent(addDialogDiscartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDialogLayout.createSequentialGroup()
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addDialogCreditLimitField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addDialogBalanceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addDialogEmailField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addDialogLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addDialogPhoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addDialogPhoneField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addDialogLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addDialogObsLabel))))
                    .addComponent(addDialogAcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDialogIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDialogIDLabel1)
                    .addComponent(addDialogEmailLabel)
                    .addComponent(addDialogEmailField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDialogPhoneField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDialogPhoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDialogNameLabel1)
                    .addComponent(addDialogFirstnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDialogCreditLimit)
                    .addComponent(addDialogCreditLimitField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDialogLastnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDialogBalanceField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDialogObsLabel)
                    .addComponent(addDialogLastnameLabel1)
                    .addComponent(addDialogBalance))
                .addGap(18, 18, 18)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDialogAcceptButton)
                    .addComponent(addDialogDiscartButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Fetch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Do not fetch");

        jFormattedTextField2.setText("jFormattedTextField2");
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout askDialogLayout = new javax.swing.GroupLayout(askDialog.getContentPane());
        askDialog.getContentPane().setLayout(askDialogLayout);
        askDialogLayout.setHorizontalGroup(
            askDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(askDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(askDialogLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        askDialogLayout.setVerticalGroup(
            askDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(askDialogLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(askDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CItab_add_button.setText("Add");
        CItab_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CItab_add_buttonActionPerformed(evt);
            }
        });

        CItab_edit_button.setText("Edit");
        CItab_edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CItab_edit_buttonActionPerformed(evt);
            }
        });

        CItab_delete_button.setText("Delete");
        CItab_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CItab_delete_buttonActionPerformed(evt);
            }
        });

        CItab_Push_button.setText("Push");
        CItab_Push_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CItab_Push_buttonActionPerformed(evt);
            }
        });

        CItab_fetch_button.setText("Fetch");
        CItab_fetch_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CItab_fetch_buttonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First name", "Last name", "balance", "Credit limit", "Email", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("First name");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Last name");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("balance");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Credit limit");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Email");
        jTable1.getColumnModel().getColumn(6).setHeaderValue("Phone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CItab_add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CItab_edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CItab_delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CItab_fetch_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CItab_Push_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CItab_add_button)
                    .addComponent(CItab_edit_button)
                    .addComponent(CItab_delete_button)
                    .addComponent(CItab_fetch_button)
                    .addComponent(CItab_Push_button))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        Customer_info_tab.addTab("Customer info", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        Customer_info_tab.addTab("Event log", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Customer_info_tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Customer_info_tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CItab_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CItab_delete_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CItab_delete_buttonActionPerformed

    private void CItab_edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CItab_edit_buttonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CItab_edit_buttonActionPerformed

    private void CItab_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CItab_add_buttonActionPerformed
        // TODO add your handling code here:
        addDialogClearInputFields();
        addDialog.setVisible(true);
        addDialog.pack();
    }//GEN-LAST:event_CItab_add_buttonActionPerformed

    private void addDialogCreditLimitField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDialogCreditLimitField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addDialogCreditLimitField1ActionPerformed

    private void addDialogEmailField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDialogEmailField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDialogEmailField1ActionPerformed

    private void addDialogFirstnameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDialogFirstnameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDialogFirstnameField1ActionPerformed

    private void addDialogDiscartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDialogDiscartButtonActionPerformed
        // TODO add your handling code here:
        addDialog.setVisible(false);
    }//GEN-LAST:event_addDialogDiscartButtonActionPerformed

    private void addDialogIDField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDialogIDField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDialogIDField1ActionPerformed

    private void addDialogAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDialogAcceptButtonActionPerformed
        // TODO add your handling code here:
        ltm.addRow(new Object[]{addDialogIDField1.getText(), addDialogFirstnameField1.getText(), addDialogLastnameField1.getText(), addDialogBalanceField1.getText(), addDialogCreditLimitField1.getText(), addDialogEmailField1.getText(), addDialogPhoneField1.getText()});
        Customer tempCustomer = new Customer(addDialogIDField1.getText(), addDialogFirstnameField1.getText(), addDialogLastnameField1.getText(), addDialogBalanceField1.getText(), addDialogCreditLimitField1.getText(), addDialogEmailField1.getText(), addDialogPhoneField1.getText(), "123");
        //sendtodb(tempCustomer);
        addDialog.setVisible(false);
    }//GEN-LAST:event_addDialogAcceptButtonActionPerformed

    private void CItab_Push_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CItab_Push_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CItab_Push_buttonActionPerformed

    private void CItab_fetch_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CItab_fetch_buttonActionPerformed
        boolean dummy = ask("If you fetch change will be lost","fetch","do not fetch");
        if(dummy)
        {
            try {
                // TODO add your handling code here:
                DAO.getCustomersTableFromDB(rstm);            
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            int ROW = rstm.getRowCount();
            int ROWindex = 0;
            while (ROW != ROWindex)
            {
                ltm.addRow(new Object[]{rstm.getValueAt(ROWindex, 0), rstm.getValueAt(ROWindex, 1), rstm.getValueAt(ROWindex, 2), rstm.getValueAt(ROWindex, 3), rstm.getValueAt(ROWindex, 4), rstm.getValueAt(ROWindex, 5), rstm.getValueAt(ROWindex, 6)});
                ROWindex++;
            }
        }
    }//GEN-LAST:event_CItab_fetch_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed
;
    private boolean ask(String question, String trueanswer, String falseanswer){
        Object[] options = {trueanswer,
                    falseanswer};
        int n = JOptionPane.showOptionDialog(null,
            question,
            "A Silly Question",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
        return (n == 0);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CItab_Push_button;
    private javax.swing.JButton CItab_add_button;
    private javax.swing.JButton CItab_delete_button;
    private javax.swing.JButton CItab_edit_button;
    private javax.swing.JButton CItab_fetch_button;
    private javax.swing.JTabbedPane Customer_info_tab;
    private javax.swing.JDialog addDialog;
    private javax.swing.JButton addDialogAcceptButton;
    private javax.swing.JLabel addDialogBalance;
    private javax.swing.JTextField addDialogBalanceField1;
    private javax.swing.JLabel addDialogCreditLimit;
    private javax.swing.JTextField addDialogCreditLimitField1;
    private javax.swing.JButton addDialogDiscartButton;
    private javax.swing.JTextField addDialogEmailField1;
    private javax.swing.JLabel addDialogEmailLabel;
    private javax.swing.JTextField addDialogFirstnameField1;
    private javax.swing.JTextField addDialogIDField1;
    private javax.swing.JLabel addDialogIDLabel1;
    private javax.swing.JTextField addDialogLastnameField1;
    private javax.swing.JLabel addDialogLastnameLabel1;
    private javax.swing.JLabel addDialogNameLabel1;
    private javax.swing.JLabel addDialogObsLabel;
    private javax.swing.JTextField addDialogPhoneField1;
    private javax.swing.JLabel addDialogPhoneLabel;
    private javax.swing.JDialog askDialog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void addDialogClearInputFields() {
        addDialogIDField1.setText("");
        addDialogFirstnameField1.setText("");
        addDialogLastnameField1.setText("");
        addDialogEmailField1.setText("");
        addDialogCreditLimitField1.setText("");
        addDialogBalanceField1.setText("");
        addDialogPhoneField1.setText("");
        
    }
}
