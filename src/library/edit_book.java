/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DR.RAMANI
 */
public class edit_book extends javax.swing.JFrame {

    /**
     * Creates new form add_books
     */
    public edit_book() {
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
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(319, 93, 187, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 120, 187, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(320, 150, 187, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(320, 180, 187, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(320, 210, 187, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(320, 240, 187, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(320, 270, 187, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(320, 300, 187, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(320, 330, 187, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(320, 360, 187, 20);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(320, 390, 187, 20);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Subject of the book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 230, 23);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Title of the book");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 190, 23);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("name of the author");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 150, 220, 23);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Copy right of the book");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 210, 250, 23);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("edition number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 240, 190, 23);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("number of pages");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 263, 230, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("ISBN for the book");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 300, 200, 23);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Number of books");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 330, 200, 23);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Name of the library");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 360, 230, 23);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("shelf number");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 390, 200, 23);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Name of the publisher");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 180, 230, 23);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("BOOK INFORMATION");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 0, 310, 30);

        Information.setText("Update info.");
        Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationActionPerformed(evt);
            }
        });
        getContentPane().add(Information);
        Information.setBounds(290, 430, 100, 23);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 430, 51, 23);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Book ID");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(141, 48, 130, 23);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(319, 42, 187, 20);

        jButton1.setText("EDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 63, 55, 23);

        jButton3.setText("clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 430, 55, 23);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(583, 11, 55, 23);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/sritt7.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, -30, 810, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationActionPerformed
        
        try{
        Class.forName("java.sql.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/borrow","root","coolviswa777"); 
                Statement stmt = con.createStatement()) {
                //String query= "SELECT Book_ID FROM edit WHERE EXISTS (SELECT Book_ID FROM addbook WHERE Book_ID= Integer.parseInt(jTextField12.getText());";
               // String query = "INSERT INTO addbook values("+ Integer.parseInt(jTextField12.getText())+","+ "'"+jTextField1.getText()+"'" +","+ "'"+jTextField2.getText()+"'" +","+ "'"+jTextField3.getText()+"'" +","+ "'"+jTextField4.getText()+"'" +","+ "'"+jTextField5.getText()+"'"+"," + Integer.parseInt(jTextField6.getText())+","+ Integer.parseInt(jTextField7.getText())+","+ "'"+jTextField8.getText()+"'" +","+ Integer.parseInt(jTextField9.getText())+","+ "'"+jTextField10.getText()+"'"+","+ Integer.parseInt(jTextField11.getText())+");";
                int value1=Integer.parseInt(jTextField12.getText());
                String value2= jTextField1.getText();
                String value3= jTextField2.getText();
                String value4= jTextField3.getText();
                String value5= jTextField4.getText();
                String value6= jTextField5.getText();
                int value7=Integer.parseInt(jTextField6.getText());
                int value8=Integer.parseInt(jTextField7.getText());
                String value9= jTextField8.getText();
                int value10=Integer.parseInt(jTextField9.getText());
                String value11= jTextField10.getText();
                int value12=Integer.parseInt(jTextField11.getText());
                
                    String query= "UPDATE  addbook set Book_ID='"+value1+"' ,Subject='"+value2+"' , Title='"+value3+"' ,Author='"+value4+"' ,Publisher='"+value5+"' ,Copyright='"+value6+"' ,Edition='"+value7+"' ,Pages='"+value8+"' ,ISBN='"+value9+"' ,Copies='"+value10+"' ,Library_name='"+value11+"' ,Shelf_no='"+value12+"'Where Book_ID='"+value1+"'"; 

                stmt.executeUpdate(query);
                
            }
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("error in first snippet");
        }
     
    }//GEN-LAST:event_InformationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                try{
        Class.forName("java.sql.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/borrow","root","coolviswa777");
      Statement    stmt = con.createStatement();
       String query="select * from addbook where Book_ID="+jTextField12.getText()+";";

        ResultSet rs= stmt.executeQuery(query);
      rs.next();
      
          String Subject = rs.getString(2);
          String Title  = rs.getString(3);
          String Author = rs.getString(4);
          String Publisher = rs.getString(5);
          String Copyright = rs.getString(6);
          String edition = rs.getString(7);
          String pages = rs.getString(8);
          String ISBN = rs.getString(9);
          String Copies = rs.getString(10);
          String Libraryname = rs.getString(11);
          String Shelfno= rs.getString(12);
         
          jTextField1.setText(Subject);
          jTextField2.setText(Title);
          jTextField3.setText(Author);
          jTextField4.setText(Publisher);
          jTextField5.setText(Copyright);
          jTextField6.setText(edition);
          jTextField7.setText(pages);
          jTextField8.setText(ISBN);
          jTextField9.setText(Copies);
          jTextField10.setText(Libraryname);
          jTextField11.setText(Shelfno);
        stmt.close();
        con.close();
        }
        catch(  ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("errorin second snippet");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(edit_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Information;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
