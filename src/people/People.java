/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import common.PredefineMethods;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class People extends javax.swing.JInternalFrame {

    /**
     * Creates new form People1
     */
    public People() throws IOException {
        initComponents();
        if(!PredefineMethods.readFile("F:\\NetBeans_Workspace\\CACSystem\\output\\userType.txt").equals("admin")){
            hideComponents();
        }  
    }
    private void hideComponents(){
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        listEmp = new javax.swing.JButton();
        listCust = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(940, 480));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 150, 150));
        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddCustomer.png"))); // NOI18N
        jButton1.setText("Add Customer");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(73, 67));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 67));
        jButton1.setPreferredSize(new java.awt.Dimension(120, 120));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 150, 150));
        jButton4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddSupplier.png"))); // NOI18N
        jButton4.setText("Add Supplier");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(120, 120));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        listEmp.setBackground(new java.awt.Color(0, 150, 150));
        listEmp.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        listEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Employee.png"))); // NOI18N
        listEmp.setText("Employee");
        listEmp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listEmp.setPreferredSize(new java.awt.Dimension(120, 120));
        listEmp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        listEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listEmpMouseExited(evt);
            }
        });
        listEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listEmpActionPerformed(evt);
            }
        });
        jPanel2.add(listEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        listCust.setBackground(new java.awt.Color(0, 150, 150));
        listCust.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        listCust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer.png"))); // NOI18N
        listCust.setText("Customer");
        listCust.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listCust.setPreferredSize(new java.awt.Dimension(120, 120));
        listCust.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        listCust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listCustMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listCustMouseExited(evt);
            }
        });
        listCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCustActionPerformed(evt);
            }
        });
        jPanel2.add(listCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 150, 150));
        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddEmployee.png"))); // NOI18N
        jButton2.setText("Add Employee");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(120, 120));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 150, 150));
        jButton6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Supplier.png"))); // NOI18N
        jButton6.setText("Supplier");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(120, 120));
        jButton6.setMinimumSize(new java.awt.Dimension(120, 120));
        jButton6.setPreferredSize(new java.awt.Dimension(120, 120));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("People");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 390, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/People.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 50, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 82, 680, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DashboardBackground.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 480));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        PredefineMethods.setButtonColor(jButton1);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        PredefineMethods.resetButtonColor(jButton1);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddCustomer ob1;
        try {
            ob1 = new AddCustomer();
            ob1.setVisible(true);
        } catch (SQLException ex) { Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        PredefineMethods.setButtonColor(jButton4);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        PredefineMethods.resetButtonColor(jButton4);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AddSupplier ob1 = new AddSupplier();
        ob1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void listEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmpMouseEntered
        PredefineMethods.setButtonColor(listEmp);
    }//GEN-LAST:event_listEmpMouseEntered

    private void listEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmpMouseExited
        PredefineMethods.resetButtonColor(listEmp);
    }//GEN-LAST:event_listEmpMouseExited

    private void listEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEmpActionPerformed
    //    ListEmployee ob1 = new ListEmployee();
      //  ob1.setVisible(true);
    }//GEN-LAST:event_listEmpActionPerformed

    private void listCustMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCustMouseEntered
        PredefineMethods.setButtonColor(listCust);
    }//GEN-LAST:event_listCustMouseEntered

    private void listCustMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCustMouseExited
        PredefineMethods.resetButtonColor(listCust);
    }//GEN-LAST:event_listCustMouseExited

    private void listCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCustActionPerformed
 //       ListCustomers ob1 = new ListCustomers();
  //      ob1.setVisible(true);
    }//GEN-LAST:event_listCustActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        PredefineMethods.setButtonColor(jButton2);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        PredefineMethods.resetButtonColor(jButton2);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           AddEmployee ob1 = new AddEmployee();
           ob1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        PredefineMethods.setButtonColor(jButton6);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        PredefineMethods.resetButtonColor(jButton6);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      //     ListSuppliers ob1 = new ListSuppliers();
       //    ob1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton listCust;
    private javax.swing.JButton listEmp;
    // End of variables declaration//GEN-END:variables
}
