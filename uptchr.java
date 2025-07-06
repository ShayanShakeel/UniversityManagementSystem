package package1;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class uptchr extends javax.swing.JFrame {

    public uptchr() {
        
        initComponents();
        tfadd.setBackground(new java.awt.Color(0, 0, 1, 0));
        emtxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        edutxt.setBackground(new java.awt.Color(0, 0, 1, 0));
        tfphone.setBackground(new java.awt.Color(0, 0, 1, 0));
        btnadd.setBackground(new java.awt.Color(0, 0, 0, 60));
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.stmt.executeQuery("select * from teacher");
            while (rs.next()) {
                choice.add(rs.getString("id"));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            
            Conn c = new Conn();
            String q = "select  * from teacher where id='" + choice.getSelectedItem() + "'";
            ResultSet rs = c.stmt.executeQuery(q);
            while (rs.next()) {
                name.setText(rs.getString("name"));
                fname.setText(rs.getString("fname"));
                eid.setText(rs.getString("id"));
                dob.setText(rs.getString("dob"));
                tfadd.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                emtxt.setText(rs.getString("email"));
                reg.setText(rs.getString("reg"));
                edutxt.setText(rs.getString("education"));
                dcombo.setSelectedItem(rs.getString("department"));

            }
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        
        choice.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String q = "select * from teacher where id='" + choice.getSelectedItem() + "'";
                    ResultSet rs = c.stmt.executeQuery(q);
                    while (rs.next()) {
                        name.setText(rs.getString("name"));
                        fname.setText(rs.getString("fname"));
                        eid.setText(rs.getString("id"));
                        dob.setText(rs.getString("dob"));
                        tfadd.setText(rs.getString("address"));
                        tfphone.setText(rs.getString("phone"));
                        emtxt.setText(rs.getString("email"));
                        reg.setText(rs.getString("reg"));
                        edutxt.setText(rs.getString("education"));
                        dcombo.setSelectedItem(rs.getString("department"));

                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        tfadd = new javax.swing.JTextField();
        emtxt = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        subtn = new com.k33ptoo.components.KButton();
        canbtn = new com.k33ptoo.components.KButton();
        btnadd = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        eid = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        choice = new java.awt.Choice();
        dcombo = new javax.swing.JComboBox<>();
        edutxt = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setBorder(null);
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
        jLabel32.setText("Phone");

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

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Department");

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

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setText("Update Teacher Details");
        btnadd.setFocusPainted(false);
        btnadd.setFocusable(false);
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Employee ID");

        eid.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eid.setForeground(new java.awt.Color(255, 255, 255));

        reg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));

        fname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));

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

        dcombo.setBackground(new java.awt.Color(255, 255, 255));
        dcombo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Civil", "IT", "Mechanical", "Electronics", " " }));

        edutxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        edutxt.setForeground(new java.awt.Color(255, 255, 255));
        edutxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        edutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edutxtActionPerformed(evt);
            }
        });

        tfphone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfphone.setForeground(new java.awt.Color(255, 255, 255));
        tfphone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(128, 128, 128)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel25))
                                .addGap(32, 32, 32)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(edutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(47, 47, 47)
                                        .addComponent(dcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(69, 69, 69)
                .addComponent(jLabel7)
                .addGap(22, 22, 22))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)))
                .addGap(33, 33, 33)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(emtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edutxtActionPerformed

    private void choiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choiceMouseClicked

    }//GEN-LAST:event_choiceMouseClicked

    private void canbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbtnActionPerformed
        home l = new home();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_canbtnActionPerformed

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed
        
        String id = eid.getText();
        String add = tfadd.getText();
        String email = emtxt.getText();
        String phone = tfphone.getText();
        String edu = edutxt.getText();
        String branch = (String) dcombo.getSelectedItem();
        
        try {
            if ((add.length() <= 0) || (email.length() <= 0) || (phone.length() <= 0) || (edu.length() <= 0))
            {
                JOptionPane.showMessageDialog(null, "Please Insert Data To All Fields", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else {
                String query = "update teacher set address='" + add + "',phone='" + phone + "',email='" + email + "',education='" + edu + "',department='" + branch + "'where id='" + id + "'";
                Conn c = new Conn();
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Teacher Details Updated Successfully");
                setVisible(false);
                new home().setVisible(true);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_subtnActionPerformed

    private void emtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emtxtActionPerformed

    private void tfaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfaddActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(uptchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uptchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uptchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uptchr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uptchr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnadd;
    private com.k33ptoo.components.KButton canbtn;
    private java.awt.Choice choice;
    private javax.swing.JComboBox<String> dcombo;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField edutxt;
    private javax.swing.JLabel eid;
    private javax.swing.JTextField emtxt;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel7;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel reg;
    private com.k33ptoo.components.KButton subtn;
    private javax.swing.JTextField tfadd;
    private javax.swing.JTextField tfphone;
    // End of variables declaration//GEN-END:variables
}
