package package1;

import javax.swing.*;
import java.awt.*;

public class splash extends javax.swing.JFrame {

    public splash() {
        initComponents();
        bar.setForeground(new Color(102, 102, 0));
        UIManager.put("nimbusOrange", new Color(102, 102, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(77, 83, 5));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(30);
        kGradientPanel1.setkStartColor(new java.awt.Color(113, 126, 7));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(731, 379));

        lab1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("Loading.....");

        lab2.setFont(new java.awt.Font("Ravie", 1, 14)); // NOI18N
        lab2.setForeground(new java.awt.Color(153, 153, 0));
        lab2.setText("0 %");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/loadingimg.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNIVERSITY");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 153, 0)));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SYSTEM");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 153, 0)));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGEMENT");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 153, 0)));

        bar.setBackground(new java.awt.Color(0, 0, 0));
        bar.setForeground(new java.awt.Color(102, 102, 0));
        bar.setToolTipText("");
        bar.setBorder(null);
        bar.setBorderPainted(false);
        bar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barStateChanged(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lab2)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(81, 81, 81)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_barStateChanged

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        splash s = new splash();
        login l=new login();
        s.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(30);
                s.lab2.setText(i +"%");
                if(i==10)
                {
                    s.lab1.setText("Turning on Modules.....");
                }
                if(i==30)
                {
                    s.lab1.setText("Loading Modules.....");
                }
                if(i==70)
                {
                    s.lab1.setText("Connecting To Database.....");
                }
                if(i==80)
                {
                    s.lab1.setText("Connection Successful.....");
                }
                if(i==90)
                {
                    s.lab1.setText("Launching Application.....");
                }
                s.bar.setValue(i);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        l.setVisible(true);
        s.setVisible(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    // End of variables declaration//GEN-END:variables
}
