package package1;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class upstd extends javax.swing.JFrame {

    public upstd() {
        initComponents();
        tfadd.setBackground(new java.awt.Color(0, 0, 1, 0));
        emtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        tfphone.setBackground(new java.awt.Color(0, 0, 1, 0));
        btnup.setBackground(new java.awt.Color(0, 0, 0, 100));
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("select * from student");
            while (rs.next()) {
                choice.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        try {
            Conn c = new Conn();
            String q = "select  * from student where rollno='" + choice.getSelectedItem() + "'";
            ResultSet rs = c.stmt.executeQuery(q);
            while (rs.next()) {
                name.setText(rs.getString("name"));
                fname.setText(rs.getString("fname"));
                rn.setText(rs.getString("rollno"));
                dob.setText(rs.getString("dob"));
                tfadd.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                emtxt.setText(rs.getString("email"));
                mat.setText(rs.getString("class_x"));
                sec.setText(rs.getString("class_xii"));
                reg.setText(rs.getString("reg"));
                crscombo.setSelectedItem(rs.getString("course"));
                bcombo.setSelectedItem(rs.getString("branch"));

            }
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        
        
        choice.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String q = "select  * from student where rollno='" + choice.getSelectedItem() + "'";
                    ResultSet rs = c.stmt.executeQuery(q);
                    while (rs.next()) {
                        name.setText(rs.getString("name"));
                        fname.setText(rs.getString("fname"));
                        rn.setText(rs.getString("rollno"));
                        dob.setText(rs.getString("dob"));
                        tfadd.setText(rs.getString("address"));
                        tfphone.setText(rs.getString("phone"));
                        emtxt.setText(rs.getString("email"));
                        mat.setText(rs.getString("class_x"));
                        sec.setText(rs.getString("class_xii"));
                        reg.setText(rs.getString("reg"));
                        crscombo.setSelectedItem(rs.getString("course"));
                        bcombo.setSelectedItem(rs.getString("branch"));

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        tfadd = new javax.swing.JTextField();
        emtxt = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        subtn = new com.k33ptoo.components.KButton();
        canbtn = new com.k33ptoo.components.KButton();
        btnup = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        rn = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        choice = new java.awt.Choice();
        crscombo = new javax.swing.JComboBox<>();
        bcombo = new javax.swing.JComboBox<>();
        mat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        jLabel18.setText("Course");

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

        tfadd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfadd.setForeground(new java.awt.Color(255, 255, 255));
        tfadd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaddActionPerformed(evt);
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

        tfphone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfphone.setForeground(new java.awt.Color(255, 255, 255));
        tfphone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        tfphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfphoneActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Branch");

        subtn.setText("Submit");
        subtn.setkBackGroundColor(new java.awt.Color(51, 255, 0));
        subtn.setkEndColor(new java.awt.Color(0, 0, 0));
        subtn.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        subtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        subtn.setkHoverStartColor(new java.awt.Color(102, 102, 0));
        subtn.setkPressedColor(new java.awt.Color(255, 255, 0));
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
        canbtn.setkPressedColor(new java.awt.Color(255, 255, 0));
        canbtn.setkStartColor(new java.awt.Color(0, 0, 0));
        canbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canbtnActionPerformed(evt);
            }
        });

        btnup.setBackground(new java.awt.Color(0, 0, 0));
        btnup.setText("Update Student Details");
        btnup.setFocusPainted(false);
        btnup.setFocusable(false);
        btnup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Roll No");

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));

        rn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rn.setForeground(new java.awt.Color(255, 255, 255));

        fname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));

        reg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));

        sec.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sec.setForeground(new java.awt.Color(255, 255, 255));

        dob.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dob.setForeground(new java.awt.Color(255, 255, 255));

        choice.setBackground(new java.awt.Color(255, 255, 255));
        choice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice.setForeground(new java.awt.Color(0, 0, 0));
        choice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choiceMouseClicked(evt);
            }
        });

        crscombo.setBackground(new java.awt.Color(255, 255, 255));
        crscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "BSE", "BSC", "BEE", "MSE", "MSCS", "BCE", "MCE" }));

        bcombo.setBackground(new java.awt.Color(255, 255, 255));
        bcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Civil", "IT", "Mechanical", "Electronics", " " }));

        mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(crscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel20)
                        .addGap(77, 77, 77)
                        .addComponent(bcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(rn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel22)
                                .addGap(31, 31, 31)
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btnup, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnup, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfphone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(bcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(crscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(992, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(655, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupActionPerformed

    private void canbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbtnActionPerformed
        home l = new home();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_canbtnActionPerformed

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed

        String rollno = rn.getText();
        String add = tfadd.getText();
        String email = emtxt.getText();
        String phone = tfphone.getText();
        String course = (String) crscombo.getSelectedItem();
        String branch = (String) bcombo.getSelectedItem();
        try {
            if ((add.length() <= 0) || (email.length() <= 0) || (phone.length() <= 0)) 
            {
                JOptionPane.showMessageDialog(null, "Please Insert Data To All Fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                String query = "update student set address='" + add + "',phone='" + phone + "',email='" + email + "',course='" + course + "',branch='" + branch + "'where rollno='" + rollno + "'";
                Conn c = new Conn();
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Student Details Updated Successfully");
                setVisible(false);
                new home().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_subtnActionPerformed

    private void tfphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfphoneActionPerformed

    private void emtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emtxtActionPerformed

    private void tfaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfaddActionPerformed

    private void choiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choiceMouseClicked

    }//GEN-LAST:event_choiceMouseClicked

    private void matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matActionPerformed

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
            java.util.logging.Logger.getLogger(upstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upstd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new upstd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bcombo;
    private rojerusan.RSMaterialButtonRectangle btnup;
    private com.k33ptoo.components.KButton canbtn;
    private java.awt.Choice choice;
    private javax.swing.JComboBox<String> crscombo;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField emtxt;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField mat;
    private javax.swing.JLabel name;
    private javax.swing.JLabel reg;
    private javax.swing.JLabel rn;
    private javax.swing.JLabel sec;
    private com.k33ptoo.components.KButton subtn;
    private javax.swing.JTextField tfadd;
    private javax.swing.JTextField tfphone;
    // End of variables declaration//GEN-END:variables
}
