package package1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class home extends javax.swing.JFrame {

    public home() {
        
        initComponents();
        b1.setBackground(new java.awt.Color(0,0,0,60));
        b2.setBackground(new java.awt.Color(0,0,0,60));
        b3.setBackground(new java.awt.Color(0,0,0,60));
        b4.setBackground(new java.awt.Color(0,0,0,60));
        b5.setBackground(new java.awt.Color(0,0,0,60));
        b6.setBackground(new java.awt.Color(0,0,0,60));
        b7.setBackground(new java.awt.Color(0,0,0,60));
        b8.setBackground(new java.awt.Color(0,0,0,60));
        b9.setBackground(new java.awt.Color(0,0,0,60));
        b10.setBackground(new java.awt.Color(0,0,0,60));
        b11.setBackground(new java.awt.Color(0,0,0,60));
        b13.setBackground(new java.awt.Color(0,0,0,60));        
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        b2 = new rojerusan.RSButtonHover();
        b1 = new rojerusan.RSButtonHover();
        b3 = new rojerusan.RSButtonHover();
        b6 = new rojerusan.RSButtonHover();
        b4 = new rojerusan.RSButtonHover();
        b9 = new rojerusan.RSButtonHover();
        b7 = new rojerusan.RSButtonHover();
        b8 = new rojerusan.RSButtonHover();
        b10 = new rojerusan.RSButtonHover();
        b5 = new rojerusan.RSButtonHover();
        b11 = new rojerusan.RSButtonHover();
        b13 = new rojerusan.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        subtn = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 51, 0));
        kGradientPanel2.setRequestFocusEnabled(false);

        b2.setBackground(new java.awt.Color(0, 0, 0));
        b2.setText("Add Student");
        b2.setColorHover(new java.awt.Color(102, 102, 0));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(0, 0, 0));
        b1.setText("Add Teacher");
        b1.setColorHover(new java.awt.Color(102, 102, 0));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(0, 0, 0));
        b3.setText("Update Teacher");
        b3.setColorHover(new java.awt.Color(102, 102, 0));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setText("Teacher Information");
        b6.setColorHover(new java.awt.Color(102, 102, 0));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setText("Update Student");
        b4.setColorHover(new java.awt.Color(102, 102, 0));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(0, 0, 0));
        b9.setText("Student Leave Information");
        b9.setColorHover(new java.awt.Color(102, 102, 0));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(0, 0, 0));
        b7.setText("Apply Student Leave");
        b7.setColorHover(new java.awt.Color(102, 102, 0));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 0, 0));
        b8.setText("Apply Teacher Leave");
        b8.setColorHover(new java.awt.Color(102, 102, 0));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(0, 0, 0));
        b10.setText("Teacher Leave Information");
        b10.setColorHover(new java.awt.Color(102, 102, 0));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setText("Student Information");
        b5.setColorHover(new java.awt.Color(102, 102, 0));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(0, 0, 0));
        b11.setText("Add Student Marks");
        b11.setColorHover(new java.awt.Color(102, 102, 0));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b13.setBackground(new java.awt.Color(0, 0, 0));
        b13.setText("Student Result");
        b13.setColorHover(new java.awt.Color(102, 102, 0));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                        HOME PAGE");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        subtn.setText("Logout");
        subtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn.setkEndColor(new java.awt.Color(0, 0, 0));
        subtn.setkHoverEndColor(new java.awt.Color(153, 153, 0));
        subtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subtn.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        subtn.setkPressedColor(new java.awt.Color(255, 255, 0));
        subtn.setkSelectedColor(new java.awt.Color(153, 153, 0));
        subtn.setkStartColor(new java.awt.Color(0, 0, 0));
        subtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtnActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(131, 131, 131))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 770));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/ums1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 780, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed
        login l = new login();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_subtnActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        showresult a = new showresult();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b13ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        exam a = new exam();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b11ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        viewstud a = new viewstud();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b5ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        tldetail a = new tldetail();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b10ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        teachleave a = new teachleave();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        stdleave a = new stdleave();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        sldetail a = new sldetail();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        upstd a = new upstd();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        viewteacher a = new viewteacher();
        setVisible(false);
        a.setVisible(true);

    }//GEN-LAST:event_b6ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        uptchr a = new uptchr();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        addTeacher a = new addTeacher();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        addstd a = new addstd();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover b1;
    private rojerusan.RSButtonHover b10;
    private rojerusan.RSButtonHover b11;
    private rojerusan.RSButtonHover b13;
    private rojerusan.RSButtonHover b2;
    private rojerusan.RSButtonHover b3;
    private rojerusan.RSButtonHover b4;
    private rojerusan.RSButtonHover b5;
    private rojerusan.RSButtonHover b6;
    private rojerusan.RSButtonHover b7;
    private rojerusan.RSButtonHover b8;
    private rojerusan.RSButtonHover b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KButton subtn;
    // End of variables declaration//GEN-END:variables
}
