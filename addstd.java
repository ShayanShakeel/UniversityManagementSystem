package package1;

import javax.swing.*;
import java.sql.*;

public class addstd extends javax.swing.JFrame {

    public addstd() {
        initComponents();
        emailtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        addtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        fntxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        pntxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        regtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        rntxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        sectxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        sntxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        xtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        btnadd.setBackground(new java.awt.Color(0, 0, 0, 100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        rntxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        sectxt = new javax.swing.JTextField();
        addtxt = new javax.swing.JTextField();
        fntxt = new javax.swing.JTextField();
        pntxt = new javax.swing.JTextField();
        regtxt = new javax.swing.JTextField();
        xtxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        sntxt = new javax.swing.JTextField();
        subtn = new com.k33ptoo.components.KButton();
        canbtn = new com.k33ptoo.components.KButton();
        btnadd = new rojerusan.RSMaterialButtonRectangle();
        dobcb = new datechooser.beans.DateChooserCombo();
        crscombo = new javax.swing.JComboBox<>();
        bcombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBorder(null);
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 0));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Roll No");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email Id");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Father's Name");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Class XII%");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Program");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Name");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Class X%");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Date of Birth");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Registration No");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Phone");

        rntxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rntxt.setForeground(new java.awt.Color(255, 255, 255));
        rntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        rntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rntxtActionPerformed(evt);
            }
        });

        emailtxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(255, 255, 255));
        emailtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });

        sectxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sectxt.setForeground(new java.awt.Color(255, 255, 255));
        sectxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sectxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectxtActionPerformed(evt);
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

        regtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regtxt.setForeground(new java.awt.Color(255, 255, 255));
        regtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        regtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regtxtActionPerformed(evt);
            }
        });

        xtxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        xtxt.setForeground(new java.awt.Color(255, 255, 255));
        xtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        xtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtxtActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Branch");

        sntxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sntxt.setForeground(new java.awt.Color(255, 255, 255));
        sntxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sntxtActionPerformed(evt);
            }
        });

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

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setText("Add New Student");
        btnadd.setFocusPainted(false);
        btnadd.setFocusable(false);
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        dobcb.setCalendarBackground(new java.awt.Color(0, 153, 153));

        crscombo.setBackground(new java.awt.Color(255, 255, 255));
        crscombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crscombo.setForeground(new java.awt.Color(255, 255, 255));
        crscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "BSE", "BSC", "BEE", "MSE", "MSCS", "BCE", "MCE" }));
        crscombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bcombo.setBackground(new java.awt.Color(255, 255, 255));
        bcombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bcombo.setForeground(new java.awt.Color(255, 255, 255));
        bcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Civil", "IT", "Mechanical", "Electronics" }));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(sntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel16)
                        .addGap(28, 28, 28)
                        .addComponent(fntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(rntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel22)
                        .addGap(39, 39, 39)
                        .addComponent(dobcb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(addtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(pntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(xtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(sectxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(regtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(crscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel20)
                        .addGap(85, 85, 85)
                        .addComponent(bcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(sectxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(regtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))))
                .addGap(35, 35, 35)
                .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 625));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void canbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbtnActionPerformed
        home l = new home();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_canbtnActionPerformed

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed

        String sn=sntxt.getText();
        String fn=fntxt.getText();
        String rn=rntxt.getText();
        String add=addtxt.getText();
        String email=emailtxt.getText();
        String phone=pntxt.getText();
        String matric=xtxt.getText();
        String second=sectxt.getText();
        String reg=regtxt.getText();
        String dob= dobcb.getText();
        String course =(String)crscombo.getSelectedItem();
        String branch=(String) bcombo.getSelectedItem();

        try
        {
            if((sn.length()<=0)||(fn.length()<=0)||(rn.length()<=0)||(add.length()<=0)||(email.length()<=0)||(phone.length()<=0)||(reg.length()<=0))
            {

                JOptionPane.showMessageDialog(null,"Please Insert Data To All Fields","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String query="insert into student values('"+sn+"','"+fn+"','"+rn+"','"+dob+"','"+add+"','"+phone+"','"+email+"','"+matric+"','"+second+"','"+reg+"','"+course+"','"+branch+"')";
                Conn c = new Conn();
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                setVisible(false);
                new home().setVisible(true);}
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_subtnActionPerformed

    private void sntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sntxtActionPerformed

    private void xtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtxtActionPerformed

    private void regtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regtxtActionPerformed

    private void pntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pntxtActionPerformed

    private void fntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fntxtActionPerformed

    private void addtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtxtActionPerformed

    private void sectxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void rntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rntxtActionPerformed


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
            java.util.logging.Logger.getLogger(addstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addtxt;
    private javax.swing.JComboBox<String> bcombo;
    private rojerusan.RSMaterialButtonRectangle btnadd;
    private com.k33ptoo.components.KButton canbtn;
    private javax.swing.JComboBox<String> crscombo;
    private datechooser.beans.DateChooserCombo dobcb;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fntxt;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField pntxt;
    private javax.swing.JTextField regtxt;
    private javax.swing.JTextField rntxt;
    private javax.swing.JTextField sectxt;
    private javax.swing.JTextField sntxt;
    private com.k33ptoo.components.KButton subtn;
    private javax.swing.JTextField xtxt;
    // End of variables declaration//GEN-END:variables
}
