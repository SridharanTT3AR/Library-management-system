/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author DR.RAMANI
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class add_books extends javax.swing.JFrame {

    /**
     * Creates new form add_books
     */
    public add_books() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Information = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(330, 90, 187, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(330, 120, 187, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(330, 150, 187, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(330, 180, 187, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(330, 210, 187, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(330, 240, 187, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(330, 270, 187, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(330, 300, 187, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(330, 330, 187, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(330, 360, 187, 20);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(330, 390, 187, 20);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Subject of the book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 90, 220, 23);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Title of the book");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 200, 23);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("name of the author");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 220, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Copy right of the book");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 210, 260, 23);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("edition number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 240, 230, 23);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("number of pages");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 263, 220, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("ISBN for the book");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 300, 220, 23);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Number of books");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 330, 230, 20);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Name of the library");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 360, 230, 23);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("shelf number");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 390, 190, 20);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Nameof the publisher");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 180, 260, 23);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("BOOK INFORMATION");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(113, 10, 310, 30);

        Information.setText("Insert the information");
        Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationActionPerformed(evt);
            }
        });
        getContentPane().add(Information);
        Information.setBounds(300, 430, 137, 23);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 430, 51, 23);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Book_ID");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 60, 110, 23);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(330, 60, 187, 20);

        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 430, 55, 23);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(538, 11, 55, 23);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/sritt7.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, -80, 890, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationActionPerformed
  
        try{
        Class.forName("java.sql.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Sridharan")) {
                Statement    stmt = con.createStatement();
                System.out.println(" connected");
                String query;
               // query = "INSERT INTO add (S_no,Subject) VALUES ('1','1');";
                  query = "INSERT INTO addbook values("+ Integer.parseInt(jTextField12.getText())+","+ "'"+jTextField1.getText()+"'" +","+ "'"+jTextField2.getText()+"'" +","+ "'"+jTextField3.getText()+"'" +","+ "'"+jTextField4.getText()+"'" +","+ "'"+jTextField5.getText()+"'"+"," + Integer.parseInt(jTextField6.getText())+","+ Integer.parseInt(jTextField7.getText())+","+ "'"+jTextField8.getText()+"'" +","+Integer.parseInt(jTextField9.getText())+","+ "'"+jTextField10.getText()+"'"+","+ Integer.parseInt(jTextField11.getText())+");";
                stmt.executeUpdate(query);
                con.close();
                stmt.close();
            }   
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Not connected");
            
        }
     
    }//GEN-LAST:event_InformationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTextField1.setText(" ");
       jTextField2.setText(" ");
       jTextField3.setText(" ");
       jTextField4.setText(" ");
       jTextField5.setText(" ");
       jTextField6.setText(" ");
       jTextField7.setText(" ");
       jTextField8.setText(" ");
       jTextField9.setText(" ");
       jTextField10.setText(" ");
       jTextField11.setText(" ");
       jTextField12.setText(" ");
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
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
            java.util.logging.Logger.getLogger(add_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Information;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
