/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mdtas
 */
public class Balance extends javax.swing.JFrame {

    /**
     * Creates new form Balance
     */
    public Balance() {
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

        jLabel1 = new javax.swing.JLabel();
        account = new javax.swing.JTextField();
        display = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Enter Account Number:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 108, 173, 34));

        account.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 108, 255, 34));

        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("Press ok to see your account balance.");
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 160, 333, 39));

        ok.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/example/icons8-ok-40.png"))); // NOI18N
        ok.setPreferredSize(new java.awt.Dimension(72, 20));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 217, 79, 57));

        back.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/example/back.png"))); // NOI18N
        back.setMaximumSize(new java.awt.Dimension(56, 24));
        back.setMinimumSize(new java.awt.Dimension(56, 24));
        back.setPreferredSize(new java.awt.Dimension(72, 20));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 217, -1, 57));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/example/add new patient background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        try{
            FileReader Read = new FileReader(account.getText()+".txt");
            Scanner sc = new Scanner(Read);
            String line = null;
            for(int i=0;i<2;i++)
            {
                line = sc.nextLine();
            }
            display.setText("Your Account Balance: " + line);
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Account not found", "Error", HEIGHT);
        }
    }//GEN-LAST:event_okActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new page2().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Balance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account;
    private javax.swing.JButton back;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
