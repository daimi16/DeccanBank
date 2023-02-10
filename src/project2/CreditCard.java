/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CreditCard extends javax.swing.JFrame {

    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
    public String CreditNo = myDateObj.format(myFormatObj);

    DateTimeFormatter DateObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public String datenow = myDateObj.format(DateObj);
    public Connection connect;

    public CreditCard() {
        initComponents();
        CreditCardNo.setText("22" + CreditNo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CreditCardNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pin = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        ConfirmPin = new javax.swing.JPasswordField();
        Save = new javax.swing.JButton();
        PinError = new javax.swing.JLabel();
        PinError1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Create Virtual Credit Card Pin");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/icons8-mastercard-logo-48.png"))); // NOI18N

        CreditCardNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CreditCardNo.setEnabled(false);
        CreditCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardNoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter 4 digit pin");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Credit Card Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Confirm pin");

        Save.setBackground(new java.awt.Color(0, 51, 255));
        Save.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        PinError.setForeground(new java.awt.Color(255, 0, 0));

        PinError1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ConfirmPin)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(PinError1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CreditCardNo)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(PinError, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pin, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(281, 281, 281))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreditCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PinError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PinError1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreditCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditCardNoActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String password = Pin.getText();
        if (password.length() == 4 && password.matches("^[0-9]*$")) {
            Pin.setBackground(Color.GREEN);

            String repass = ConfirmPin.getText();

            if (password.equals(repass) && !" ".equals(repass)) {

                ConfirmPin.setBackground(Color.GREEN);
                int Dcvv = (int) (Math.random() * 1000);
                int Ccvv = (int) (Math.random() * 1000);

                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yy");
                String formattedDate = myDateObj.format(myFormatObj);
                int adder = Integer.parseInt(formattedDate) + 5;
                String FinalDate = Integer.toString(adder);

                DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-" + FinalDate);
                String Expirydate = myDateObj.format(myFormat);

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/deccanbank","root","");
                    String query = "update cards set CreditCardNumber='" + CreditCardNo.getText() + "', CreditCardCVV='" + Ccvv + "', CreditCardType='Gold',CreditCardIssued='" + datenow + "',CreditCardExpiry='" + Expirydate + "', CreditCardPin='" + Pin.getText() + "', CreditCardBalance='10000', CreditCardInterestRate='1.5%' where AccountNumber='" + new CreateAccount().AccountNo + "'";
                    PreparedStatement pst = connect.prepareStatement(query);

                    pst.execute();
                    setVisible(false);
                    dispose();
                    new usernameAndPass().setVisible(true);

                } catch (Exception e) {

                    System.out.print(e);
                }

            } else if ("".equals(repass)) {

                JOptionPane.showMessageDialog(null, "Confirm PIN");
                ConfirmPin.setBackground(new Color(246, 53, 40));

            } else {
                JOptionPane.showMessageDialog(null, "Enter Same PIN");
                ConfirmPin.setBackground(new Color(246, 53, 40));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Valid PIN of 4 Digits ");
            Pin.setBackground(new Color(246, 53, 40));
        }


    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPin;
    private javax.swing.JTextField CreditCardNo;
    private javax.swing.JPasswordField Pin;
    private javax.swing.JLabel PinError;
    private javax.swing.JLabel PinError1;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
