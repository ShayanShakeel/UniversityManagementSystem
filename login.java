package package1;

import java.sql.*;
import javax.swing.*;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        txtn.setBackground(new java.awt.Color(0,0,1,0));
        txtp.setBackground(new java.awt.Color(0,0,1,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        logbtn = new com.k33ptoo.components.KButton();
        canbtn = new com.k33ptoo.components.KButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtn = new app.bolivia.swing.JCTextField();
        txtp = new app.bolivia.swing.JCTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 0));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 28, 40));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO UNIVERSITY MANAGEMENT SYSTEM");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(null);
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 20));

        kGradientPanel2.setBackground(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setBorder(null);
        kGradientPanel2.setDoubleBuffered(false);
        kGradientPanel2.setkBorderRadius(100);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 0));
        kGradientPanel2.setkGradientFocus(300);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Enter Your Credentials");

        logbtn.setText("Login");
        logbtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        logbtn.setkEndColor(new java.awt.Color(0, 0, 0));
        logbtn.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        logbtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        logbtn.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        logbtn.setkPressedColor(new java.awt.Color(255, 255, 153));
        logbtn.setkStartColor(new java.awt.Color(0, 0, 0));
        logbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbtnActionPerformed(evt);
            }
        });

        canbtn.setText("Cancel");
        canbtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        canbtn.setkEndColor(new java.awt.Color(0, 0, 0));
        canbtn.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        canbtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        canbtn.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        canbtn.setkPressedColor(new java.awt.Color(255, 255, 153));
        canbtn.setkStartColor(new java.awt.Color(0, 0, 0));
        canbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canbtnActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/icons8_Secure_50px.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/icons8_Account_50px.png"))); // NOI18N

        txtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtn.setForeground(new java.awt.Color(255, 255, 255));
        txtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtn.setPhColor(new java.awt.Color(255, 255, 255));
        txtn.setPlaceholder("Enter Username");
        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });

        txtp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtp.setForeground(new java.awt.Color(255, 255, 255));
        txtp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtp.setPhColor(new java.awt.Color(255, 255, 255));
        txtp.setPlaceholder("Enter Password");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel18)
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(logbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 560, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void canbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_canbtnActionPerformed

    private void logbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbtnActionPerformed
         
         String username =txtn.getText();
         String password=txtp.getText();
         String query ="select * from login where username = '"+username+"'and password='"+password+"'";
         
         try
         {
             Conn c = new Conn();
             ResultSet rs= c.stmt.executeQuery(query);
             if(rs.next())
             {
                 setVisible(false);
                 home at = new home();
                 at.setVisible(true);
                  
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Invalid Credentials!");
             }
         }
         
         catch(Exception e)
         {
             e.printStackTrace();
         }
         
    }//GEN-LAST:event_logbtnActionPerformed

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton canbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KButton logbtn;
    private app.bolivia.swing.JCTextField txtn;
    private app.bolivia.swing.JCTextField txtp;
    // End of variables declaration//GEN-END:variables
}
