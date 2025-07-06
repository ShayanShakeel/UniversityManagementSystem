package package1;

import javax.swing.*;
import java.sql.*;

public class addTeacher extends javax.swing.JFrame {

    public addTeacher() {
        initComponents();
        addtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        emtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        fntxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        pntxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        regtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        idtxt.setBackground(new java.awt.Color(0,0,1,0));
        tntxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        btnadd.setBackground(new java.awt.Color(0, 0, 0, 70));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        addtxt = new javax.swing.JTextField();
        emtxt = new javax.swing.JTextField();
        fntxt = new javax.swing.JTextField();
        pntxt = new javax.swing.JTextField();
        regtxt = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tntxt = new javax.swing.JTextField();
        subtn = new com.k33ptoo.components.KButton();
        canbtn = new com.k33ptoo.components.KButton();
        btnadd = new rojerusan.RSMaterialButtonRectangle();
        dobcb = new datechooser.beans.DateChooserCombo();
        educombo = new javax.swing.JComboBox<>();
        dcombo = new javax.swing.JComboBox<>();
        closelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkGradientFocus(800);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 0));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Employee ID");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Address");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Email ID");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Father's Name");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Education");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Name");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Date of Birth");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Registration No");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Phone Number");

        idtxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        idtxt.setForeground(new java.awt.Color(255, 255, 255));
        idtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        addtxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addtxt.setForeground(new java.awt.Color(255, 255, 255));
        addtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        addtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtxtActionPerformed(evt);
            }
        });

        emtxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        emtxt.setForeground(new java.awt.Color(255, 255, 255));
        emtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emtxtActionPerformed(evt);
            }
        });

        fntxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fntxt.setForeground(new java.awt.Color(255, 255, 255));
        fntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        fntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fntxtActionPerformed(evt);
            }
        });

        pntxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pntxt.setForeground(new java.awt.Color(255, 255, 255));
        pntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        pntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pntxtActionPerformed(evt);
            }
        });

        regtxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        regtxt.setForeground(new java.awt.Color(255, 255, 255));
        regtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        regtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regtxtActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Department");

        tntxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tntxt.setForeground(new java.awt.Color(255, 255, 255));
        tntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tntxtActionPerformed(evt);
            }
        });

        subtn.setText("Submit");
        subtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn.setkEndColor(new java.awt.Color(0, 0, 0));
        subtn.setkHoverEndColor(new java.awt.Color(153, 153, 0));
        subtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subtn.setkHoverStartColor(new java.awt.Color(153, 153, 0));
        subtn.setkStartColor(new java.awt.Color(0, 0, 0));
        subtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtnActionPerformed(evt);
            }
        });

        canbtn.setText("Cancel");
        canbtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        canbtn.setkEndColor(new java.awt.Color(0, 0, 0));
        canbtn.setkHoverEndColor(new java.awt.Color(153, 153, 0));
        canbtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        canbtn.setkHoverStartColor(new java.awt.Color(153, 153, 0));
        canbtn.setkStartColor(new java.awt.Color(0, 0, 0));
        canbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canbtnActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setText("Add New Teacher");
        btnadd.setFocusPainted(false);
        btnadd.setFocusable(false);
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        dobcb.setCalendarBackground(new java.awt.Color(0, 153, 153));

        educombo.setBackground(new java.awt.Color(255, 255, 255));
        educombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        educombo.setForeground(new java.awt.Color(255, 255, 255));
        educombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "BSE", "BSC", "BEE", "MSE", "MSCS", "BCE", "MCE" }));

        dcombo.setBackground(new java.awt.Color(255, 255, 255));
        dcombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dcombo.setForeground(new java.awt.Color(255, 255, 255));
        dcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Civil", "IT", "Mechanical", "Electronics" }));

        closelabel.setBackground(new java.awt.Color(255, 255, 255));
        closelabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        closelabel.setForeground(new java.awt.Color(255, 255, 255));
        closelabel.setText("X");
        closelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closelabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(educombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel33))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addComponent(dcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(tntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(jLabel25)
                                .addGap(21, 21, 21)
                                .addComponent(fntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(15, 15, 15)
                                .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel30)
                                .addGap(31, 31, 31)
                                .addComponent(dobcb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(addtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(pntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel31)
                                .addGap(10, 10, 10)
                                .addComponent(regtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closelabel)
                .addGap(37, 37, 37))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(closelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(fntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobcb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(educombo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(dcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void addtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtxtActionPerformed

    private void emtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emtxtActionPerformed

    private void fntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fntxtActionPerformed

    private void pntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pntxtActionPerformed

    private void regtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regtxtActionPerformed

    private void tntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tntxtActionPerformed

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed
         String tn=tntxt.getText();
         String fn=fntxt.getText();
         String id=idtxt.getText();
         String add=addtxt.getText();
         String email=emtxt.getText();
         String phone=pntxt.getText();
         String reg=regtxt.getText();
         String dob= dobcb.getText();
         String edu=(String) educombo.getSelectedItem();
         String dep=(String) dcombo.getSelectedItem();

         try
         {
           if((tn.length()<=0)||(fn.length()<=0)||(id.length()<=0)||(add.length()<=0)||(email.length()<=0)||(phone.length()<=0)||(reg.length()<=0))
           {
           
                JOptionPane.showMessageDialog(null,"Please Insert Data To All Fields","Error",JOptionPane.ERROR_MESSAGE);
           }
           else
           {
               String query="insert into teacher values('"+tn+"','"+fn+"','"+id+"','"+dob+"','"+add+"','"+phone+"','"+email+"','"+reg+"','"+edu+"','"+dep+"')";
               Conn c = new Conn();
               c.stmt.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
               setVisible(false);
               new home().setVisible(true);
                
           }
           
         }catch(Exception e)
         {
               e.printStackTrace();
         }
    }//GEN-LAST:event_subtnActionPerformed

    private void canbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbtnActionPerformed
        home l = new home();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_canbtnActionPerformed

    private void closelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closelabelMouseClicked

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
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addtxt;
    private rojerusan.RSMaterialButtonRectangle btnadd;
    private com.k33ptoo.components.KButton canbtn;
    private javax.swing.JLabel closelabel;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JComboBox<String> dcombo;
    private datechooser.beans.DateChooserCombo dobcb;
    private javax.swing.JComboBox<String> educombo;
    private javax.swing.JTextField emtxt;
    private javax.swing.JTextField fntxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField pntxt;
    private javax.swing.JTextField regtxt;
    private com.k33ptoo.components.KButton subtn;
    private javax.swing.JTextField tntxt;
    // End of variables declaration//GEN-END:variables
}
