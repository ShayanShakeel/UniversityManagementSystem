package package1;
import javax.swing.*;
import java.sql.*;

public class exam extends javax.swing.JFrame {

    public exam() {
        
        initComponents();
     btnadd.setBackground(new java.awt.Color(0, 0, 0, 100));
     marks1txt.setBackground(new java.awt.Color(0,0,1,0));
     marks2txt.setBackground(new java.awt.Color(0,0,1,0));
     marks3txt.setBackground(new java.awt.Color(0,0,1,0));
     marks4txt.setBackground(new java.awt.Color(0,0,1,0));
     marks5txt.setBackground(new java.awt.Color(0,0,1,0));
     marks6txt.setBackground(new java.awt.Color(0,0,1,0));
     marks7txt.setBackground(new java.awt.Color(0,0,1,0));
     marks8txt.setBackground(new java.awt.Color(0,0,1,0));
     sub1txt.setBackground(new java.awt.Color(0,0,1,0));
     sub2txt.setBackground(new java.awt.Color(0,0,1,0));
     sub3txt.setBackground(new java.awt.Color(0,0,1,0));
     sub4txt.setBackground(new java.awt.Color(0,0,1,0));
     sub5txt.setBackground(new java.awt.Color(0,0,1,0));
     sub6txt.setBackground(new java.awt.Color(0,0,1,0));
     sub7txt.setBackground(new java.awt.Color(0,0,1,0));
     sub8txt.setBackground(new java.awt.Color(0,0,1,0));
     
     try
     {
         Conn c = new Conn();
         String q ="select * from student";
         ResultSet rs = c.stmt.executeQuery(q);
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
        jLabel19 = new javax.swing.JLabel();
        sub3txt = new javax.swing.JTextField();
        marks3txt = new javax.swing.JTextField();
        subtn = new com.k33ptoo.components.KButton();
        canbtn = new com.k33ptoo.components.KButton();
        btnadd = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        sub7txt = new javax.swing.JTextField();
        marks7txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sub4txt = new javax.swing.JTextField();
        marks4txt = new javax.swing.JTextField();
        sub5txt = new javax.swing.JTextField();
        marks5txt = new javax.swing.JTextField();
        marks6txt = new javax.swing.JTextField();
        sub6txt = new javax.swing.JTextField();
        marks2txt = new javax.swing.JTextField();
        marks1txt = new javax.swing.JTextField();
        sub2txt = new javax.swing.JTextField();
        sub1txt = new javax.swing.JTextField();
        sub8txt = new javax.swing.JTextField();
        marks8txt = new javax.swing.JTextField();
        semcombo = new javax.swing.JComboBox<>();
        choice = new java.awt.Choice();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setBorder(null);
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 0));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Enter Subjects");

        sub3txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub3txt.setForeground(new java.awt.Color(255, 255, 255));
        sub3txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub3txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub3txtActionPerformed(evt);
            }
        });

        marks3txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks3txt.setForeground(new java.awt.Color(255, 255, 255));
        marks3txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks3txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks3txtActionPerformed(evt);
            }
        });

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
        btnadd.setText("Enter Student Marks");
        btnadd.setFocusPainted(false);
        btnadd.setFocusable(false);
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Roll No");

        sub7txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub7txt.setForeground(new java.awt.Color(255, 255, 255));
        sub7txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub7txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub7txtActionPerformed(evt);
            }
        });

        marks7txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks7txt.setForeground(new java.awt.Color(255, 255, 255));
        marks7txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks7txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks7txtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Semester");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Enter Marks");

        sub4txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub4txt.setForeground(new java.awt.Color(255, 255, 255));
        sub4txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub4txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub4txtActionPerformed(evt);
            }
        });

        marks4txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks4txt.setForeground(new java.awt.Color(255, 255, 255));
        marks4txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks4txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks4txtActionPerformed(evt);
            }
        });

        sub5txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub5txt.setForeground(new java.awt.Color(255, 255, 255));
        sub5txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub5txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub5txtActionPerformed(evt);
            }
        });

        marks5txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks5txt.setForeground(new java.awt.Color(255, 255, 255));
        marks5txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks5txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks5txtActionPerformed(evt);
            }
        });

        marks6txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks6txt.setForeground(new java.awt.Color(255, 255, 255));
        marks6txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks6txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks6txtActionPerformed(evt);
            }
        });

        sub6txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub6txt.setForeground(new java.awt.Color(255, 255, 255));
        sub6txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub6txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub6txtActionPerformed(evt);
            }
        });

        marks2txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks2txt.setForeground(new java.awt.Color(255, 255, 255));
        marks2txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks2txtActionPerformed(evt);
            }
        });

        marks1txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks1txt.setForeground(new java.awt.Color(255, 255, 255));
        marks1txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks1txtActionPerformed(evt);
            }
        });

        sub2txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub2txt.setForeground(new java.awt.Color(255, 255, 255));
        sub2txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub2txtActionPerformed(evt);
            }
        });

        sub1txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub1txt.setForeground(new java.awt.Color(255, 255, 255));
        sub1txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1txtActionPerformed(evt);
            }
        });

        sub8txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sub8txt.setForeground(new java.awt.Color(255, 255, 255));
        sub8txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sub8txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub8txtActionPerformed(evt);
            }
        });

        marks8txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marks8txt.setForeground(new java.awt.Color(255, 255, 255));
        marks8txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        marks8txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks8txtActionPerformed(evt);
            }
        });

        semcombo.setBackground(new java.awt.Color(255, 255, 255));
        semcombo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        semcombo.setForeground(new java.awt.Color(255, 255, 255));
        semcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8", " ", " " }));
        semcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semcomboActionPerformed(evt);
            }
        });

        choice.setBackground(new java.awt.Color(255, 255, 255));
        choice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        choice.setForeground(new java.awt.Color(0, 0, 0));

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
                .addGap(70, 70, 70)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(semcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(61, Short.MAX_VALUE))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sub6txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub5txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub7txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub4txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub3txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub8txt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(56, 56, 56)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marks4txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marks7txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marks6txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marks3txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marks5txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marks2txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marks1txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marks8txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(147, 147, 147))))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(jLabel3)
                .addGap(34, 34, 34))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(semcombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(marks1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marks2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marks3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marks4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marks5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(marks6txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marks7txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(marks8txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(sub1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(sub6txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub7txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(sub8txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sub3txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub3txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub3txtActionPerformed

    private void marks3txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks3txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks3txtActionPerformed

    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed
       
        try
        {
            if((sub1txt.getText().length()<=0&&marks1txt.getText().length()<=0)&&(sub2txt.getText().length()<=0&&marks2txt.getText().length()<=0)&&(sub3txt.getText().length()<=0&&marks3txt.getText().length()<=0)&&(sub4txt.getText().length()<=0&&marks4txt.getText().length()<=0)&&(sub5txt.getText().length()<=0&&marks5txt.getText().length()<=0)&&(sub6txt.getText().length()<=0&&marks6txt.getText().length()<=0)&&(sub7txt.getText().length()<=0&&marks7txt.getText().length()<=0)&&(sub8txt.getText().length()<=0&&marks8txt.getText().length()<=0))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Enter at least marks of 1 Subject","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
            Conn c = new Conn();
            String q ="insert into subject values ('"+choice.getSelectedItem()+"','"+semcombo.getSelectedItem()+"','"+sub1txt.getText()+"','"+sub2txt.getText()+"','"+sub3txt.getText()+"','"+sub4txt.getText()+"','"+sub5txt.getText()+"','"+sub6txt.getText()+"','"+sub7txt.getText()+"','"+sub8txt.getText()+"')";
            String q1 ="insert into marks values ('"+choice.getSelectedItem()+"','"+semcombo.getSelectedItem()+"','"+marks1txt.getText()+"','"+marks2txt.getText()+"','"+marks3txt.getText()+"','"+marks4txt.getText()+"','"+marks5txt.getText()+"','"+marks6txt.getText()+"','"+marks7txt.getText()+"','"+marks8txt.getText()+"')";
            c.stmt.executeUpdate(q);
            c.stmt.executeUpdate(q1);
            JOptionPane.showMessageDialog(rootPane, "Marks has been Submitted");
            setVisible(false);
            new home().setVisible(true);}
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

    private void sub7txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub7txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub7txtActionPerformed

    private void marks7txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks7txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks7txtActionPerformed

    private void sub4txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub4txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub4txtActionPerformed

    private void marks4txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks4txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks4txtActionPerformed

    private void sub5txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub5txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub5txtActionPerformed

    private void marks5txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks5txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks5txtActionPerformed

    private void marks6txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks6txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks6txtActionPerformed

    private void sub6txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub6txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub6txtActionPerformed

    private void marks2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks2txtActionPerformed

    private void marks1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks1txtActionPerformed

    private void sub2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub2txtActionPerformed

    private void sub1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub1txtActionPerformed

    private void sub8txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub8txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub8txtActionPerformed

    private void marks8txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks8txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks8txtActionPerformed

    private void semcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semcomboActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnadd;
    private com.k33ptoo.components.KButton canbtn;
    private java.awt.Choice choice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField marks1txt;
    private javax.swing.JTextField marks2txt;
    private javax.swing.JTextField marks3txt;
    private javax.swing.JTextField marks4txt;
    private javax.swing.JTextField marks5txt;
    private javax.swing.JTextField marks6txt;
    private javax.swing.JTextField marks7txt;
    private javax.swing.JTextField marks8txt;
    private javax.swing.JComboBox<String> semcombo;
    private javax.swing.JTextField sub1txt;
    private javax.swing.JTextField sub2txt;
    private javax.swing.JTextField sub3txt;
    private javax.swing.JTextField sub4txt;
    private javax.swing.JTextField sub5txt;
    private javax.swing.JTextField sub6txt;
    private javax.swing.JTextField sub7txt;
    private javax.swing.JTextField sub8txt;
    private com.k33ptoo.components.KButton subtn;
    // End of variables declaration//GEN-END:variables
}
