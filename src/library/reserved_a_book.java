/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author DR.RAMANI
 */
public class reserved_a_book extends javax.swing.JFrame {

    /**
     * Creates new form add_books
     */
    public reserved_a_book() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Information = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(319, 124, 187, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(319, 155, 187, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(319, 181, 187, 20);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Member ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(141, 119, 121, 23);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Date of reserve");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(141, 150, 174, 23);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Reservation till");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(141, 181, 153, 23);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Reserve a book.........................................................");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(44, 49, 594, 23);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("BOOK INFORMATION");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(193, 11, 284, 30);

        Information.setText("Reserve");
        Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationActionPerformed(evt);
            }
        });
        getContentPane().add(Information);
        Information.setBounds(357, 246, 73, 23);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(357, 287, 65, 23);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Book ID");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(141, 83, 81, 23);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(319, 88, 187, 20);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(583, 21, 55, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/sritt8.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -70, 760, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationActionPerformed
        // TODO add your handling code here:
         try
        {
         
               
        Class.forName("java.sql.Driver");
        
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/borrow","root","coolviswa777"); 
                Statement stmt = con.createStatement())
            {
                
        Calendar issue = Calendar.getInstance();
        int day = issue.get(Calendar.DATE);
        int month = issue.get(Calendar.MONTH) + 1;
        int year = issue.get(Calendar.YEAR);
       
        Calendar reserve = Calendar.getInstance();
        reserve= (Calendar) issue.clone();
        reserve.add(Calendar.DAY_OF_YEAR, +21);
        int dayr= reserve.get(Calendar.DATE);
        int monthr= reserve.get(Calendar.MONTH) +1;
        int yearr= reserve.get(Calendar.YEAR);
         
         
          
     
        
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(year);
        sb.append("-");
        sb.append(month);
        sb.append("-");
        sb.append(day);
        
        StringBuilder sb2;
        sb2 = new StringBuilder();
        sb2.append(yearr);
        sb2.append("-");
        sb2.append(monthr);
        sb2.append("-");
        sb2.append(dayr);
        
        //System.out.println(sb.toString());
        //System.out.println(sb2.toString());
                              

                jTextField2.setText(sb.toString());
                jTextField3.setText(sb2.toString());
               
                String query = "INSERT INTO reserve values("+Integer.parseInt(jTextField12.getText())+","+Integer.parseInt(jTextField1.getText())+","+"'"+jTextField2.getText()+"'" +","+"'"+jTextField3.getText()+"'" +");";
                stmt.executeUpdate(query);
                
                stmt.close();
                con.close();
           
                
            }
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_InformationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(reserved_a_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reserved_a_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reserved_a_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserved_a_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reserved_a_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Information;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
