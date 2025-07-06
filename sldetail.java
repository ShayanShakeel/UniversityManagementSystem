package package1;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class sldetail extends javax.swing.JFrame {

    public sldetail() {
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
          try
        {
            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("select * from studentleave");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnadd = new rojerusan.RSMaterialButtonRectangle();
        subtn = new com.k33ptoo.components.KButton();
        subtn2 = new com.k33ptoo.components.KButton();
        subtn4 = new com.k33ptoo.components.KButton();
        choice = new java.awt.Choice();
        subtn5 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        p1.setBackground(new java.awt.Color(0, 0, 0));
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.setRequestFocusEnabled(false);

        kGradientPanel1.setBorder(null);
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search by Roll No");

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setText("Student Leave Details");
        btnadd.setFocusPainted(false);
        btnadd.setFocusable(false);
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        subtn.setText("Search");
        subtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn.setkBorderRadius(20);
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

        subtn2.setText("Add");
        subtn2.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn2.setkBorderRadius(20);
        subtn2.setkEndColor(new java.awt.Color(0, 0, 0));
        subtn2.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        subtn2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subtn2.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        subtn2.setkStartColor(new java.awt.Color(0, 0, 0));
        subtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtn2ActionPerformed(evt);
            }
        });

        subtn4.setText("Back");
        subtn4.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn4.setkBorderRadius(20);
        subtn4.setkEndColor(new java.awt.Color(0, 0, 0));
        subtn4.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        subtn4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subtn4.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        subtn4.setkStartColor(new java.awt.Color(0, 0, 0));
        subtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtn4ActionPerformed(evt);
            }
        });

        choice.setBackground(new java.awt.Color(255, 255, 255));
        choice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice.setForeground(new java.awt.Color(0, 0, 0));

        subtn5.setText("Delete");
        subtn5.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn5.setkBorderRadius(20);
        subtn5.setkEndColor(new java.awt.Color(0, 0, 0));
        subtn5.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        subtn5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subtn5.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        subtn5.setkStartColor(new java.awt.Color(0, 0, 0));
        subtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(subtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(subtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(subtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        table.setBackground(new java.awt.Color(0, 0, 0));
        table.setBorder(null);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Roll Number", "Date", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColorBackgoundHead(new java.awt.Color(153, 153, 0));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        table.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        table.setColorSelBackgound(new java.awt.Color(255, 255, 255));
        table.setColorSelForeground(new java.awt.Color(0, 0, 0));
        table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("select * from studentleave where rollno='"+choice.getSelectedItem()+"'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_subtnActionPerformed

    private void subtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtn4ActionPerformed
        home l = new home();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_subtn4ActionPerformed

    private void subtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtn2ActionPerformed
        setVisible(false);
        stdleave a= new stdleave();
        a.setVisible(true);
    }//GEN-LAST:event_subtn2ActionPerformed

    private void subtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtn5ActionPerformed
        try
        {
            Conn c = new Conn();
            String q = " delete  from studentleave where rollno='"+choice.getSelectedItem()+"'";
            c.stmt.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Record Deleted Successfully!");
            setVisible(false);
            new sldetail().setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         
    }//GEN-LAST:event_subtn5ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(sldetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sldetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sldetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sldetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sldetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnadd;
    private java.awt.Choice choice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel p1;
    private com.k33ptoo.components.KButton subtn;
    private com.k33ptoo.components.KButton subtn2;
    private com.k33ptoo.components.KButton subtn4;
    private com.k33ptoo.components.KButton subtn5;
    private rojeru_san.complementos.RSTableMetro table;
    // End of variables declaration//GEN-END:variables
}
