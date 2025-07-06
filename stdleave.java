package package1;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class stdleave extends javax.swing.JFrame {

    public stdleave() {
        initComponents();
        btnadd.setBackground(new java.awt.Color(0, 0, 0, 100));
         try
        {
            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("select * from student");
            while(rs.next())
            {
                choice.add(rs.getString("rollno"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        btnadd = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new datechooser.beans.DateChooserCombo();
        jLabel3 = new javax.swing.JLabel();
        subtn = new com.k33ptoo.components.KButton();
        canbtn = new com.k33ptoo.components.KButton();
        choice = new java.awt.Choice();
        timecombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        kGradientPanel1.setInheritsPopupMenu(true);
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 0));

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setText("Apply Student Leave");
        btnadd.setFocusPainted(false);
        btnadd.setFocusable(false);
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Roll No");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Date");

        date.setCalendarBackground(new java.awt.Color(0, 153, 153));
        date.setFormat(1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Time");

        subtn.setText("Submit");
        subtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn.setkEndColor(new java.awt.Color(0, 0, 0));
        subtn.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        subtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subtn.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        subtn.setkStartColor(new java.awt.Color(0, 0, 0));
        subtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtnActionPerformed(evt);
            }
        });

        canbtn.setText("Cancel");
        canbtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        canbtn.setkEndColor(new java.awt.Color(0, 0, 0));
        canbtn.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        canbtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        canbtn.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        canbtn.setkStartColor(new java.awt.Color(0, 0, 0));
        canbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canbtnActionPerformed(evt);
            }
        });

        choice.setBackground(new java.awt.Color(255, 255, 255));
        choice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice.setForeground(new java.awt.Color(0, 0, 0));

        timecombo.setBackground(new java.awt.Color(255, 255, 255));
        timecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Time", "Half Time" }));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(timecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)))
                .addGap(144, 144, 144))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timecombo)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed
        String rollno=choice.getSelectedItem();
        String dat= date.getText();
        String time=  (String) timecombo.getSelectedItem();
        String q = "insert into studentleave values('"+rollno+"','"+dat+"','"+time+"')";
        try
        {
            
            Conn c = new Conn();
            c.stmt.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Leave Confirmed");
            setVisible(false);
            new home().setVisible(true); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_subtnActionPerformed

    private void canbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbtnActionPerformed
        home l = new home();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_canbtnActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(stdleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stdleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stdleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stdleave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stdleave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnadd;
    private com.k33ptoo.components.KButton canbtn;
    private java.awt.Choice choice;
    private datechooser.beans.DateChooserCombo date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KButton subtn;
    private javax.swing.JComboBox<String> timecombo;
    // End of variables declaration//GEN-END:variables
}
